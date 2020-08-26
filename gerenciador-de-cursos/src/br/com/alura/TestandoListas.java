package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {

		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";

		ArrayList<String> aulas = new ArrayList<>(); // Cria lista chamada Aulas
		aulas.add(aula1); // Adiciona um objeto na lista
		aulas.add(aula2);
		aulas.add(aula3);

		System.out.println(aulas); // toString

		aulas.remove(0); // Remove o item do espaço zero
		System.out.println(aulas);

		for (String aula : aulas) { // Para cada String aula dentro de Aulas faça:
			System.out.println("Aula: " + aula);
		}

		String primeiraAula = aulas.get(0); // pegue a aula que está na posição x
		System.out.println("A primeira aula é: " + primeiraAula); // mostre no console

		for (int i = 0; i < aulas.size(); i++) {// percorre lista através de indice
			System.out.println("Aula: " + aulas.get(i));
		}

		System.out.println(aulas.size());// quantos itens tem na lista

		aulas.forEach(aula -> { //usando Lambda - forma mais recomendada
			System.out.println("Percorrendo:");
			System.out.println(aula);
		});
		
		aulas.add("Aumentando nosso conhecimento");
		System.out.println(aulas);
		
		Collections.sort(aulas); //ordena a lista em ordem alfabética
		System.out.println("Depois de ordenado:");
		System.out.println(aulas);
		


		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
