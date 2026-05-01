package com.unemployedgroup.smartexpensetracker.model.response;

public class CreateTransactionResponse {

    private String msg;

    public CreateTransactionResponse(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
