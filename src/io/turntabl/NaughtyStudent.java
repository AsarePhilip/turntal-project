package io.turntabl;

import java.util.List;

public class NaughtyStudent extends Student {
    public NaughtyStudent(String name, Level level, List<Double> grades) {
        super(name,level,grades);
    }

    @Override
    public Double getAverageGrade(){
        return  super.getAverageGrade()*1.10;
    }

}
