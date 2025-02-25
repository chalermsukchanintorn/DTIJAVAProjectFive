package com.dti.workshop;

import java.util.Scanner;

public class AmericanShare {
    private double money;
    private int person;
    private double moneyShare;

    public double getMoneyShare() {
        return moneyShare;
    }

    public void setMoneyShare(double moneyShare) {
        this.moneyShare = moneyShare;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getPerson() {
        return person;
    }

    public void setPerson(int person) {
        this.person = person;
    }

    public void inputMoneyAndPerson(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input money : ");
        setMoney( sc.nextDouble() );
        System.out.print("Input person : ");
        setPerson( sc.nextInt() );
        System.out.println("-------------------");
    }

    public void calMoneyShare(){
        setMoneyShare( getMoney() / getPerson());
    }

    public void showMoneyShare(){
        System.out.println("Money share per person is : " + getMoneyShare());
    }
}
