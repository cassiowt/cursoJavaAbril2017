package com.targettrust.apl;

import com.targettrust.model.Animal;
import com.targettrust.model.Pessoa;

public class Aplicacao {
	public static void main(String[] args) {
		
		Animal cao = new Animal("Byte", 100.50f, 100, true);
		Pessoa pai = new Pessoa("6164550", "Cassio", cao);
		
		imprimirPessoa(pai);
		
		Animal gato = new Animal("JJ", 10f, 30, true);
		//Pessoa mae = new Pessoa("6164550", "Bety", gato);
		pai.setAnimal(gato);
		
		imprimirPessoa(pai);

	}

	private static void imprimirPessoa(Pessoa pai) {
		Animal animal = pai.getAnimal();
		System.out.println(
				"Cliente: " + pai.getNome() +  "- Identificador:  " + pai.getIdentificador() +
				"\nPossui o animal: " + animal.getApelido() + 
				"\nPeso:  " + animal.getPeso() +
				"\nAltura: " + animal.getAltura() +
				"\nO Animal esta Vivo: "+ animal.isVivo());
		System.out.println("-----------------------------------------");
	}
}
