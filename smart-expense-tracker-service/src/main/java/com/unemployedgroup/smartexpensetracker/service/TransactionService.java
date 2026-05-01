package com.unemployedgroup.smartexpensetracker.service;

import com.unemployedgroup.smartexpensetracker.model.request.CreateTransactionRequest;
import com.unemployedgroup.smartexpensetracker.model.response.CreateTransactionResponse;

public interface TransactionService {
    CreateTransactionResponse createTransaction(CreateTransactionRequest createTransactionRequest);
}
