package aval1pratica;

public class Pet {
	private String name;
	private Species species;

	public Pet(String name, Species species) {
		this.name = name;
		this.species = species;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Species getSpecies() {
		return species;
	}

	public void setSpecies(Species species) {
		this.species = species;
	}

	@Override
	public String toString() {
		return "Pet{" + "name='" + name + '\'' + ", species=" + species + '}';
	}
}
