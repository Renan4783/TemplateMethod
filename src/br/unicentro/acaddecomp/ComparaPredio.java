package br.unicentro.acaddecomp;

import java.util.*;

public class ComparaPredio implements Comparator<Predio>{

	@Override
	public int compare(Predio p1, Predio p2) {
		if (p1.getAltura() > p2.getAltura()) return 1;
		if (p1.getAltura() < p2.getAltura()) return -1;
		return 0;
	}
	
}
