package com.dti.workshop;
//โปรแกรมคำนวณพื้นที่วงกลม กับเส้นรอบวงกลม และปริมาตรทรงกลม โดยรับรัศมีทางแป้นพิมพ์ แล้วแสดงผลทางหน้าจอ
//ให้เขียนโดยใช้หลักการ OOP

public class MyWorkshop02 extends MyWorkshop01{
    //public double cubeCircle;
    private double cubeCircle;

    public double getCubeCircle() {
        return cubeCircle;
    }

    public void setCubeCircle(double cubeCircle) {
        this.cubeCircle = cubeCircle;
    }

    public void calCubeCircle(){
        //cubeCircle = Math.PI * radius * radius * radius * 4 / 3;
        //setCubeCircle(Math.PI * radius * radius * radius * 4 / 3);
        setCubeCircle(Math.PI * getRadius() * getRadius() * getRadius() * 4 / 3);
    }

    @Override
    public void showAreaAndRoundCircle(){
        //System.out.println("Area circle is " + areaCircle);
        System.out.println("Area circle is " + getAreaCircle());
        //System.out.println("Round circle is " + roundCircle);
        System.out.println("Round circle is " + getRoundCircle());
        //System.out.println("Round circle is " + cubeCircle);
        System.out.println("Cube circle is " + getCubeCircle());
        System.out.println("--------------------");
    }
}
