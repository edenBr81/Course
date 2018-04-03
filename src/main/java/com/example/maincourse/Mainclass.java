package com.example.maincourse;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Mainclass {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        Course newCourse;
        ArrayList<Course> courses = new ArrayList<>();
        for (int i = 1; i <5; i++) {
            newCourse = new Course();
            System.out.println("Enter your course Number");
            newCourse.setCourseNumber(scan.nextLine());
            System.out.println("Enter your Course Name");
            newCourse.setCourseName(scan.nextLine());
            System.out.println("Enter your Room Number");
            newCourse.setRoomNumber(scan.nextLine());
            System.out.println("Enter Semester");
            newCourse.setSemester(scan.nextLine());
            System.out.println("Enter Year");
            newCourse.setYear(scan.nextLine());
            System.out.println("Your course now contains " +newCourse.toString());
            courses.add(newCourse);
        }

        for(Course eachCourse:courses)
        {

            System.out.println("Course Number:"+eachCourse.getCourseNumber());
            System.out.println("Course Name:"+eachCourse.getCourseName());
            System.out.println("Room Number:"+eachCourse.getRoomNumber());
            System.out.println("Semester:"+eachCourse.getSemester());
            System.out.println("Year:"+eachCourse.getYear());
            System.out.println("Course's contents:"+eachCourse.toString());
        }
    }
}
