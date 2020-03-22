
public class Company implements Employee {
	@Override
	public void empdata() {
		// TODO Auto-generated method stub
		System.out.println("surigmail");
	}

	@Override
	public void empid() {
		// TODO Auto-generated method stub
		System.out.println("234");
	}
public static void main(String[] args) {
	Company u= new Company();
	u.empid();
	u.empdata();
	u.empname();
}

private void empname() {
	// TODO Auto-generated method stub
	System.out.println("678");
}
}
