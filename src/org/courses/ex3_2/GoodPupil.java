package org.courses.ex3_2;

public class GoodPupil extends Pupil {

    public GoodPupil(){}

    @Override
    public void study(){ System.out.println("I have good marks"); }
    @Override
    public void read(){ System.out.println("I can read good"); }
    @Override
    public void write(){
        System.out.println("I can write well");
    }
    @Override
    public void relax(){
        System.out.println("I can relax good");
    }
}
