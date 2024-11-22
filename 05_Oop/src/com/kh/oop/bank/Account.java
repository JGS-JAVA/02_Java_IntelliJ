//package com.kh.oop.bank;
//
///*
// * 계좌
// *
// * */
//public class Account {
//    private String name;
//    private String accountNumber;
//    private double balance; //잔액
//    private String password;
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAccountNumber(String accountNumber) {
//        this.accountNumber = accountNumber;
//    }
//
//    public void setBalance(double balance) {
//        this.balance = balance;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getAccountNumber() {
//        return accountNumber;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void deposit(double amount) {
//        balance += amount;
//        System.out.println(name + "의 현재 잔액: " + balance);
//
//        public void withdraw(double amount){
//            if (amount > balance) {
//                System.out.println("잔액부족");
//                System.out.println("잔액: " + balance);
//
//                return;
//            }
//            if (amount <= 0) {
//                System.out.println("잘못된 입금 금액");
//                return;
//
//            }
//            balance -= amount;
//            System.out.println(name+"잔액"+balance+"원");
//        }
//
//
//
//    }
//}
