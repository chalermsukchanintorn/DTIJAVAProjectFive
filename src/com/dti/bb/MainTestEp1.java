package com.dti.bb;

import com.dti.aa.MyClass03;

public class MainTestEp1 {
    public static void main(String[] args) {
        MyClass03 obA = new MyClass03( );
        System.out.println(obA.data1 + obA.data2);
        obA.showB();
        //++++++++++++++++++++++++
        MyClass04 obB = new MyClass04( );
        //++++++++++++++++++++++++
        MyClass03 obC = new MyClass04( );
    }
}
