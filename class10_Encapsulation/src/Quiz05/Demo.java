package Quiz05;

public class Demo {

	public static void main(String[] args) {
		Account joe;
		joe= new Account(1, "Joe", 1234, 23444, "12/12/1997", 7651);
		
		joe.setSSN(32445);
		joe.setDOB("1/1/2011");
		joe.setPIN(7741);
		
		System.out.println("accId: " + joe.accId);
		System.out.println("accName: " + joe.accName);
		System.out.println("accPhone: " + joe.accPhone);
		System.out.println("accSSN: " + joe.getSSN());
		System.out.println("accDOB: " + joe.getDOB());
		System.out.println("accPIN: " + joe.getPIN());
		
		Account maria;
		maria = new Account(2, "Maria", 1278, 34444, "12/20/1999", 7678);
		
		maria.setSSN(2345);
		maria.setDOB("1/25/2010");
		maria.setPIN(7767);
		
		System.out.println();
		System.out.println("accId: " + maria.accId);
		System.out.println("accName: " + maria.accName);
		System.out.println("accPhone: " + maria.accPhone);
		System.out.println("accSSN: " + maria.getSSN());
		System.out.println("accDOB: " + maria.getDOB());
		System.out.println("accPIN: " + maria.getPIN());
		
	}//main

}//class
