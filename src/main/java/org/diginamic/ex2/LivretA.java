package org.diginamic.ex2;

/**
 * Classe fille de CompteBancaire représentant le type LivretA
 */
public class LivretA extends CompteBancaire {

	private double tauxRemuneration;

	public LivretA(double solde, double tauxRemuneration) {
		super(solde);
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 * Le découvert n'est pas autorisé sur le livret A
	 * @return 0
	 */
	@Override
	protected double getDecouvertAutorise() {
		return 0; // Aucun découvert autorisé
	}

	/**
	 * Calcul de la rémunération annuelle du livretA selon le taux de rémunération
	 */
	public void appliquerRemuAnnuelle() {
		double nouveauSolde = getSolde() + getSolde() * tauxRemuneration / 100;
		setSolde(nouveauSolde);
	}

	/**
	 * Getter
	 * @return tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * Setter
	 * @param tauxRemuneration tauxRemuneration
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
}

