package org.diginamic.ex2;

/**
 * Classe fille de CompteBancaire pour représenter le type Compte courant
 */
public class CompteCourant extends CompteBancaire {

    private double decouvert;

    /**
     * Constructeur
     * @param solde solde du compte courant
     * @param decouvert découvert autorisé du compte courant
     */
    public CompteCourant(double solde, double decouvert) {
        super(solde);
        this.decouvert = decouvert;
    }

    /**
     * Obtenir le découvert autorisé pour le compte courant
     * @return découvert
     */
    @Override
    protected double getDecouvertAutorise() {
        return decouvert;
    }

    /**
     * Getter
     * @return decouvert
     */
    public double getDecouvert() {
        return decouvert;
    }

    /**
     * Setter
     * @param decouvert decouvert
     */
    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }
}
