package org.courses.ex3_2;

public class Main {
    public static void main(String[] args) {
        Pupil [] pupils = new Pupil[4];

        Pupil pupil = new Pupil();
        Pupil goodPupil = new GoodPupil();
        Pupil badPupil = new BadPupil();
        Pupil excelentPupil = new ExcelentPupil();

        goodPupil.setName("Kateryna");
        goodPupil.setLast_name("Mykytko");

        badPupil.setName("Ivan");
        badPupil.setLast_name("Skvortsov");

        excelentPupil.setName("Daria");
        excelentPupil.setLast_name("Mykytko");

        pupil.setName("Andrii");
        pupil.setLast_name("Shevchenko");

        pupils[0] = goodPupil;
        pupils[1] = badPupil;
        pupils[2] = excelentPupil;
        pupils[3] = pupil;

        ClassRoom classRoom = new ClassRoom(pupils);
        classRoom.show();

    }
}
