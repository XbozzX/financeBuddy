package com.unemployedgroup.smartexpensetracker.model.response;


import com.unemployedgroup.smartexpensetracker.model.request.CreateTransactionRequest;
import com.unemployedgroup.smartexpensetracker.model.request.GetTransactionRequest;

import java.util.List;

public class GetTransactionResponse {

    private List<GetTransactionRequest> getTransactionRequestList;

    public GetTransactionResponse(List<GetTransactionRequest> getTransactionRequestList) {
        this.getTransactionRequestList = getTransactionRequestList;
    }

    public List<GetTransactionRequest> getGetTransactionRequestList() {
        return getTransactionRequestList;
    }

    public void setGetTransactionRequestList(List<GetTransactionRequest> getTransactionRequestList) {
        this.getTransactionRequestList = getTransactionRequestList;
    }
}
