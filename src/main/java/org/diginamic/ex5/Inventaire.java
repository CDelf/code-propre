package org.diginamic.ex5;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe inventaire définissant les caisses disponibles et les caractéristiques de leur contenu
 */
public class Inventaire {

	private List<Caisse> caisses;

	/**
	 * Constructeur : liste contenant les 3 types de caisse existants
	 */
	public Inventaire() {
		caisses = new ArrayList<>();
		caisses.add(new Caisse(TypeCaisse.PETIT));
		caisses.add(new Caisse( TypeCaisse.MOYEN));
		caisses.add(new Caisse(TypeCaisse.GRAND));
	}

	/**
	 * Ajout d'un article à une caisse si celle-ci peut le contenir
	 * @param item item à ajouter à l'inventaire
	 */
	public void addItem(Item item) {
		for(Caisse caisse : caisses) {
			if(caisse.peutContenir(item)) {
				caisses.add(caisse);
				break;
			}
		}
	}

	/**
	 * Calcule la quantité d'articles de l'inventaire
	 * @return size : la quantité d'articles contenue dans toutes les caisses
	 */
	public int taille() {
		int size = 0;
		for(Caisse caisse : caisses) {
			size += caisse.getItems().size();
		}
		return size;
	}
}
