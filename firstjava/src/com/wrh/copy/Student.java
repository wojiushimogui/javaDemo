package com.wrh.copy;
//将一个类实现Cloneable接口，并将Object中clone（）方法的权限Protected换成public
//这个类的对象就可以被拷贝
public class Student implements Cloneable{
	private String name;
	private int age;
	private Professor professor;
	//将Object中的Protected换成public
	@Override
	public Object clone() {
		Student s=null;
		try {
			s=(Student)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//s.professor=(Professor)this.professor.clone();//Professor实现了Clonable并重写了clone方法，这样就不报错
		return s;
	}
	public Student(String name, int age, Professor professor) {
		super();
		this.name = name;
		this.age = age;
		this.professor = professor;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
}
