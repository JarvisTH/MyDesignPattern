package com.jarvis.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jarvis(Tang Hui)
 * @version 1.0
 * @date 2020/5/3 17:37
 */
public class TeamLeader {
    public void checkNumberOfCourse(){
//        v2
        List<Course> list=new ArrayList<Course>();

        for (int i=0;i<20;i++){
            list.add(new Course());
        }
        System.out.println(list.size());
    }
}
