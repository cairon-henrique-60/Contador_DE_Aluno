package aplicacao;

import java.util.Scanner;

import Servicos.ContadorDeAlunos;
import entidades.Aluno;
import excecoes.ExcecaoPersonalizada;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {

			ContadorDeAlunos contadorDeAlunos = new ContadorDeAlunos();

			System.out.print("Quantos quantos cursos deseja comparar as matriculas dos alunos? ");
			int contador = sc.nextInt();

			for (int i = 0; i < contador; i++) {
				System.out.print("Digite a classe (A/B/C): ");
				char curso = sc.next().charAt(0);

				System.out.print("Quanto alunos deseja verificar na classe " + curso + "? ");
				int quantidadeDeAlunos = sc.nextInt();

				for (int j = 0; j < quantidadeDeAlunos; j++) {
					System.out.print("Digite o codigo do aluno: ");
					int codigoDoAluno = sc.nextInt();
					
					contadorDeAlunos.comparadorDeAluno(new Aluno(curso, codigoDoAluno));

				}
				System.out.println();
			}
			System.out.println(contadorDeAlunos);
		} catch (ExcecaoPersonalizada e) {
			System.out.println(e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Erro inesperado! " + e.getMessage());
		} finally {
			sc.close();
		}
	}
}