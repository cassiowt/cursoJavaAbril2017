package com.targettrust.model;

public class Pessoa {

	private String identificador;
	private String nome;
	private Animal animal;

	public Pessoa() {
	}

	/**
	 * @param identificador
	 * @param nome
	 * @param animal
	 */
	public Pessoa(String identificador, String nome, Animal animal) {
		this.identificador = identificador;
		this.nome = nome;
		this.animal = animal;
	}

	/**
	 * @return the identificador
	 */
	public String getIdentificador() {
		return identificador;
	}

	/**
	 * @param identificador
	 *            the identificador to set
	 */
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the animal
	 */
	public Animal getAnimal() {
		return animal;
	}

	/**
	 * @param animal
	 *            the animal to set
	 */
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pessoa [identificador=" + identificador + ", nome=" + nome + ", animal=" + animal + "]";
	}

}
