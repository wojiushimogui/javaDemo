package com.wrh.copy;

public class TestStudent {

	public static void main(String[] args) {
		Professor professor=new Professor("professorA",30);
		Student s1=new Student("wuranghao", 20,professor);
		Student s2=(Student)s1.clone();
		//�ı�s2֮ǰs1�ĸ������Ե�ֵ���£�
		System.out.println("�ı�s2֮ǰs1�ĸ������Ե�ֵ���£�"+s1.getAge()+" "+s1.getName()+" "+s1.getProfessor().getAge()+" "+s1.getProfessor().getName());
		//�޸Ķ���s2,�۲����s1�Ƿ�ı�
		s2.setAge(18);
		s2.setName("�ø�");
		s2.getProfessor().setName("professorB");
		s2.getProfessor().setAge(50);
		System.out.println("�ı�s2֮��s1�ĸ������Ե�ֵ���£�"+s1.getAge()+" "+s1.getName()+" "+s1.getProfessor().getAge()+" "+s1.getProfessor().getName());

	}

}
