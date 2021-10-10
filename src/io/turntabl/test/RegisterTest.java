package io.turntabl.test;

import io.turntabl.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {
    Student student1, student2, student3, student4, student5, student6;
    Lecture lecture;
    Register<Student> register;

    @BeforeEach
    void setUp() {

        lecture = new Lecture();
        student1 = new Student( "Student1", Level.LEVEL1, Arrays.asList(150.0 ,150.0 ,150.0));
        student2 = new Student("Student2", Level.LEVEL2,  Arrays.asList(10.0,20.0,30.0,0.0,50.0));
        student3 = new Student( "Student3", Level.LEVEL4, Arrays.asList(1.0,2.0,3.0,4.0,5.0));
        student4 = new NaughtyStudent("Student4", Level.LEVEL1,  Arrays.asList(51.0,52.0,3.0,55.0,55.0));
        student5 = new NaughtyStudent("Student5", Level.LEVEL2, Arrays.asList(150.0,150.0,150.0));
        student6 = new NaughtyStudent("Student6", Level.LEVEL1,  Arrays.asList(1.0,2.0,3.0,4.0,5.0));
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student4);

        register = new Register<Student>(students);
    }

    @Test
    void getRegister() {
        System.out.print(register.getRegister());
        for(String str: register.printReport()){
            System.out.println(str);
        }
    }
}