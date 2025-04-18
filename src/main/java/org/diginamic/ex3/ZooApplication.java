package org.diginamic.ex3;
public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");

		// Remplir le zoo
		zoo.addAnimal(new Animal("Gazelle", "MAMMIFERE", "HERBIVORE"));
		zoo.addAnimal(new Animal("Zèbre", "MAMIFERE", "HERBIVORE"));
		zoo.addAnimal(new Animal("Lion", "MAMMIFERE", "HERBIVORE"));
		zoo.addAnimal(new Animal("Panthère", "MAMMIFERE", "CARNIVORE"));
		zoo.addAnimal(new Animal("Requin blanc", "POISSON", "HERBIVORE"));
		zoo.addAnimal(new Animal("Truite dorée", "POISSON", "HERBIVORE"));
		zoo.addAnimal(new Animal("Boa constrictor", "SERPENT", "CARNIVORE"));
		zoo.addAnimal(new Animal("Python", "SERPENT", "CARNIVORE"));

		// Afficher le zoo
		System.out.println("Animaux du zoo" + zoo.getNom() + " : ");
		zoo.afficherListeAnimaux();
	}

}