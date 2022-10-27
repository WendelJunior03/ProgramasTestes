/*Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
(Ex: 3 anos, 2 meses e 15 dias = 1170dias.)*/

public class Idade {
    public static void idadePessoa(int anos, int mes, int dias) {
        int idade = anos * 365 + mes + dias;
        System.out.println("A sua idade em dias é: " + idade + " dias");
    }
}
