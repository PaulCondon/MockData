/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mockdata;


import com.mycompany.studentregsystem.course;
import com.mycompany.studentregsystem.module;
import com.mycompany.studentregsystem.student;
import java.util.ArrayList;
import org.joda.time.DateTime;

/**
 *
 * @author Paul
 */
public class MockDataTest {
    
    public static void main(String args[]){
        
        //public student(String name, int age, String DOB, long ID, ArrayList regCourses, ArrayList regModules) {

    student sam = new student("Sam", 21, "10/30/97", 15350786, "Civil", "Maths, Structures");
    student tim = new student("Tim", 21, "11/30/97", 15350789, "Electronic Engineering", "Maths, Circuits");
    student max = new student("Max", 21, "12/30/97", 15350780, "Civil", "Maths, Structures");  
   
    
    //module(String moduleName, String moduleID, ArrayList students, ArrayList courses)
    module maths = new module("Maths", "CE111", sam.getName()+", "+tim.getName(), "Civil" );
    module structures = new module("Structures", "CE222", sam.getName()+", "+tim.getName(), "Civil" );
    module circuits = new module("Circuits", "ECE333", max.getName(), "Electronic Engineering" );
    
    
    DateTime StartDate = new DateTime(10/9/18);
    DateTime EndDate = new DateTime(18/10/12);

    //public course(String courseName, ArrayList modules, ArrayList students, DateTime startDate, DateTime endDate) {
    course civil = new course("Civil", "Maths, Structures", structures.getStudents(), StartDate, StartDate );
    course electronicEng = new course("Electronic Engineering", "Maths, Circuits", "Max", EndDate, EndDate );

//    should print out a list of all the courses, their respective modules, and all students,
//    their usernames, assigned modules and the course(s) they are registered for to the console.
      

    System.out.println(civil.getCourseName() + ", Modules: " + civil.getModules());
    System.out.println(electronicEng.getCourseName() + ", Modules: " + electronicEng.getModules());
    System.out.println(sam.getName()+", Username: "+sam.getUsername()+", Modules: "+sam.getRegModules()+ ", Course: "+ sam.getRegCourses());
    System.out.println(tim.getName()+", Username: "+tim.getUsername()+", Modules: "+tim.getRegModules()+ ", Course: "+ tim.getRegCourses());
    System.out.println(max.getName()+", Username: "+max.getUsername()+", Modules: "+max.getRegModules()+ ", Course: "+ max.getRegCourses());


    }
}
