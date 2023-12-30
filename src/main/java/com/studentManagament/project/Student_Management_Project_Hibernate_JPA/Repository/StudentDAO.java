package com.studentManagament.project.Student_Management_Project_Hibernate_JPA.Repository;

import com.studentManagament.project.Student_Management_Project_Hibernate_JPA.Entity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student student);
    Student find(Integer Id);
    List<Student>findByFirstName(String FirstName);
    List<Student>findByLastName(String LastName);
    List<Student>findByCity(String City);
    List<Student>findAll();
    void updateStudentFirstName(Integer id);
    void updateStudentLastName(Integer id);
    void updateStudentMobileNo(Integer id);
    void updateStudentCity(Integer id);
    void updateStudentEmail(Integer id);

    void deletStudent(Integer id);
    void deleteAll();
}
