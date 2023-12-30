package com.studentManagament.project.Student_Management_Project_Hibernate_JPA.Service;

import com.studentManagament.project.Student_Management_Project_Hibernate_JPA.Entity.Student;
import com.studentManagament.project.Student_Management_Project_Hibernate_JPA.Repository.StudentDAOimpl;

import java.util.List;

public class DisplayStudent {
    public  static  void displayStudentById(StudentDAOimpl studentDAOimpl){
        System.out.println("Student By Id");
        Student student = studentDAOimpl.find(1);
        System.out.println(student);
    }
    public static void displayStudentByFirstName(StudentDAOimpl studentDAOimpl){
        System.out.println("Student By FistName");
        List<Student> students = studentDAOimpl.findByFirstName("Musaddik");
        for(Student s : students){
            System.out.println(s); 
        }
    }
    public static void displayStudentByLastName(StudentDAOimpl studentDAOimpl){
        System.out.println("Student By LastName");
        List<Student> students = studentDAOimpl.findByLastName("Khan");
        for(Student s : students){
            System.out.println(s);
        }
    }
    public static void displayStudentByCity(StudentDAOimpl studentDAOimpl){
        System.out.println("Student By City");
        List<Student> students = studentDAOimpl.findByCity("Karad");
        for(Student s : students){
            System.out.println(s);
        }
    }
    public static void displayAllStudent(StudentDAOimpl studentDAOimpl){
        System.out.println("All Student");
        List<Student> students = studentDAOimpl.findAll();
        for(Student s : students){
            System.out.println(s);
        }
    }

}
