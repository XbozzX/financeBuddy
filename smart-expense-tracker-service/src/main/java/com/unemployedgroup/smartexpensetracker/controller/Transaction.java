package com.unemployedgroup.smartexpensetracker.controller;

import com.unemployedgroup.smartexpensetracker.model.request.CreateTransactionRequest;
import com.unemployedgroup.smartexpensetracker.model.response.CreateTransactionResponse;
import com.unemployedgroup.smartexpensetracker.model.response.GetTransactionResponse;
import com.unemployedgroup.smartexpensetracker.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/transaction")
public class Transaction {

    @Autowired
    private TransactionService transactionService;

    @PostMapping("/create")
    public ResponseEntity<CreateTransactionResponse> createTransaction(@RequestBody CreateTransactionRequest createTransactionRequest) {
        CreateTransactionResponse createTransactionResponse = transactionService.createTransaction(createTransactionRequest);
        return new ResponseEntity<>(createTransactionResponse, HttpStatus.CREATED);
    }

    @GetMapping("/get-transaction")
    public ResponseEntity<GetTransactionResponse> getTransaction() {
        GetTransactionResponse getTransactionResponse = transactionService.getTransaction();
        return new ResponseEntity<>(getTransactionResponse, HttpStatus.OK);
    }

}
