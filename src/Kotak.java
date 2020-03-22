
public class Kotak extends Yes {
	public void golaloan(int id,String name) {
		// TODO Auto-generated method stub
System.out.println(""+id+name);
	}
public void goldloan(float sal,double id) {
	// TODO Auto-generated method stub
System.out.println(""+sal+id);
}

public void goldloan() {
	// TODO Auto-generated method stub
System.out.println("123");
}
public static void main(String[] args) {
	Kotak n=new Kotak();
	n.golaloan(12, "suri");
	n.goldloan(21.234f, 12324);
	n.goldloan();
}
}
