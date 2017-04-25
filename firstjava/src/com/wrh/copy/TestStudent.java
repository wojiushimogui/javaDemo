package com.wrh.copy;

public class TestStudent {

	public static void main(String[] args) {
		Professor professor=new Professor("professorA",30);
		Student s1=new Student("wuranghao", 20,professor);
		Student s2=(Student)s1.clone();
		//改变s2之前s1的各个属性的值如下：
		System.out.println("改变s2之前s1的各个属性的值如下："+s1.getAge()+" "+s1.getName()+" "+s1.getProfessor().getAge()+" "+s1.getProfessor().getName());
		//修改对象s2,观察对象s1是否改变
		s2.setAge(18);
		s2.setName("好哥");
		s2.getProfessor().setName("professorB");
		s2.getProfessor().setAge(50);
		System.out.println("改变s2之后s1的各个属性的值如下："+s1.getAge()+" "+s1.getName()+" "+s1.getProfessor().getAge()+" "+s1.getProfessor().getName());

	}

}
