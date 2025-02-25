package com.dti.aa;

public class MyClass03 {
    //data member
    public int data1 = 10;
    public int data2 = 20;

    //method member
    public void showA( ){
        System.out.println("AAA" + data2);
        showB(); //this.showB()
    }

    public void showB( ){
        System.out.println("BBB");
    }

    //constructor
    public MyClass03( ){
        System.out.println("Eiei");
    }

    public MyClass03(String info){
        System.out.println("Hi.." +info);
    }
}
