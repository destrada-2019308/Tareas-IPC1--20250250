package org.diegoestrada.controller;

import org.diegoestrada.bean.Course;

public class CourseController {

    public static Course[] course = new Course[100];

    public static int totalCourses =0;

    //Create methods
    public boolean createCourse(Course newCourse){
        for(int i=0; i < course.length; i++){
            if(course[i] == null){
                course[i] = newCourse;
                totalCourses++;
                return true;
            }
        }
        return false;
    }

    public static void showAllCourse(){
        for(int i=0; i<totalCourses; i++){
            System.out.println(course[i]);
        }
    }

}
