package org.courses.ex3_2;

public class Pupil {

    protected String name;
    protected String last_name;

    public Pupil(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() { return last_name; }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void study(){
        System.out.println("I'm studing");
    };
    public void read(){
        System.out.println("I can read");
    };
    public void write(){
        System.out.println("I can write");
    };
    public void relax(){
        System.out.println("I like relax");
    }
}
