package org.wrh.petshop;

public class petShop {
		Pet [] pets=null;
		int foot;//����һ���ű�
		public petShop(int len){//�����Ĵ�С����ͨ���ⲿ��ָ��
			if(len>0){
				this.pets=new Pet[len];
			}else this.pets=new Pet[1];//����Ϊ�����̵��ṩһ������
				
		}
		//���ӳ���
		public boolean addPet(Pet pet){//���ӳ���
			if(foot<pets.length){
				this.pets[foot]=pet;
				foot++;
				return true;//���ӳɹ�
			}
			else return false;//����ʧ��
		}
		public Pet[] findPet(String keyWord){//������������ѯ����,�����ж��
			Pet [] results=null;
			int count=0;//����
			for(int i=0;i<this.pets.length;i++){
				if(this.pets[i].getName().indexOf(keyWord)!=-1){
					count++;
				}	
			}
			results=new Pet[count];
			count=0;//����
			for(int i=0;i<this.pets.length;i++){
				if(this.pets[i].getName().indexOf(keyWord)!=-1){
					results[count]=this.pets[i];
					count++;
				}	
			}
			return results;
			
		}
		//���ݼ۸�����������
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
		//������������������
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
