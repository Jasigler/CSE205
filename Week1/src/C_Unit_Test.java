
public class C_Unit_Test {

	public static void main(String[] args){
		C cObj1 = new C();
		C cObj2 = new C(10);

		cObj2.setX(cObj1.getX());
		System.out.println(cObj2.getX());
		int a7 = cObj1.getY();
	    System.out.println(a7);

	    cObj1.setY(20);
	    System.out.println(cObj1.getY());

	}


}
