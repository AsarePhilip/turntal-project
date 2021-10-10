package io.turntabl.test;

import io.turntabl.Level;
import io.turntabl.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student student1,student2,student3;

    @BeforeEach
    void setUp() {
        student1 = new Student( "student1", Level.LEVEL1, Arrays.asList(51.0,52.0,53.0,54.0,55.0));
        student2 = new Student("student2",  Level.LEVEL1, Arrays.asList(10.0,20.0,30.0,40.0,50.0));
        student3 = new Student( "student3", Level.LEVEL1, Arrays.asList(1.0,2.0,3.0,4.0,5.0));
    }

    @Test
    void getAverageGrade() {
        assertEquals(265, student1.getAverageGrade());
        System.out.println(student2);
    }
}