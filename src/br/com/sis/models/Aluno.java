package br.com.sis.models;

public class Aluno extends Pessoa {
	private double nota;

	public String toString() {
		return super.toString();
	}

	public Aluno() {
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

}
