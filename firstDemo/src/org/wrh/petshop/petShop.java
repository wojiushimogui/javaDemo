package org.wrh.petshop;

public class petShop {
		Pet [] pets=null;
		int foot;//定义一个脚标
		public petShop(int len){//宠物店的大小可以通过外部来指定
			if(len>0){
				this.pets=new Pet[len];
			}else this.pets=new Pet[1];//至少为宠物商店提供一个宠物
				
		}
		//增加宠物
		public boolean addPet(Pet pet){//增加宠物
			if(foot<pets.length){
				this.pets[foot]=pet;
				foot++;
				return true;//增加成功
			}
			else return false;//增加失败
		}
		public Pet[] findPet(String keyWord){//根据名字来查询宠物,可能有多个
			Pet [] results=null;
			int count=0;//计数
			for(int i=0;i<this.pets.length;i++){
				if(this.pets[i].getName().indexOf(keyWord)!=-1){
					count++;
				}	
			}
			results=new Pet[count];
			count=0;//计数
			for(int i=0;i<this.pets.length;i++){
				if(this.pets[i].getName().indexOf(keyWord)!=-1){
					results[count]=this.pets[i];
					count++;
				}	
			}
			return results;
			
		}
		//根据价格区间来查找
		public Pet[] findPet(double lowprice,double highprice){
			Pet[] results=null;
			int count=0;
			for(int i=0;i<this.pets.length;i++){
				if(this.pets[i].getPrice()>=lowprice&&this.pets[i].getPrice()<highprice)
					count++;
			}
			results=new Pet[count];
			count=0;
			for(int i=0;i<this.pets.length;i++){
				if(this.pets[i].getPrice()>=lowprice&&this.pets[i].getPrice()<highprice)
					results[count]=this.pets[i];
					count++;
			}
			return results;	
		}
		//根据年龄区间来查找
				public Pet[] findPet(int  lowAge,int highAge){
					Pet[] results=null;
					int count=0;
					for(int i=0;i<this.pets.length;i++){
						if(this.pets[i].getAge()>=lowAge&&this.pets[i].getAge()<highAge)
							count++;
					}
					results=new Pet[count];
					count=0;
					for(int i=0;i<this.pets.length;i++){
						if(this.pets[i].getAge()>=lowAge&&this.pets[i].getAge()<highAge)
							results[count]=this.pets[i];
							count++;
					}
					return results;	
				}


	

}
