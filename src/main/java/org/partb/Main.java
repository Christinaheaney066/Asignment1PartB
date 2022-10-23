package org.partb;
import org.example.*;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println(DateTime.parse("12/07/2001" , DateTimeFormat.forPattern("dd/MM/yyyy")));
        StudentClass s1 = new StudentClass("Seamus", 22, DateTime.parse("12/07/2001" , DateTimeFormat.forPattern("dd/MM/yyyy")), 19903432);
        StudentClass s2 = new StudentClass("Heather", 21, DateTime.parse("12/07/2001" , DateTimeFormat.forPattern("dd/MM/yyyy")) , 19903432);
        StudentClass s3 = new StudentClass("Emily", 25,DateTime.parse("12/07/2001", DateTimeFormat.forPattern("dd/MM/yyyy")) ,19903432);
        //adding modules to array list
        ArrayList<String> modules = new ArrayList<>();
        modules.add("Artificial Intelligence");
        modules.add("Programming 2");
        s1.setModules(modules);
        s2.setModules(modules);
        s3.setModules(modules);

        ArrayList<String> courses1 = new ArrayList<>();
        courses1.add("Computer Science");

        s1.setCourses(courses1);
        s2.setCourses(courses1);
        s3.setCourses(courses1);
        //adding students to student array

        LecturerClass l1 = new LecturerClass("Maria", 50, DateTime.parse("10/08/1967" , DateTimeFormat.forPattern("dd/MM/yyyy")), 19441006);
        LecturerClass l2 = new LecturerClass("Ciara", 45,  DateTime.parse("10/08/1967" , DateTimeFormat.forPattern("dd/MM/yyyy")), 19441006);

        ArrayList<String> students = new ArrayList<>();
        students.add(s1.getName());
        students.add(s2.getName());
        students.add(s3.getName());

        l1.setLectModules(modules);
        l2.setLectModules(modules);

        //another students array for the other module
        ArrayList<String> studentother = new ArrayList<>();
        studentother.add(s3.getName());

        org.example.ModuleClass m1 = new org.example.ModuleClass("Artificial Intelligence", "CT1245",  "Maria", students);
        m1.setCourses(courses1);
        org.example.ModuleClass m2 = new org.example.ModuleClass("Programming 2", "CT5678",  "Ciara", students);
        //need.do org.example.module class as there is already a module in intellij


        CourseProgramClass c1 = new CourseProgramClass ("Computer Science", DateTime.parse("01/01/2022", DateTimeFormat.forPattern("dd/MM/yyyy")), DateTime.parse("01/01/2024", DateTimeFormat.forPattern("dd/MM/yyyy")));
        c1.setModules(modules);
        c1.setStudents(students);
        c1.setCourseName("Computer Science");
        CourseProgramClass c2 = new CourseProgramClass("Information Systems", DateTime.parse("01/01/2022", DateTimeFormat.forPattern("dd/MM/yyyy")), DateTime.parse("01/01/2024", DateTimeFormat.forPattern("dd/MM/yyyy")));
        c2.setModules(modules);
        c2.setStudents(students);
        c2.setCourseName("Information Systems");

        s1.getUsername();
        s2.getUsername();
        s3.getUsername();
        l1.getUsername();
        l2.getUsername();

        System.out.println(s1.getCourses());
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(c1);
        System.out.println(c2);


        }



        //creating all the student lecture module and course profiles.

    }
