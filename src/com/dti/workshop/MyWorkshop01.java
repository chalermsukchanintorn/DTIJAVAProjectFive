package com.dti.workshop;

//โปรแกรมคำนวณพื้นที่วงกลม กับเส้นรอบวงกลม โดยรับรัศมีทางแป้นพิมพ์ แล้วแสดงผลทางหน้าจอ
//ให้เขียนโดยใช้หลักการ OOP

import java.util.Scanner;

public class MyWorkshop01 {
    //data member
    //public double radius;
    //public double areaCircle;
    //public double roundCircle;
    private double radius;
    private double areaCircle;
    private double roundCircle;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getAreaCircle() {
        return areaCircle;
    }

    public void setAreaCircle(double areaCircle) {
        this.areaCircle = areaCircle;
    }

    public double getRoundCircle() {
        return roundCircle;
    }

    public void setRoundCircle(double roundCircle) {
        this.roundCircle = roundCircle;
    }

    //method member
    public void inputRadius(){
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------");
        System.out.print("Input radius : ");
        //radius = sc.nextDouble();
        setRadius( sc.nextDouble() );
        System.out.println("--------------------");
    }

    public void calAreaCircle(){
        //areaCircle = Math.PI * radius * radius;
       setAreaCircle( Math.PI * getRadius() *  getRadius( ) );
    }

    public void calRoundCircle(){
        //roundCircle = 2 * Math.PI * radius;
        setRoundCircle( 2 * Math.PI * getRadius() );
    }

    public void showAreaAndRoundCircle(){
        //System.out.println("Area circle is " + areaCircle);
        System.out.println("Area circle is " + getAreaCircle());
        //System.out.println("Round circle is " + roundCircle);
        System.out.println("Round circle is " + getRoundCircle());
        System.out.println("--------------------");
    }
}
