package com.dti.cc;
//ประเภทของคลาส
//1. Normal/Concrete Class, สร้าง Object ได้(new ได้)
class SauClass01 {
    public int aa;
    public void showHello(){
        System.out.println("hello");
    }
}

//2. Abstract Class , สร้าง Object ไม่ได้(new ไม่ได้)
abstract class SauClass02{
    public int aa;
    public void showHello(){
        System.out.println("hello");
    }
    public abstract void showHi();  //abstract method
    public abstract void calSalary();
}

//3. Interface Class, สร้าง Object ไม่ได้(new ไม่ได้)
interface SauClass03{
    //data ทุกตัวต้องเป็น  static final
    public static final int aa = 1000;
    public int bb = 2000;
    //methode ทุกตัวต้องเป็น abstract method
    public abstract void showHi();
    public void showHey();
}

interface SauClass04{
    public int cc = 3000;
}





