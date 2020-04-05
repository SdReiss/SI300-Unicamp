import java.util.Scanner;

public class Estruturado {

    public static void main(String[] args) {
        Scanner tecladoNum = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);

        Aluno[] vAlunos = new Aluno[40];
        int nAlunos;

        System.out.print("Quantos alunos na sala: ");
        nAlunos = tecladoNum.nextInt();

        for(int i = 0; i < nAlunos; i++) {
            System.out.print("Nome: ");
            Aluno aluno = new Aluno(teclado.nextLine());
            System.out.print("P1: ");
            aluno.setNotaP1(tecladoNum.nextDouble());
            System.out.print("P2: ");
            aluno.setNotaP2(tecladoNum.nextDouble());
            vAlunos[i] = aluno;
        }

        for(int i = 0; i < nAlunos; i++) {
            System.out.println(vAlunos[i]);
        }

    }

}