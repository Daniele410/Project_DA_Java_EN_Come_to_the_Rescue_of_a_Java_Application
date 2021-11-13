package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CountAndOrderSymptoms implements ISymptomCounter {

	public Map<String, Integer> processData(List<String> listNotCounted) {
		/**
		 * Creation TreeMap
		 */
		TreeMap<String, Integer> compteurs = new TreeMap<>();
		for (String symptom : listNotCounted) {

			if (compteurs.containsKey(symptom)) {
				/**
				 * si la ligne contient d�j� la ligne, on incr�mente le compteur qui est associ� /symptom as key, count as value
				 */
				compteurs.put(symptom, compteurs.get(symptom) + 1);
			} else {
				/**
				 * sinon on ajoute l'association en initialisant le compteur � 1
				 */
				compteurs.put(symptom, 1);
			}

		}
		return compteurs;
	}

}
