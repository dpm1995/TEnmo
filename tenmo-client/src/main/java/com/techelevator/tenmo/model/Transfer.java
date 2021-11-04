package com.techelevator.tenmo.model;

import io.cucumber.core.internal.gherkin.StringUtils;

import java.math.BigDecimal;

public class Transfer {
    private Long transferId;
    private Long accountFrom;
    private Long accountTo;
    private BigDecimal amount;
    private int transferTypeId;
    private int transferStatusId;

    public Transfer(){

    }

    public Long getTransferId() {
        return transferId;
    }

    public void setTransferId(Long transferId) {
        this.transferId = transferId;
    }

    public Long getAccountFrom() {
        return accountFrom;
    }

    public void setAccountFrom(Long accountFrom) {
        this.accountFrom = accountFrom;
    }

    public Long getAccountTo() {
        return accountTo;
    }

    public void setAccountTo(Long accountTo) {
        this.accountTo = accountTo;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public int getTransferTypeId() {
        return transferTypeId;
    }

    public void setTransferTypeId(int transferTypeId) {
        this.transferTypeId = transferTypeId;
    }

    public int getTransferStatusId() {
        return transferStatusId;
    }

    public void setTransferStatusId(int transferStatusId) {
        this.transferStatusId = transferStatusId;
    }

    public String toString(){
        return "\n Transfer Details: " +
                "" +
                "ID:     " + transferId +
                "From:   " + accountFrom +
                "To:     " + accountTo +
                "Type:   " + transferTypeId +
                "Status: " + transferStatusId +
                "Amount: " + amount +
                "";
    }
}