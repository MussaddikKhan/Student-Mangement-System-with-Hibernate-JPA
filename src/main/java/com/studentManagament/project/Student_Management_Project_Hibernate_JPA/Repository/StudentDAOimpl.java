package com.studentManagament.project.Student_Management_Project_Hibernate_JPA.Repository;

import com.studentManagament.project.Student_Management_Project_Hibernate_JPA.Entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDAOimpl implements StudentDAO{

    private EntityManager entityManager;

    // Constructor Injection
    @Autowired
    StudentDAOimpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    // Create New Student
    @Override
    @Transactional
    public void save(Student student) {
           entityManager.persist(student);
    }


    // Find Student / Select Student
    @Override
    public Student find(Integer Id) {
        return entityManager.find(Student.class, Id);
    }

    @Override
    public List<Student> findByFirstName(String FirstName) {
        TypedQuery<Student>theQuery = entityManager.createQuery("From Student WHERE FirstName =: firstName", Student.class);
        theQuery.setParameter("firstName", FirstName);
        return theQuery.getResultList();
    }

    @Override
    public List<Student> findByLastName(String LastName) {
        TypedQuery<Student>theQuery = entityManager.createQuery("From Student WHERE LastName =: lastName", Student.class);
        theQuery.setParameter("lastName", LastName);
        return theQuery.getResultList();
    }

    @Override
    public List<Student> findByCity(String City) {
        TypedQuery<Student>theQuery = entityManager.createQuery("From Student WHERE City =: city", Student.class);
        theQuery.setParameter("city", City);
        return theQuery.getResultList(); 
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student>theQuery = entityManager.createQuery("From Student",Student.class);

        return theQuery.getResultList();
    }
    
    //Update Wala Section
    @Override
    @Transactional
    public void updateStudentFirstName(Integer id) {
        //First Find The Student;
        Student theStudent = find(id);
        theStudent.setFirstName("Musa");
        entityManager.merge(theStudent);
    }




    @Override
    @Transactional
    public void updateStudentLastName(Integer id) {
        Student theStudent = find(id);
        theStudent.setLastName("Bhai");
        entityManager.merge(theStudent);
    }

    @Override
    @Transactional
    public void updateStudentMobileNo(Integer id) {
        Student theStudent = find(id);
        theStudent.setMobileNumber("9809809900");
        entityManager.merge(theStudent);
    }

    @Override
    @Transactional
    public void updateStudentCity(Integer id) {
        Student theStudent = find(id);
        theStudent.setCity("Bhuinj");
        entityManager.merge(theStudent);
    }

    @Override
    @Transactional
    public void updateStudentEmail(Integer id) {
        Student theStudent = find(id);
        theStudent.setEmail("musaddik@gmail.com");
        entityManager.merge(theStudent);
    }

    // Deletions 
    @Override
    @Transactional
    public void deletStudent(Integer id) {
        System.out.println("Deleted Student is ");
        Student student = find(id);
        System.out.println(student);
        entityManager.remove(student);
    }
    @Override
    @Transactional
    public void deleteAll() {
        int numRowsDeleted = entityManager.createQuery("DELETE FROM Student").executeUpdate();
        System.out.println("delete student Count " + numRowsDeleted);
    }



}
