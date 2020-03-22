
public class Client  implements Employe,Companyy{

//	@Override
//	public void compid() {
//		// TODO Auto-generated method stub
//		System.out.println("89");
//	}

	@Override
	public void compdata() {
		// TODO Auto-generated method stub
		System.out.println("456");
	}

	@Override
	public void compid() {
		// TODO Auto-generated method stub
		System.out.println("457");
	}

	@Override
	public void empdata() {
		// TODO Auto-generated method stub
		System.out.println("345");
	}
public static void main(String[] args) {
	Client r=new Client();
	r.compdata();
	r.compid();
	r.compid();
	r.empdata();
}
}

