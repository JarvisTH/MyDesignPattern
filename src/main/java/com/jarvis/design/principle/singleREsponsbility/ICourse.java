package com.jarvis.design.principle.singleREsponsbility;

/**
 * @author Jarvis(Tang Hui)
 * @version 1.0
 * @date 2020/5/3 15:15
 */
public interface ICourse {
// 2个职责
 String getCourseName();
 byte[] getCourseVideo();

 void studyCourse();
 void refundCourse();
}
