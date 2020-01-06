package com.example.demo.persistence.entity;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table
@DynamicUpdate
public class DomesticTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID transactionId;

    @Column
    private String senderName;

    @Column
    private String hostName;

    @Column
    private String hostAccountNumber;

    @Column
    private long amount;

    public DomesticTransaction () {
    }

    public DomesticTransaction(String senderName, String hostName, String hostAccountNumber, long amount) {
        this.senderName = senderName;
        this.hostName = hostName;
        this.hostAccountNumber = hostAccountNumber;
        this.amount = amount;
    }

    public UUID getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(UUID id) {
        this.transactionId = id;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getHostAccountNumber() {
        return hostAccountNumber;
    }

    public void setHostAccountNumber(String hostAccountNumber) {
        this.hostAccountNumber = hostAccountNumber;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "DomesticTransaction{" +
                "transactionId=" + transactionId +
                ", senderName='" + senderName + '\'' +
                ", hostName='" + hostName + '\'' +
                ", hostAccountNumber='" + hostAccountNumber + '\'' +
                ", amount=" + amount +
                '}';
    }
}
