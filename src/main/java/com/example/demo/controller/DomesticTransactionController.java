package com.example.demo.controller;

import com.example.demo.persistence.entity.DomesticTransaction;
import com.example.demo.service.DomesticTransactionService;
import org.hibernate.validator.constraints.ParameterScriptAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/domestic-transactions")
public class DomesticTransactionController {


    @Autowired
    DomesticTransactionService domesticTransactionService;

    @GetMapping("/{id}")
    DomesticTransaction findById(@PathVariable Long id) {
        return domesticTransactionService.findById(id);
    }

    @GetMapping
    List<DomesticTransaction> findAll() {
        return domesticTransactionService.findAll();
    }

    @PostMapping
    DomesticTransaction addDomesticTransaction(@RequestBody DomesticTransaction data) {
        return domesticTransactionService.addDomesticTransaction(data);
    }

    @PutMapping
    DomesticTransaction updateDomesticTransaction(@RequestBody DomesticTransaction data) {
        return domesticTransactionService.updateDomesticTransaction(data);
    }

    @DeleteMapping("/{id}")
    void deleteDomesticTransaction(@PathVariable Long id) {
        domesticTransactionService.deleteDomesticTransaction(id);
    }
}
