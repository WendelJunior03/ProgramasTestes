/*Desenvolva um algoritimo em Java que leia um número inteiro e imprima o seu antecessor e sucessor*/

import java.util.Scanner;

public class Numeros {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroInt;

        System.out.println("Para saber o numero antecessor e o seu sucessor, aperte ENTER! ");
        System.out.println("Digite um numero inteiro: ");
        numeroInt = entrada.nextInt();

        int antecessor = numeroInt - 1;
        int sucessor = numeroInt + 1;

        System.out.println("O Antecessor de " + numeroInt + " é " + antecessor);
        System.out.println("O Sucessor de " + numeroInt + " é " + sucessor);

    }
}
