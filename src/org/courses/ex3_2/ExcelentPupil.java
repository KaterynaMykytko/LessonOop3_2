package org.courses.ex3_2;

public class ExcelentPupil extends Pupil {

    public ExcelentPupil(String name, String last_name){
        super(name,last_name);
    }
    @Override
    public void study(){
        System.out.println("I have excelent marks");
    }
    @Override
    public void read(){ System.out.println("I can read perfect"); }
    @Override
    public void write(){
        System.out.println("I can write very well");
    }
    @Override
    public void relax(){
        System.out.println("I can relax very well");
    }
    
}
