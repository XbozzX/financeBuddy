package com.unemployedgroup.smartexpensetracker.model.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "transactions")
public class TransactionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String category_id;
    private BigDecimal amount;
    private String type;
    private LocalDate transaction_date;
    private String merchant_or_source;
    private String note;
    private String input_method;
    private Long receipt_upload_id;
    private Long voice_entry_id;

    @CreationTimestamp
    private LocalDate created_at;

    @UpdateTimestamp
    private LocalDate updated_at;

    public TransactionEntity() {}

    public TransactionEntity(Long id, String category_id, BigDecimal amount, String type, LocalDate transaction_date, String merchant_or_source, String note, String input_method, Long receipt_upload_id, Long voice_entry_id, LocalDate created_at, LocalDate updated_at) {
        this.id = id;
        this.category_id = category_id;
        this.amount = amount;
        this.type = type;
        this.transaction_date = transaction_date;
        this.merchant_or_source = merchant_or_source;
        this.note = note;
        this.input_method = input_method;
        this.receipt_upload_id = receipt_upload_id;
        this.voice_entry_id = voice_entry_id;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public LocalDate getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDate created_at) {
        this.created_at = created_at;
    }

    public LocalDate getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(LocalDate updated_at) {
        this.updated_at = updated_at;
    }
}

