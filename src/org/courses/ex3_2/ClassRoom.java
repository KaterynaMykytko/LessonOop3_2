package org.courses.ex3_2;

public class ClassRoom {
   private Pupil [] pupils;

   public ClassRoom(Pupil [] pupils){
       this.pupils = pupils;
   }

   public void show() {
       for (int i = 0; i < pupils.length; i++) {
           System.out.println(pupils[i].getName() + " " + pupils[i].getLast_name());
           pupils[i].study();
           pupils[i].read();
           pupils[i].write();
           pupils[i].relax();
       }
   }
}

