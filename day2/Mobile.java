package week1.day2;

public class Mobile {
	public void sendsms() {
		System.out.println("From Oppo");
	}

	public long makeCall(long phno) {
		return phno;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m = new Mobile();
		m.sendsms();
		System.out.println(m.makeCall(9876543210l));
	}

}
