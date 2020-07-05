package WORKS5;
interface drink{
	void candy();
	void choco();
}

 class jumbo implements drink{
	public void candy(int a,int b) {
		a=10;
		a=10;
		b=a+a;
		System.out.println(b);
	}
	
	public void choco(String a){
		System.out.println("my name is doctor ;but i do construction");
	
	}
	public void halwa(){
		System.out.println("sunita i need some masala dosa");
	}
	public void veg(String a,int b) {
		System.out.println("jyoti bring some veg food");}
	@Override
	public void candy() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void choco() {
	 	// TODO Auto-generated method stub
		
		
	}
	
	
	}

public class Eemp extends jumbo {

	public static void main(String[] args) {
		jumbo j=new jumbo();
	j.choco();	
   j.candy();
   j.choco("a");
   j.candy(1, 1);
   j.halwa();
   j.veg("", 1);
   Eemp can=new Eemp();
   can.candy();
	}
public void candy() {
	super.candy();
	System.out.println("i like dairy milk");
}
	
	
	
}
