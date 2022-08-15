package Servicos;

import java.util.HashSet;
import java.util.Set;

import entidades.Aluno;
import excecoes.ExcecaoPersonalizada;

public class ContadorDeAlunos implements ServicoConta{

	Set<Integer> total = new HashSet<>();
	
	
	public String verificando(char curso) throws ExcecaoPersonalizada {
		String msg = null;
		if (!(curso == 'A') && !(curso == 'B') && !(curso == 'C')) {
			throw new ExcecaoPersonalizada(msg = "Error verifique a classe digitada!");
		}
		return msg;
	}
	
	@Override
	public int comparadorDeAluno(Aluno aluno) throws ExcecaoPersonalizada {
		
		Set<Integer> A = new HashSet<>();
		Set<Integer> B = new HashSet<>();
		Set<Integer> C = new HashSet<>();

		if (aluno.getCurso() == 'A') {
			A.add(aluno.getCodigoDoAluno());
		}
		if (aluno.getCurso() == 'B') {
			B.add(aluno.getCodigoDoAluno());
		}
		if (aluno.getCurso() == 'C') {
			C.add(aluno.getCodigoDoAluno());
		}
		
		A.addAll(B);
		A.addAll(C);
		total.addAll(A);
		
		return total.size();
	}

	@Override
	public String toString() {
		return "Quantidade: " + total.size();
	}

}