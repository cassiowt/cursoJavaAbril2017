package com.targettrust.model;

public class Animal {

	private String apelido;
	private float peso;
	private int altura;
	private boolean vivo;
	
	public Animal() {
	}

	/**
	 * @param apelido
	 * @param peso
	 * @param altura
	 * @param vivo
	 */
	public Animal(String apelido, float peso, int altura, boolean vivo) {
		this.apelido = apelido;
		this.peso = peso;
		this.altura = altura;
		this.vivo = vivo;
	}

	/**
	 * @return the apelido
	 */
	public String getApelido() {
		return apelido;
	}

	/**
	 * @param apelido the apelido to set
	 */
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	/**
	 * @return the peso
	 */
	public float getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(float peso) {
		this.peso = peso;
	}

	/**
	 * @return the altura
	 */
	public int getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}

	/**
	 * @return the vivo
	 */
	public boolean isVivo() {
		return vivo;
	}

	/**
	 * @param vivo the vivo to set
	 */
	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Animal [apelido=" + apelido + ", peso=" + peso + ", altura=" + altura + ", vivo=" + vivo + "]";
	}
	
	
	

}
