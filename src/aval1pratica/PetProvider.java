package aval1pratica;

public class PetProvider extends User {
	private String specialty;

	public PetProvider() {
		super();
	}

	public PetProvider(String name, String email, String specialty) {
		super(name, email);
		this.specialty = specialty;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	@Override
	public String toString() {
		return "PetProvider [specialty=" + specialty + ", userData=" + super.toString() + "]";
	}

}
