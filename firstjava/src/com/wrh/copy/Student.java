package com.wrh.copy;
//��һ����ʵ��Cloneable�ӿڣ�����Object��clone����������Ȩ��Protected����public
//�����Ķ���Ϳ��Ա�����
public class Student implements Cloneable{
	private String name;
	private int age;
	private Professor professor;
	//��Object�е�Protected����public
	@Override
	public Object clone() {
		Student s=null;
		try {
			s=(Student)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//s.professor=(Professor)this.professor.clone();//Professorʵ����Clonable����д��clone�����������Ͳ�����
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
