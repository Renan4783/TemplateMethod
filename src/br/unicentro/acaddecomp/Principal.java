package br.unicentro.acaddecomp;

import java.util.*;

public class Principal{
	public static void main(String[] args) {
		Predio[] predios = new Predio[5];
		predios[0] = new Predio(5);
		predios[1] = new Predio(15);
		predios[2] = new Predio(7);
		predios[3] = new Predio(3);
		predios[4] = new Predio(12);
		System.out.println("Antes da ordenação: ");
		for (int i = 0; i < predios.length; i++){
			System.out.println(predios[i].getAltura());
		}
		System.out.println("\nDepois da ordenação: ");
		Arrays.sort(predios, new ComparaPredio());
		for (int i = 0; i < predios.length; i++){
			System.out.println(predios[i].getAltura());
		}
	}
}
