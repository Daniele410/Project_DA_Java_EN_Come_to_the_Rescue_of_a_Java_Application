package com.hemebiotech.analytics;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CountAndOrderSymptoms implements ISymptomCounter {

	public Map<String, Integer> processData(List<String> listNotCounted) {

		TreeMap<String, Integer> compteurs = new TreeMap<>();
		for (String line : listNotCounted) {

			if (compteurs.containsKey(line)) {
				// si la ligne contient d�j� la ligne, on incr�mente le compteur qui est associ�
				compteurs.put(line, compteurs.get(line) + 1);
			} else {
				// sinon on ajoute l'association en initialisant le compteur � 1
				compteurs.put(line, 1);
			}
			
		}
		return compteurs;
	}

	public Map<String, Integer> writeSymptoms(Map<String, Integer> symptomsMap, Comparator<String> comparator) {
		return symptomsMap;
		
		
	}

}