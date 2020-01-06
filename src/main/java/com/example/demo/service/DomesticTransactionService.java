package com.example.demo.service;

import com.example.demo.exception.IdValidationException;
import com.example.demo.exception.MissingParameterException;
import com.example.demo.exception.TooLongException;
import com.example.demo.exception.ValidationException;
import com.example.demo.persistence.entity.DomesticTransaction;
import com.example.demo.repository.DomesticTransactionJPARepository;
import com.example.demo.repository.DomesticTransactionRepositoryInMemory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class DomesticTransactionService {

    @Autowired
    private DomesticTransactionJPARepository domesticTransactionJPARepository;

    public DomesticTransaction findById(Long id) {
        return domesticTransactionJPARepository.findById(id).orElse(null);
    }

    public List<DomesticTransaction> findAll() {
        return domesticTransactionJPARepository.findAll();
    }

    public DomesticTransaction addDomesticTransaction(DomesticTransaction data) {
            if (data.getTransactionId() != null) {
                throw new IdValidationException();
            }
            validateSenderName(data);
            validateHostName(data);
            validateHostAccountNumber(data);
            validateAmount(data);
            return domesticTransactionJPARepository.save(data);
    }

    public DomesticTransaction updateDomesticTransaction(DomesticTransaction data) {
        /*if (data.getTransactionId() == null) {
            return domesticTransactionRepositoryInMemory.addDomesticTransaction(data);
        }*/
        validateSenderName(data);
        validateHostName(data);
        validateHostAccountNumber(data);
        validateAmount(data);
        return domesticTransactionJPARepository.save(data);
    }

    public void deleteDomesticTransaction(Long id) {
        domesticTransactionJPARepository.deleteById(id);
    }

    public void validateSenderName(DomesticTransaction data) {
        if (StringUtils.isEmpty(data.getSenderName())) {
            throw new MissingParameterException();
        }
        if (data.getSenderName().equals(data.getHostName())) {
            throw new ValidationException("Hostname and Sendername cannot be equal.");
        }
    }

    public void validateHostName(DomesticTransaction data) {
        if (StringUtils.isEmpty(data.getHostName())) {
            throw new MissingParameterException();
        }
        if (data.getSenderName().equals(data.getHostName())) {
            throw new ValidationException("Hostname and Sendername cannot be equal.");
        }
        if (data.getHostName().length() > 20) {
            throw new ValidationException("Name cannot be more than 20 characters");
        }
    }

    public void validateHostAccountNumber(DomesticTransaction data) {
        if (StringUtils.isEmpty(data.getHostAccountNumber())) {
            throw new MissingParameterException();
        }
        long count = data.getHostAccountNumber().chars().filter(c -> Character.isDigit(c)).count();
        if (count > 16) {
            throw new TooLongException();
        }
        if(!data.getHostAccountNumber().matches("\\d{8}(-)?\\d{8}")) {
            throw new ValidationException("Format not good");
        }
    }

    public void validateAmount(DomesticTransaction data) {
        if (data.getAmount() <= 0 || data.getAmount() > 999999999999l) {
            throw new ValidationException("Amount needs to be between 1 and 999 999 999 999");
        }
    }
}
