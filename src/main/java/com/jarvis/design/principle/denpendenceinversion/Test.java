package com.jarvis.design.principle.denpendenceinversion;

/**
 * @author Jarvis(Tang Hui)
 * @version 1.0
 * @date 2020/5/3 14:47
 */
public class Test {

//    v1
//    public static void main(String[] args) {
//        Jarvis jarvis=new Jarvis();
//        jarvis.studyJava();
//        jarvis.studyFront();
//
//    }

//    v2
//    public static void main(String[] args) {
//        Jarvis jarvis=new Jarvis();
//        jarvis.studyCourse(new JavaCourse());
//        jarvis.studyCourse(new PythonCourse());
//        jarvis.studyCourse(new FrontCourse());
//    }

//    v3    单例场景中适用
//    public static void main(String[] args) {
//        Jarvis jarvis=new Jarvis(new JavaCourse());
//        jarvis.studyCourse();
//    }

    public static void main(String[] args) {
        Jarvis jarvis = new Jarvis();
        jarvis.setiCourse(new JavaCourse());
        jarvis.studyCourse();
        jarvis.setiCourse(new FrontCourse());
        jarvis.studyCourse();
    }

}
