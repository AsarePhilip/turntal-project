package io.turntabl;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Lecture {
    List<Student> students;

    public Lecture(){
        this.students = new ArrayList<>();
    }

    public void enter(Student student){
        this.students.add(student);
    }

    public Double getHighestAverageGrade(){
        Double total = 0.0;
        Double maxScore = students.get(0).getAverageGrade();
        for( int i =1; i<students.size(); i++){
            if( students.get(i).getAverageGrade() > maxScore ){
                maxScore = students.get(i).getAverageGrade();
            }
        }
        return maxScore;
    }


    public List<Student> getStudents() {
        return students;
    }
}
