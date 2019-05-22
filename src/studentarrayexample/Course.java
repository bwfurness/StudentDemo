/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package studentarrayexample;

import java.util.ArrayList;

/**
 *
 */
public class Course {
	private final String courseName;
	private final ArrayList<Student> students;
	private int numberOfStudents;
	
	public Course (String courseName){
		this.courseName = courseName;
		numberOfStudents = 0;
		students = new ArrayList<>();
	}
	
	public String getCourseName(){
		return courseName;
	}
	
	public void addStudent(Student student){
		students.add (student);
		numberOfStudents ++;
	}
	
	public void dropStudent(Student student){
		if (students.contains(student)){
			students.remove(student);
			numberOfStudents --;
		}else{
			System.out.println("Student not found!");
		}
	}
	
	public Student[] getStudents(){
		return students.toArray(new Student[0]);
	}
	
	public int getNumberOfStudents(){
		return numberOfStudents; // pointless variable really.
	}

}
