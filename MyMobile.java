package week1.day2;

public class MyMobile {

	String model="Honor 8C";
	int cost=12000;
	
	public void makeCall()
	{
		System.out.println("Make call");
		
	}
	
	public void sendMsg()
	{
		System.out.println("Send msg");
	}
	
	private void payBills()
	{
		System.out.println("Paying Bills");
	}
	
	public static void main(String[] args) {
	
		MyMobile obj=new MyMobile();
		
		obj.makeCall();
		obj.sendMsg();
		obj.payBills();
		System.out.println("model=" +obj.model);
	}

}
