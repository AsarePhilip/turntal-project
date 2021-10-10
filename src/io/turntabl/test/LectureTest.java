package io.turntabl.test;

import io.turntabl.Lecture;
import io.turntabl.Level;
import io.turntabl.NaughtyStudent;
import io.turntabl.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LectureTest {
    Lecture lecture;
    Student student1, student2, student3;
    NaughtyStudent student4, student5, student6;;

    @BeforeEach
    void setUp() {

        lecture = new Lecture();
        student1 = new Student( "student1", Level.LEVEL1 ,  Arrays.asList(150.0 ,150.0 ,150.0));
        student2 = new Student("student2", Level.LEVEL2, Arrays.asList(10.0,20.0,30.0,0.0,50.0));
        student3 = new Student( "student3", Level.LEVEL1, Arrays.asList(1.0,2.0,3.0,4.0,5.0));
        student4 = new NaughtyStudent("student4", Level.LEVEL1,  Arrays.asList(51.0,52.0,3.0,55.0,55.0));
        student5 = new NaughtyStudent("student5", Level.LEVEL1, Arrays.asList(150.0,150.0,150.0));
        student6 = new NaughtyStudent("student6", Level.LEVEL1,  Arrays.asList(1.0,2.0,3.0,4.0,5.0));
        lecture.enter(student1);
        lecture.enter(student2);
        lecture.enter(student3);
        lecture.enter(student4);
        lecture.enter(student5);
        lecture.enter(student6);

    }

    @Test
    void testEnterLecture(){
        assertEquals(3, lecture.getStudents().size());
    }


    @Test
    void testGetHighestAverageGrade(){
       // assertTrue(lecture.getHighestAverageGrade());
    }
}