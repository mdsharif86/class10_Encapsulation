package Quiz05;

public class Account {

	int accId;
	String accName;
	int accPhone;
	private int accSSN;
	private String accDOB;
	private int accPIN;

	Account(int accId, String accName, int accPhone, int accSSN,
									String accDOB, int accPIN) {
		this.accId = accId;
		this.accName = accName;
		this.accPhone = accPhone;
		this.accSSN = accSSN;
		this.accDOB = accDOB;
		this.accPIN = accPIN;

	}

	void setSSN(int ssn) {
		this.accSSN = ssn;

	}

	int getSSN() {
		return this.accSSN;
	}

	void setDOB(String dob) {
		this.accDOB = dob;
	}

	String getDOB() {
		return this.accDOB;
	}

	void setPIN(int pin) {
		this.accPIN = pin;
	}

	int getPIN() {
		return this.accPIN;

	}
}