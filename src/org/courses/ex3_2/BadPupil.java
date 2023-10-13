package org.courses.ex3_2;

public class BadPupil extends Pupil {

    public BadPupil(String name, String last_name){
        super(name,last_name);
    }

    @Override
    public void study(){
        System.out.println("I have bad marks");
    }
    @Override
    public void read(){
        System.out.println("I can read bad");
    }
    @Override
    public void write(){
        System.out.println("I can write bad");
    }
    @Override
    public void relax(){
        System.out.println("I can relax");
    }

}
