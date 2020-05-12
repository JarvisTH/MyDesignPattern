package com.jarvis.design.principle.denpendenceinversion;

/**
 * @author Jarvis(Tang Hui)
 * @version 1.0
 * @date 2020/5/3 14:46
 */
public class Jarvis {
//    public void studyJava(){
//        System.out.println("学习Java");
//    }
//
//    public void studyFront(){
//        System.out.println("学习前端");
//    }

    private ICourse iCourse;

//    v3
//    public Jarvis(ICourse iCourse){
//        this.iCourse=iCourse;
//    }

//    v2
//    public void studyCourse(ICourse iCourse){
//        iCourse.studyCourse();
//    }

    //    v3
    public void studyCourse() {
        this.iCourse.studyCourse();
    }

    //    v4    开放注入
    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }
}
