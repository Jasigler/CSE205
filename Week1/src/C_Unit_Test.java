
public class C_Unit_Test {

	public static void main(String[] args) {

		C cObj1 = new C();
		C cObj2 = new C();
		
		cObj1.C(20); 
		int a5 = cObj1.getX();  
		cObj1.setX(20); 
		cObj2.setX(cObj1.getX()); 
		int a6 = C.getX(); 
		C.setX(20); 
		int a7 = cObj1.getY();
		cObj1.setY(20);

	}

}
