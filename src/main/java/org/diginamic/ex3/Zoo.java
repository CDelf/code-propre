package org.diginamic.ex3;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	private String nom;
	private List<Animal> animaux;

	/**
	 * Constructeur
	 * @param nom : nom du zoo
	 */
	public Zoo(String nom){
		this.nom = nom;
		this.animaux = new ArrayList<>();
	}

	/**
	 * Méthode permettant d'ajouter un Animal dans le zoo
	 * @param animal à ajouter dans le zoo
	 */
	public void addAnimal(Animal animal){
		this.animaux.add(animal);
	}

	/**
	 * Méthode permettant d'afficher la liste des animaux d'un zoo
	 */
	public void afficherListeAnimaux(){
		for (int i=0; i<animaux.size(); i++) {
			System.out.println(animaux.get(i));
		}
	}

	/**
	 * Indique la taille du zoo = nombre d'animaux
	 * @return nombre d'animaux du zoo
	 */
	public int taille() {
		return animaux.size();
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
