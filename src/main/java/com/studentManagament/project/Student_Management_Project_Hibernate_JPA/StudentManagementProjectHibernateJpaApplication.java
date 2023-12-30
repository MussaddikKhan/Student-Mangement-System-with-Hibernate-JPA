package com.studentManagament.project.Student_Management_Project_Hibernate_JPA;

import com.studentManagament.project.Student_Management_Project_Hibernate_JPA.Entity.Student;
import com.studentManagament.project.Student_Management_Project_Hibernate_JPA.Repository.StudentDAOimpl;
import com.studentManagament.project.Student_Management_Project_Hibernate_JPA.Service.DeleteStudent;
import com.studentManagament.project.Student_Management_Project_Hibernate_JPA.Service.DisplayStudent;
import com.studentManagament.project.Student_Management_Project_Hibernate_JPA.Service.StudentCreate;
import com.studentManagament.project.Student_Management_Project_Hibernate_JPA.Service.UpdateStudent;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.DataInput;

@SpringBootApplication
public class StudentManagementProjectHibernateJpaApplication {
	public static void main(String[] args) {
		SpringApplication.run(StudentManagementProjectHibernateJpaApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAOimpl studentDAOimpl) {
		return runner->{
			StudentCreate.createStudent(studentDAOimpl);
			// Find Student
//			DisplayStudent.displayStudentById(studentDAOimpl);
//			DisplayStudent.displayStudentByFirstName(studentDAOimpl);
//			DisplayStudent.displayStudentByLastName(studentDAOimpl);
//			DisplayStudent.displayStudentByCity(studentDAOimpl);
//			System.out.println("--------------------------------------------------------------------------");
//			DisplayStudent.displayAllStudent(studentDAOimpl);
//
//			//Update Student Data
//			UpdateStudent.UpdateStudentFirstName(studentDAOimpl);
//			DisplayStudent.displayAllStudent(studentDAOimpl);
//			System.out.println("--------------------------------------------------------------------------");
//			UpdateStudent.UpdateStudentLastName(studentDAOimpl);
//			DisplayStudent.displayAllStudent(studentDAOimpl);
//			System.out.println("--------------------------------------------------------------------------");
//			UpdateStudent.UpdateStudentCity(studentDAOimpl);
//			DisplayStudent.displayAllStudent(studentDAOimpl);
//			System.out.println("--------------------------------------------------------------------------");
//			UpdateStudent.UpdateStudentEmail(studentDAOimpl);
//			DisplayStudent.displayAllStudent(studentDAOimpl);
//			System.out.println("--------------------------------------------------------------------------");
//			UpdateStudent.UpdateStudentMobile(studentDAOimpl);

			// Delete Students
			DisplayStudent.displayAllStudent(studentDAOimpl);
			System.out.println("--------------------------------------------------------------------------");
//			DeleteStudent.deleteById(studentDAOimpl);
			DeleteStudent.deleteAllStudent(studentDAOimpl);
			DisplayStudent.displayAllStudent(studentDAOimpl);



		};
	}

}
