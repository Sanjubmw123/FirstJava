package WORKS5;

public class loadmethod {

	public static void main(String[] args) {
		motor m=new motor();
	m.car();
	m.car(1);
	m.car("");
	m =new motor();
	m.car1("");
   System.out.println(m.car1("tesla"));
	}

	
	
	public static class motor{
	public  void car() {
	
	System.out.println("hello i am car 1 ;i am farari");
}
	public  void car(int a) {
		System.out.println("i am car 2 with jeep modle");
	}	
	public  void car(String a) {	
		
	System.out.println("hello car 3 here,bmw");	
	}
	
	
	public String car1(String name) {
		 return name;
	}
}
	}

