package com.dti.cc;

class Dti001 extends SauClass02{
    @Override
    public void showHi(){
        System.out.println("Hi....");
    }

    public void showHey(){
        System.out.println("Hey....");
    }

    @Override
    public void calSalary(){ }
}

class Dti002 extends SauClass02{
    @Override
    public void showHi(){
        System.out.println("Hi..Hi..Hi..");
    }

    @Override
    public void calSalary(){ }
}

class Dti003 implements SauClass03, SauClass04{
    @Override
    public void showHi(){ }

    @Override
    public void showHey(){ }
}


public class Dti {
    public static void main(String[] args) {
        SauClass01 ob1 = new SauClass01();
        //SauClass02 ob2 = new SauClass02(); Error
        //SauClass03 ob3 = new SauClass03(); Error
        Dti001 ob2 = new Dti001();
        Dti003 ob3 = new Dti003();
        System.out.println(ob3.aa);
        System.out.println(ob3.bb);
        System.out.println(ob3.cc);
    }
}
