package aval1pratica;

public class Seller extends User {
	public Seller() {
	}

	public Seller(String name, String email) {
		super(name, email);
	}

	@Override
	public String toString() {
		return "Seller [userData=" + super.toString() + "]";
	}

}
