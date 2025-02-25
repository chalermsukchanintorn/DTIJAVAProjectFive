package com.dti.bb;

import com.dti.aa.MyClass03;

public class MyClass04 extends MyClass03 {
    //data member
    public int data1 = 100;
    public int data3 = 30;

    //method member
    @Override
    public void showB(){
        int data3 = 333;
        System.out.println(data3);
        System.out.println("Wow wow wow" + this.data3);
        System.out.println(data1); //100
        System.out.println(super.data1); // 10
        System.out.println(data2); //20
        System.out.println(super.data2); //20
    }

    //constructor
    public MyClass04(){
        System.out.println("Hello...");
    }
}

