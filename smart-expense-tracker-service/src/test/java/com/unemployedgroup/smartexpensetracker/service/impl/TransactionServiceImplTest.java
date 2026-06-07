package com.unemployedgroup.smartexpensetracker.service.impl;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.util.Arrays;

import com.unemployedgroup.smartexpensetracker.model.entity.TransactionEntity;
import com.unemployedgroup.smartexpensetracker.model.request.CreateTransactionRequest;
import com.unemployedgroup.smartexpensetracker.model.response.CreateTransactionResponse;
import com.unemployedgroup.smartexpensetracker.model.response.GetTransactionResponse;
import com.unemployedgroup.smartexpensetracker.repository.TransactionRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TransactionServiceImplTest {

    @Mock
    private TransactionRepository transactionRepository;

    @InjectMocks
    private TransactionServiceImpl transactionService;

    @Test
    void createTransaction_ShouldReturnSuccessResponse() {
        // Arrange
        CreateTransactionRequest request = new CreateTransactionRequest();
        request.setAmount(BigDecimal.valueOf(100.0));
        request.setNote("Dinner");


        // Act
        CreateTransactionResponse response = transactionService.createTransaction(request);

        // Assert
        assertEquals("created!", response.getMsg());
        verify(transactionRepository, times(1)).save(any(TransactionEntity.class));
    }

    @Test
    void getTransaction_ShouldReturnListOfTransactions() {
        // Arrange
        TransactionEntity entity1 = new TransactionEntity();
        entity1.setId(1L);
        entity1.setAmount(BigDecimal.valueOf(50.00));

        TransactionEntity entity2 = new TransactionEntity();
        entity2.setId(2L);
        entity2.setAmount(BigDecimal.valueOf(20.0));

        when(transactionRepository.findAll()).thenReturn(Arrays.asList(entity1, entity2));

        // Act
        GetTransactionResponse response = transactionService.getTransaction();

        // Assert
        assertNotNull(response);
        assertEquals(2, response.getGetTransactionRequestList().size());
        assertEquals(BigDecimal.valueOf(50.0), response.getGetTransactionRequestList().get(0).getAmount());

        verify(transactionRepository, times(1)).findAll();
    }
}