package Aula02;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cout1 = 0, cout2 = 0, cout3 = 0, cout4 = 0;
        String[] alunos = new String[4];
        for (int i = 0; i < alunos.length; i++) {
            System.out.print("Informe o nome do candidato: ");
            alunos[i] = entrada.nextLine();
        }


        int i = 0;
        boolean votaDeNovo = true;
        do {

            System.out.println("Em quem você quer vota: ");
            System.out.println("1- " + alunos[0]);
            System.out.println("2- " + alunos[1]);
            System.out.println("3- " + alunos[2]);
            System.out.println("4- " + alunos[3]);
            int x = entrada.nextInt();
            switch (x) {
                case 1:
                    cout1++;

                    break;
                case 2:
                    cout2++;

                    break;
                case 3:
                    cout3++;

                    break;
                case 4:
                    cout4++;
                    break;
                default:
                    System.err.println("Candidato inválido.");
                    break;
            }
            i++;
            System.out.println("Quer vota novamente: ");
            votaDeNovo = entrada.nextBoolean();
        } while (votaDeNovo == true);

        System.out.println(alunos[0] + " " + cout1 + " votos");
        System.out.println(alunos[1] + " " + cout2 + " votos");
        System.out.println(alunos[2] + " " + cout3 + " votos");
        System.out.println(alunos[3] + " " + cout4 + " votos");

    }
}
