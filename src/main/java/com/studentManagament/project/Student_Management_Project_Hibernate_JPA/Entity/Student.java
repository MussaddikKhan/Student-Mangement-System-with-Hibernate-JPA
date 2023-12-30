package com.studentManagament.project.Student_Management_Project_Hibernate_JPA.Entity;

import com.studentManagament.project.Student_Management_Project_Hibernate_JPA.Repository.StudentDAO;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name = "Student")
public class Student {
    // Fields;
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;
    private String FirstName;
    private String LastName;
    private  String City;
    private String Email;
    private String  MobileNumber;

    //Constructors
    public Student() {
    }

    public Student(String firstName, String lastName, String city, String email, String mobileNumber) {
        FirstName = firstName;
        LastName = lastName;
        City = city;
        Email = email;
        MobileNumber = mobileNumber;
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getMobileNumber() {
        return MobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        MobileNumber = mobileNumber;
    }

//    To String Methood

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", City='" + City + '\'' +
                ", Email='" + Email + '\'' +
                ", MobileNumber=" + MobileNumber +
                '}';
    }
    
}
