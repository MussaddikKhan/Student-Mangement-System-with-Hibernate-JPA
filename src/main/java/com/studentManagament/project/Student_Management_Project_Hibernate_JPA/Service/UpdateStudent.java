package com.studentManagament.project.Student_Management_Project_Hibernate_JPA.Service;

import com.studentManagament.project.Student_Management_Project_Hibernate_JPA.Repository.StudentDAOimpl;

public class UpdateStudent {
    public static void UpdateStudentFirstName(StudentDAOimpl studentDAOimpl){
        System.out.println("Update Students FirstName");
        studentDAOimpl.updateStudentFirstName(1);
    }
    public static void UpdateStudentLastName(StudentDAOimpl studentDAOimpl){
        System.out.println("Update Students LastName");
        studentDAOimpl.updateStudentLastName(1);
    }
    public static void UpdateStudentCity(StudentDAOimpl studentDAOimpl){
        System.out.println("Update Students City");
        studentDAOimpl.updateStudentCity(1);
    }
    public static void UpdateStudentEmail(StudentDAOimpl studentDAOimpl){
        System.out.println("Update Students Email");
        studentDAOimpl.updateStudentEmail(1);
    }
    public static void UpdateStudentMobile(StudentDAOimpl studentDAOimpl){
        System.out.println("Update Students Mobile");
        studentDAOimpl.updateStudentMobileNo(1);
    }



}
