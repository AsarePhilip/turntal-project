package io.turntabl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Student student1, student2, student3, student4, student5, student6;
        Lecture lecture;
        Register<Student> register;

        lecture = new Lecture();
        student1 = new Student( "Student1", Level.LEVEL1,  Arrays.asList(150.0 ,150.0 ,150.0));
        student2 = new Student("Student2", Level.LEVEL1,  Arrays.asList(10.0,20.0,30.0,0.0,50.0));
        student3 = new Student( "Student3", Level.LEVEL1, Arrays.asList(1.0,2.0,3.0,4.0,5.0));
        student4 = new NaughtyStudent("Student4", Level.LEVEL1,  Arrays.asList(51.0,52.0,3.0,55.0,55.0));
        student5 = new NaughtyStudent("Student5", Level.LEVEL1, Arrays.asList(150.0,150.0,150.0));
        student6 = new NaughtyStudent("Student6", Level.LEVEL1,  Arrays.asList(1.0,2.0,3.0,4.0,5.0));
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        register = new Register<Student>(students);
        System.out.print(register.getRegister()) ;



    }
}
