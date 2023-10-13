package aval1pratica;

import java.util.ArrayList;
import java.util.List;

public class PetOwner extends User {
	private List<Pet> pets;

	public PetOwner() {
		super();
		pets = new ArrayList<>();
	}

	public PetOwner(String name, String email, List<Pet> pets) {
		super(name, email);
		this.pets = pets;
	}

	public PetOwner(String name, String email) {
		super(name, email);
	}

	public List<Pet> getPets() {
		return pets;
	}

	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}

	@Override
	public String toString() {
		return "PetOwner [pets=" + pets + ", userData=" + super.toString() + "]";
	}
}
