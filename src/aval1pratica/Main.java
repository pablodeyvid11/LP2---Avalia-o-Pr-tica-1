package aval1pratica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<User> employes = new ArrayList<>();

		Pet pet1 = new Pet("Lupita", Species.CAT);
		Pet pet2 = new Pet("Duque", Species.DOG);

		List<Pet> pets1 = Arrays.asList(pet1, pet2);

		User owner1 = new PetOwner("Bruno", "brunoaugusto@gmail.com", pets1);
		employes.add(owner1);

		Pet pet3 = new Pet("Stuart", Species.RAT);
		Pet pet4 = new Pet("Pernalonga", Species.RABBIT);

		List<Pet> pets2 = Arrays.asList(pet3, pet4);

		User owner2 = new PetOwner("Santigato", "santi.gato.123@ufrn.br", pets2);
		employes.add(owner2);

		Pet pet5 = new Pet("Enzo", Species.DOG);
		Pet pet6 = new Pet("Frajola", Species.CAT);

		List<Pet> pets3 = Arrays.asList(pet5, pet6);

		User owner3 = new PetOwner("Gustavo", "titadocaos@gmail.com", pets3);
		employes.add(owner3);

		User provider1 = new PetProvider("Teffas", "marcosakateffas@bing.com", "Pet Psychologist");
		employes.add(provider1);

		User provider2 = new PetProvider("Kermany", "keke@gmail.com", "Pet Beauty");
		employes.add(provider2);

		User provider3 = new PetProvider("Giovanna", "gio.deutsch@yahoo.com", "Veterinary");
		employes.add(provider3);

		User seller1 = new Seller("Pablo", "pablinho.com@gmail.com");
		employes.add(seller1);

		User seller2 = new Seller("Luis", "luis.dudu@sti.ufrn.br");
		employes.add(seller2);

		User seller3 = new Seller("João Eduardo", "joao.eduardo@activesoft.com");
		employes.add(seller3);

		for (User employe : employes) {
			System.out.println(employe);
		}
	}
}
