package com.unemployedgroup.smartexpensetracker.model.request;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CreateTransactionRequest {

    private String category_id;
    private BigDecimal amount;
    private String type;
    private LocalDate transaction_date;
    private String merchant_or_source;
    private String note;
    private String input_method;
    private Long receipt_upload_id;
    private Long voice_entry_id;


    public CreateTransactionRequest() {}

    public CreateTransactionRequest(String category_id, BigDecimal amount, String type, LocalDate transaction_date, String merchant_or_source, String note, String input_method, Long receipt_upload_id, Long voice_entry_id) {
        this.category_id = category_id;
        this.amount = amount;
        this.type = type;
        this.transaction_date = transaction_date;
        this.merchant_or_source = merchant_or_source;
        this.note = note;
        this.input_method = input_method;
        this.receipt_upload_id = receipt_upload_id;
        this.voice_entry_id = voice_entry_id;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getTransaction_date() {
        return transaction_date;
    }

    public void setTransaction_date(LocalDate transaction_date) {
        this.transaction_date = transaction_date;
    }

    public String getMerchant_or_source() {
        return merchant_or_source;
    }

    public void setMerchant_or_source(String merchant_or_source) {
        this.merchant_or_source = merchant_or_source;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getInput_method() {
        return input_method;
    }

    public void setInput_method(String input_method) {
        this.input_method = input_method;
    }

    public Long getReceipt_upload_id() {
        return receipt_upload_id;
    }

    public void setReceipt_upload_id(Long receipt_upload_id) {
        this.receipt_upload_id = receipt_upload_id;
    }

    public Long getVoice_entry_id() {
        return voice_entry_id;
    }

    public void setVoice_entry_id(Long voice_entry_id) {
        this.voice_entry_id = voice_entry_id;
    }
}
