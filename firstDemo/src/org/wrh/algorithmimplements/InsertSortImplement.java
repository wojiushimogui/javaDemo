package org.wrh.algorithmimplements;
//���������ʵ��
public class InsertSortImplement {

	public static void main(String[] args) {
		int [] a={9,6,8,4,1,2,4,5,7};
		System.out.println("����ǰ����������:");
		for(int i:a){
			System.out.print(i+",");
		}
		System.out.println("");
		
		int temp;
		for (int i=1;i<a.length;i++){
			temp=a[i];
			int j=i-1;
			for(;j>=0;--j){
				if(a[j]>temp){
					a[j+1]=a[j];
				}
				else{
					break;
				}
				
			}
			a[j+1]=temp;
			
		}
		System.out.println("��������������:");
		for(int i:a){
			System.out.print(i+"  ,");
		}
		
		

	}

}
