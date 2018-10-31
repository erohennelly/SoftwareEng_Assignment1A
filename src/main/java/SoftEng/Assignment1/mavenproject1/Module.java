package SoftEng.Assignment1.mavenproject1;

import SoftEng.Assignment1.mavenproject1.Student;

//@Eoghan Hennelly

public class Module {
	private String Name;
	private String ID;
	private Student[] Students;
	
	
	public Module(String name, String id, Student[] students) {
		this.Name = name;
		this.ID = id;
		this.Students = students;
	}
	
	public String getName() {
		return this.Name;
	}
	
	public String getID() {
		return this.ID;
	}
	
	public Student[] getStudents() {
		return this.Students;
	}
	
	
	public String setName(String name) {
		this.Name = name;
		return this.Name;
	}
	
	public String setID(String id) {
		this.ID = id;
		return this.ID;
	}
	
	public Student[] setStudents(Student[] students) {
		this.Students = students;
		return this.Students;
	}

}