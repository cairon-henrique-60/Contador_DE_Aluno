package entidades;

import java.util.Objects;

public class Aluno {

	private char curso;
	private Integer codigoDoAluno;

	public Aluno(char curso, Integer codigoDoAluno) {
		this.curso = curso;
		this.codigoDoAluno = codigoDoAluno;
	}

	public char getCurso() {
		return curso;
	}

	public void setCurso(char curso) {
		this.curso = curso;
	}

	public Integer getCodigoDoAluno() {
		return codigoDoAluno;
	}

	public void setCodigoDoAluno(Integer codigoDoAluno) {
		this.codigoDoAluno = codigoDoAluno;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoDoAluno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(codigoDoAluno, other.codigoDoAluno);
	}

}