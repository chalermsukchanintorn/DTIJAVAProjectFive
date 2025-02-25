package com.dti.aa;

import com.dti.bb.MyClass02;

public class MyClass01 {
    public static void main(String[] args) {
        MyClass02 ob1 = new MyClass02();

        System.out.println(ob1.num1);
        System.out.println(MyClass02.num1);
        System.out.println(ob1.num2);

        ob1.showHi();
        MyClass02.showHi();
        ob1.showHey();
    }
}


