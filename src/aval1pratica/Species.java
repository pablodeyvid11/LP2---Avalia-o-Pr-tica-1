package aval1pratica;

public enum Species {
	CAT(1), DOG(2), RABBIT(3), RAT(4);

	private int id;
	Species(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
}
