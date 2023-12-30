package com.studentManagament.project.Student_Management_Project_Hibernate_JPA.Service;

import com.studentManagament.project.Student_Management_Project_Hibernate_JPA.Repository.StudentDAOimpl;

public class DeleteStudent {
    public  static void deleteById(StudentDAOimpl studentDAOimpl){
        studentDAOimpl.deletStudent(1);
    }
    public  static void deleteAllStudent(StudentDAOimpl studentDAOimpl){
        studentDAOimpl.deleteAll();
    }
}
