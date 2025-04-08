package org.diginamic.ex3;

/**
 * Classe métier qui définit un animal
 */
public class Animal {

    private String type;
    private String nom;
    private String comportement;

    /**
     * Constructeur
     * @param type type de l'animal (mammifère, poisson, etc)
     * @param nom nom de l'animal (gazelle, loup, etc)
     * @param comportement régime alimentaire de l'animal (herbivore, carnivore, etc)
     */
    public Animal(String nom, String type, String comportement) {
        this.nom = nom;
        this.type = type;
        this.comportement = comportement;
    }

    /**
     * Affiche les informations d'un animal
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Animal{");
        sb.append("type='").append(type).append('\'');
        sb.append(", nom='").append(nom).append('\'');
        sb.append(", comportement='").append(comportement).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
