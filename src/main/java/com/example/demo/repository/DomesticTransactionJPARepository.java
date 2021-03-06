package com.example.demo.repository;

import com.example.demo.persistence.entity.DomesticTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface DomesticTransactionJPARepository extends JpaRepository<DomesticTransaction, Long> {

    List<DomesticTransaction> findBySenderName(String SenderName);



}
