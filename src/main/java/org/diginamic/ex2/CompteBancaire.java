package org.diginamic.ex2;

/** Classe abstraite représentant un compte bancaire */
public abstract class CompteBancaire {

	/** solde : solde du compte */
	private double solde;

	public CompteBancaire(double solde) {
		this.solde = solde;
	}

	/** Ajoute un montant au solde */
	public void ajouterMontant(double montant){
		this.solde += montant;
	}

	/** Débite un montant du solde */
	public void debiterMontant(double montant) {
		if (this.solde - montant >= 0) {
			this.solde -= montant;
		}
	}

	/** À implémenter dans les classes filles selon leur type de découvert */
	protected abstract double getDecouvertAutorise();

	/** Getter for solde */
	public double getSolde() {
		return solde;
	}

	/** Setter for solde */
	public void setSolde(double solde) {
		this.solde = solde;
	}
}
