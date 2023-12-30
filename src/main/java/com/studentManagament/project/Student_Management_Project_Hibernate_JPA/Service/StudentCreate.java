package com.studentManagament.project.Student_Management_Project_Hibernate_JPA.Service;

import com.studentManagament.project.Student_Management_Project_Hibernate_JPA.Entity.Student;
import com.studentManagament.project.Student_Management_Project_Hibernate_JPA.Repository.StudentDAOimpl;

public  class StudentCreate {
    public static void  createStudent(StudentDAOimpl studentDAOimpl){
     Student  student = new Student("Musaddik", "Khan", "Karad", "Musa@Musa.com","7890789009");

    Student  student1 = new Student("Musaddik", "Khan", "Karad", "Musa@Musa.com","7890789009");
    
    studentDAOimpl.save(student);
    studentDAOimpl.save(student1);
    System.out.println("The Sutdent is Created");

    }
}
