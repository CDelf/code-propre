package org.diginamic.ex1;

import java.util.Date;

/**
 * Classe métier définissant une entreprise
 */
public class Entreprise {

	private int siret;
	private String nom;
	private String adresse;
	private Date dateCreation;
	
	public static final int CAPITAL_MAX = 3_000_000;

	/**
	 * Constructeur
	 * @param siret siret de l'entreprise
	 * @param nom nom de l'entreprise
	 */
	public Entreprise(int siret, String nom) {
		this.siret = siret;
		this.nom = nom;
	}

	/**
	 * Affiche le statut de l'entreprise dans la console
	 */
	public void afficherStatut(){
		System.out.println("Statut de l'entreprise" + this.nom);
	}

	/**
	 * Getter
	 * @return siret
	 */
	public int getSiret() {
		return siret;
	}

	/**
	 * Setter
	 * @param siret siret
	 */
	public void setSiret(int siret) {
		this.siret = siret;
	}

	/**
	 * Getter
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * @param nom nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter
	 * @return adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * Setter
	 * @param adresse adresse
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * Getter
	 * @return dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	/**
	 * Setter
	 * @param dateCreation dateCreation
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
}
