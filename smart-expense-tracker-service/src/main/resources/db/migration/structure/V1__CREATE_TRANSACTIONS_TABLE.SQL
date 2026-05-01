CREATE TABLE transactions(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    category_id VARCHAR(50),
    amount DECIMAL(12,2),
    type VARCHAR(50),
    transaction_date DATE,
    merchant_or_source VARCHAR(50),
    note VARCHAR(255),
    input_method VARCHAR(50),
    receipt_upload_id BIGINT,
    voice_entry_id BIGINT,
    created_at timestamp,
    updated_at timestamp
)



