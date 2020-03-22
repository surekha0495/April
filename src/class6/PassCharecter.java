package class6;

public class PassCharecter {
	private void empdetails(int empid,String empname) {
		// TODO Auto-generated method stub
		System.out.println(""+empid+empname);
	}
private void empdetails(float sal,String name) {
	// TODO Auto-generated method stub
System.out.println(""+sal+name);
}
	
	public static void main(String[] args) {
		PassCharecter y=new PassCharecter();
		y.empdetails('u', "suri");
		y.empdetails(1234f, "chandu");
		y.main(1234);
		y.main(3456);
	}
public static void main(int empsal ) {
	
	System.out.println(""+empsal);
}
public static void main(float y) {
	System.out.println(""+y);
	
}
}
