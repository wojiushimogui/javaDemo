package org.wrh.petshop;

public class testPet {

	public static void main(String[] args) {
		petShop petshop=new petShop(4);
		Dog dog1=new Dog("�ڹ�",2,98);//���ӳɹ�
		Dog dog2=new Dog("�׹�",1,198);//���ӳɹ�
		Cat cat1=new Cat("��è",2,12);//���ӳɹ�
		Cat cat2=new Cat("��è",3,32);//���ӳɹ�
		Cat cat3=new Cat("Сè",1,10);//����ʧ��
		petshop.addPet(dog1);
		petshop.addPet(dog2);
		petshop.addPet(cat1);
		petshop.addPet(cat2);
		petshop.addPet(cat3);
		
		Pet []p1=petshop.findPet("��");//��������������
			//for(int i=0;i<p.length;i++)
				//System.out.println(p[i]);
		System.out.println("���ݳ��������ҵ��Ľ�����£�");
		if(p1.length==0)
			System.out.println("û���ҵ�");
		else{

			for(Pet pe:p1)//����������������
				System.out.println(pe);
		}
		//���ݼ۸�������
		Pet [] p2=petshop.findPet(1,5);
		//for(int i=0;i<p.length;i++)
			//System.out.println(p[i]);
		System.out.println("���������ҵ��Ľ�����£�");
		if(p2.length==0)
			System.out.println("û���ҵ�");
		else{
				
				for(Pet pe:p2)//����������������
					System.out.println(pe);
			}
	

	}

}
