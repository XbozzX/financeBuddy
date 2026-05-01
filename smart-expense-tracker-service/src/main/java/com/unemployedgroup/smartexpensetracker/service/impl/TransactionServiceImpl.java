package com.unemployedgroup.smartexpensetracker.service.impl;

import com.unemployedgroup.smartexpensetracker.model.entity.TransactionEntity;
import com.unemployedgroup.smartexpensetracker.model.request.CreateTransactionRequest;
import com.unemployedgroup.smartexpensetracker.model.response.CreateTransactionResponse;
import com.unemployedgroup.smartexpensetracker.repository.TransactionRepository;
import com.unemployedgroup.smartexpensetracker.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public CreateTransactionResponse createTransaction(CreateTransactionRequest createTransactionRequest) {

        TransactionEntity transactionEntity = new TransactionEntity();
        transactionEntity.setCategory_id(createTransactionRequest.getCategory_id());
        transactionEntity.setAmount(createTransactionRequest.getAmount());
        transactionEntity.setType(createTransactionRequest.getType());
        transactionEntity.setTransaction_date(createTransactionRequest.getTransaction_date());
        transactionEntity.setMerchant_or_source(createTransactionRequest.getMerchant_or_source());
        transactionEntity.setNote(createTransactionRequest.getNote());
        transactionEntity.setInput_method(createTransactionRequest.getInput_method());
        transactionEntity.setReceipt_upload_id(createTransactionRequest.getReceipt_upload_id());
        transactionEntity.setVoice_entry_id(createTransactionRequest.getVoice_entry_id());

        transactionRepository.save(transactionEntity);

        return new CreateTransactionResponse("created!");
    }
}

