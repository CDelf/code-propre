package org.diginamic.ex5;

import java.util.ArrayList;
import java.util.List;

public class Caisse {

	private TypeCaisse typeCaisse;
	private List<Item> items;

	{
		items = new ArrayList<>();
	}
	/** Constructeur
	 * @param typeCaisse utilisée basée sur l'enum TypeCaisse : petit moyen ou grand
	 */
	public Caisse(TypeCaisse typeCaisse) {
		super();
		this.typeCaisse = typeCaisse;
	}

	/**
	 * Indique si la caisse peut contenir un item selon son poids et le type de caisse
	 * @param i item à tester
	 * @return true si la caisse peut contenir l'item, sinon false.
	 */
	public boolean peutContenir(Item i) {
		return typeCaisse.peutContenir(i);
	}

	/** Getter pour l'attribut items
	 * @return the items
	 */
	public List<Item> getItems() {
		return items;
	}

	/** Setter pour l'attribut items
	 * @param items the items to set
	 */
	public void setItems(List<Item> items) {
		this.items = items;
	}

}