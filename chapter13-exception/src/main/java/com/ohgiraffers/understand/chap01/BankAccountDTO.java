package main.java.com.ohgiraffers.understand.chap01;

public class BankAccountDTO {

    private int bankAccountNumber;
    private String accountOwnerName;
    private int balance;

    public BankAccountDTO() {
    }

    public BankAccountDTO(int balance, String accountOwnerName, int bankAccountNumber) {
        this.balance = balance;
        this.accountOwnerName = accountOwnerName;
        this.bankAccountNumber = bankAccountNumber;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getAccountOwnerName() {
        return accountOwnerName;
    }

    public void setAccountOwnerName(String accountOwnerName) {
        this.accountOwnerName = accountOwnerName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccountDTO{" +
                "bankAccountNumber=" + bankAccountNumber +
                ", accountOwnerName='" + accountOwnerName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
