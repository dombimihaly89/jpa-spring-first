package com.example.demo.DomesticTransaction;

import com.example.demo.exception.IdValidationException;
import com.example.demo.exception.MissingParameterException;
import com.example.demo.exception.TooLongException;
import com.example.demo.exception.ValidationException;
import com.example.demo.persistence.entity.DomesticTransaction;
import com.example.demo.repository.DomesticTransactionRepositoryInMemory;
import com.example.demo.service.DomesticTransactionService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

public class DomesticTransactionTest {
/*

    @InjectMocks
    DomesticTransactionService domesticTransactionService;

    @Mock
    DomesticTransactionRepositoryInMemory domesticTransactionRepositoryInMemory;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void findAll() {
        when(domesticTransactionRepositoryInMemory.findAll()).thenReturn(List.of(new DomesticTransaction()));
        List<DomesticTransaction> list = domesticTransactionService.findAll();
        assertEquals(1, list.size());
    }

    @Test
    public void findById() {
        UUID id = UUID.randomUUID();
        DomesticTransaction tr = getTransaction(id);
        when(domesticTransactionRepositoryInMemory.findById(id)).thenReturn(tr);
        DomesticTransaction transaction = domesticTransactionService.findById(id);
        assertEquals(transaction, tr);
    }

    @Test
    public void addDomesticTransaction() {
        DomesticTransaction tr = getTransaction(null);
        when(domesticTransactionRepositoryInMemory.addDomesticTransaction(tr)).thenReturn(getTransaction(UUID.randomUUID()));
        DomesticTransaction transaction = domesticTransactionService.addDomesticTransaction(tr);
        assertNotNull(transaction);
        assertNotNull(transaction.getTransactionId());
        assertNotNull(transaction.getHostName());
        assertNotNull(transaction.getSenderName());
        assertNotNull(transaction.getAmount());
        assertNotNull(transaction.getHostAccountNumber());
    }

    @Test
    public void updateDomesticTransaction() {
        DomesticTransaction tr = getTransaction(UUID.randomUUID());
        DomesticTransaction trWithoutId = getTransaction(null);
        when(domesticTransactionRepositoryInMemory.updateDomesticTransaction(tr)).thenReturn(tr);
        when(domesticTransactionRepositoryInMemory.addDomesticTransaction(trWithoutId)).thenReturn(tr);
        Assert.assertEquals(domesticTransactionService.updateDomesticTransaction(tr), tr);
        Assert.assertEquals(domesticTransactionService.updateDomesticTransaction(trWithoutId), tr);
    }

    @Test
    public void deleteDomesticTransaction() {
        UUID id = UUID.randomUUID();
        DomesticTransaction tr = getTransaction(id);
        when(domesticTransactionRepositoryInMemory.deleteDomesticTransaction(id)).thenReturn(tr);
        Assert.assertEquals(domesticTransactionService.deleteDomesticTransaction(id), tr);
    }

    @Test(expected = IdValidationException.class)
    public void validationExceptionTest() {
        DomesticTransaction tr = getTransaction(UUID.randomUUID());
        domesticTransactionService.addDomesticTransaction(tr);
    }

    @Test(expected = MissingParameterException.class)
    public void senderNameTest() {
        DomesticTransaction tr = getTransaction(null);
        tr.setSenderName("");
        domesticTransactionService.addDomesticTransaction(tr);
    }

    @Test(expected = MissingParameterException.class)
    public void hostNameTest() {
        DomesticTransaction tr = getTransaction(null);
        tr.setHostName("");
        domesticTransactionService.addDomesticTransaction(tr);
    }

    @Test(expected = ValidationException.class)
    public void senderNameHostNameEqualityTest() {
        DomesticTransaction tr = getTransaction(null);
        tr.setHostName(tr.getSenderName());
        domesticTransactionService.addDomesticTransaction(tr);
    }

    @Test(expected = ValidationException.class)
    public void hostNameLengthTest() {
        DomesticTransaction tr = getTransaction(null);
        tr.setHostName("a".repeat(21));
        domesticTransactionService.addDomesticTransaction(tr);
    }

    @Test(expected = MissingParameterException.class)
    public void hostAccountNumber() {
        DomesticTransaction tr = getTransaction(null);
        tr.setHostAccountNumber("");
        domesticTransactionService.addDomesticTransaction(tr);
    }

    @Test(expected = TooLongException.class)
    public void hostAccountNumberLongTest() {
        DomesticTransaction tr = getTransaction(null);
        tr.setHostAccountNumber("123123123-12345678");
        domesticTransactionService.addDomesticTransaction(tr);
    }

    @Test(expected = ValidationException.class)
    public void hostAccountFormatTest() {
        DomesticTransaction tr = getTransaction(null);
        tr.setHostAccountNumber("1234-123412345678");
        domesticTransactionService.addDomesticTransaction(tr);
    }

    @Test(expected = ValidationException.class)
    public void amountTest() {
        DomesticTransaction tr = getTransaction(null);
        tr.setAmount(0);
        domesticTransactionService.addDomesticTransaction(tr);
    }





    public DomesticTransaction getTransaction(UUID id) {
        DomesticTransaction transaction = new DomesticTransaction("Misi", "Dina", "12345678-12345678", 15);
        transaction.setTransactionId(id);
        return transaction;
    }

*/

}
