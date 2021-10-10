package io.turntabl;

import java.util.List;
import java.util.stream.Collectors;

public class Student implements Nameable,HasLevel {
    private List<Double> grades;
    private String name;
    private  Level level;

    public Student(String name,Level level,List<Double> grades){
        this.name = name;
        this.grades = grades;
        this.level = level;
    }

    public Double getAverageGrade(){
        return this.grades.stream().reduce(0.0, Double::sum);
    }

    @Override
    public String toString(){
        String strGrade ="Grades: ";
        for(Double studentGrade : this.grades){
            strGrade += String.valueOf(studentGrade) + ", ";
        }
        return strGrade.substring(0, strGrade.length()-2);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Level getLevel() {
        return this.level;
    }
}
