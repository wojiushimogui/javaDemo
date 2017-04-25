package org.wrh.petshop;

public class testPet {

	public static void main(String[] args) {
		petShop petshop=new petShop(4);
		Dog dog1=new Dog("黑狗",2,98);//增加成功
		Dog dog2=new Dog("白狗",1,198);//增加成功
		Cat cat1=new Cat("白猫",2,12);//增加成功
		Cat cat2=new Cat("黑猫",3,32);//增加成功
		Cat cat3=new Cat("小猫",1,10);//增加失败
		petshop.addPet(dog1);
		petshop.addPet(dog2);
		petshop.addPet(cat1);
		petshop.addPet(cat2);
		petshop.addPet(cat3);
		
		Pet []p1=petshop.findPet("狗");//根据名字来查找
			//for(int i=0;i<p.length;i++)
				//System.out.println(p[i]);
		System.out.println("根据宠物名字找到的结果如下：");
		if(p1.length==0)
			System.out.println("没有找到");
		else{

			for(Pet pe:p1)//利用数组的引用输出
				System.out.println(pe);
		}
		//根据价格来查找
		Pet [] p2=petshop.findPet(1,5);
		//for(int i=0;i<p.length;i++)
			//System.out.println(p[i]);
		System.out.println("根据年龄找到的结果如下：");
		if(p2.length==0)
			System.out.println("没有找到");
		else{
				
				for(Pet pe:p2)//利用数组的引用输出
					System.out.println(pe);
			}
	

	}

}
