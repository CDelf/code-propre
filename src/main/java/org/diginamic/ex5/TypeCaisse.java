package org.diginamic.ex5;

/**
 * Enum pour définir les 3 types de caisses possibles : petit, moyen, grand
 * Chaque type de caisse peut contenir des articles de poids min/max différents
 */
public enum TypeCaisse {

    PETIT(0, 5),
    MOYEN(5,20),
    GRAND(20, Integer.MAX_VALUE);

    private int poidsMin;
    private int poidsMax;

    /**
     * Constructeur
     * @param poidsMin poids minimum des articles que peut contenir le type de caisse
     * @param poidsMax poids maximum des articles que peut contenir le type de caisse
     */
    TypeCaisse(int poidsMin, int poidsMax) {
        this.poidsMin = poidsMin;
        this.poidsMax = poidsMax;
    }

    /**
     * Indique si le type de caisse peut contenir un article en fonction de son poids et du type de caisse
     * @param item item à tester
     * @return true si le poids convient au type de caisse, sinon false
     */
    public boolean peutContenir(Item item) {
        return poidsMin >= item.getPoids() && poidsMax <= item.getPoids();
    }
}
