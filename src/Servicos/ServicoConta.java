package Servicos;

import entidades.Aluno;
import excecoes.ExcecaoPersonalizada;

public interface ServicoConta {
	int comparadorDeAluno(Aluno aluno) throws ExcecaoPersonalizada;
}
