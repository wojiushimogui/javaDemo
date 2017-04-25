package org.wrh.menudemo;
public class MenuDemo {
	public MenuDemo(){
		while(true){
			this.show();
		}
	}
	
	public void show(){
		System.out.println("=======Xxx系统=======");
		System.out.println("      【1】查看数据          ");
		System.out.println("      【2】添加数据          ");
		System.out.println("      【3】删除数据           ");
		System.out.println("      【4】查找数据          ");
		System.out.println("      【0】退出程序           ");
		InputData input=new InputData();
		int i=input.getInt("请输入数据","输入的数据必须是整数，");
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
		default : System.out.println("无效的选项");
			}
		}
}

