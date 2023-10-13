package org.courses.ex3_2;

public class Main {
    public static void main(String[] args) {
        Pupil [] pupils = new Pupil[4];

        Pupil pupil = new Pupil("Andrii","Shevchenko");
        Pupil goodPupil = new GoodPupil("Kateryna","Mykytko");
        Pupil badPupil = new BadPupil("Ivan","Skvortsov");
        Pupil excelentPupil = new ExcelentPupil("Daria","Mykytko");

        pupils[0] = goodPupil;
        pupils[1] = badPupil;
        pupils[2] = excelentPupil;
        pupils[3] = pupil;

        ClassRoom classRoom = new ClassRoom(pupils);
        classRoom.show();

    }
}
