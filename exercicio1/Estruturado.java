import java.util.Scanner;

public class Estruturado {

    public static void main(String[] args) {
        Scanner tecladoNum = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);
        String[] vNomes = new String[40];
        double[] notasP1 = new double[40];
        double[] notasP2 = new double[40];   
        int nAlunos;

        System.out.print("Quantos alunos na sala: ");
        nAlunos = tecladoNum.nextInt();

        for(int i = 0; i < nAlunos; i++) {
            System.out.print("Nome: ");
            vNomes[i] = teclado.nextLine();
            System.out.print("P1: ");
            notasP1[i] = tecladoNum.nextDouble();
            System.out.print("P2: ");
            notasP2[i] = tecladoNum.nextDouble();
        }

        for(int i = 0; i < nAlunos; i++) {
            double media = (notasP1[i]+notasP2[i])/2.0;
            /*
            if(media<6.0) {
                System.out.println("O aluno "+vNomes[i]+" nao foi aprovado.");
            } else {
                System.out.println("O aluno "+vNomes[i]+" passou.");
            }
            */

            System.out.println("O aluno "+vNomes[i]+((media<6.0)?" nao foi aprovado.":" passou."));

        }

    }

}