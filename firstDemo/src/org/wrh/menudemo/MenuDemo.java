package org.wrh.menudemo;
public class MenuDemo {
	public MenuDemo(){
		while(true){
			this.show();
		}
	}
	
	public void show(){
		System.out.println("=======Xxxϵͳ=======");
		System.out.println("      ��1���鿴����          ");
		System.out.println("      ��2���������          ");
		System.out.println("      ��3��ɾ������           ");
		System.out.println("      ��4����������          ");
		System.out.println("      ��0���˳�����           ");
		InputData input=new InputData();
		int i=input.getInt("����������","��������ݱ�����������");
		switch(i){
		case 1:{ 
				Operator.see();
					break;
				}
		case 2:{
				Operator.add();
				break;
				}
		case 3:{
				Operator.delete();
				break;
				}
		case 4:{
				Operator.find();
				break;
				}
		case 0:{
				Operator.find();
				break;
				}
		default : System.out.println("��Ч��ѡ��");
			}
		}
}

