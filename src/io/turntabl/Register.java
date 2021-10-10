package io.turntabl;

import java.util.*;
import java.util.stream.Collectors;

public class Register< T extends HasLevel & Nameable> {
    List<T> myList;

    public Register( List<T> list){
        this.myList = list;
    }

    public List<String> getRegister(){
        return  myList.stream().map(l-> l.getName()).collect(Collectors.toList());
    }

    public List<String> getRegisterByLevel(Level level){
        return  this.myList.stream().filter(s-> s.getLevel()== level).map(s->s.getName()).collect(Collectors.toList());
    }

    public Map<String,String> printReport(){
        List<String> strSet =  (List) myList.stream().map(l-> l.getLevel().name()).collect(Collectors.toSet());
        String[] strArr = new String[strSet.size()];
         for(int i=0; i<myList.size(); i++){
             if(myList.get(i).getLevel().name() == strSet.get(i)){

             }
        }
        return levelMap;
    }
}
