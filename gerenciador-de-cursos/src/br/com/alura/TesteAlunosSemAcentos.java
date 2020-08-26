package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TesteAlunosSemAcentos {

	public static void main(String[] args) {

		 Set<String> alunos = new HashSet<>();
		 alunos.add("Anna Caroline");
		 alunos.add("Caroline Santos");
		 alunos.add("Maria Caroline");
		 
		 System.out.println(alunos);
		 
		 System.out.println(alunos.size());
		 
		 alunos.add("Anna Caroline");
		 
		 System.out.println(alunos);

		 boolean adicionou = alunos.add("Anna Caroline");
		 System.out.println("Anna foi adicionadas ao Set? " + adicionou);
		 
		 System.out.println(alunos.size());

		 
		 
		 
		 
		 
	}

}
