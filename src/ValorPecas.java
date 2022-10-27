import java.util.Scanner;

/**/
public class ValorPecas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int codigoPeca1;
        double valorPeca1;
        int quantidadePeca1;

        System.out.println("Digite o codigo da peça: ");
        codigoPeca1 = entrada.nextInt();

        System.out.println("Digite o valor da peça: ");
        valorPeca1 = entrada.nextDouble();

        System.out.println("Digite a quantidade de peças: ");
        quantidadePeca1 = entrada.nextInt();


        Scanner entrada2 = new Scanner(System.in);
        int codigoPeca2;
        double valorPeca2;
        int quantidadePeca2;

        System.out.println("Digite o codigo da peça: ");
        codigoPeca2 = entrada2.nextInt();

        System.out.println("Digite o valor da peça: ");
        valorPeca2 = entrada2.nextDouble();

        System.out.println("Digite a quantidade de peças: ");
        quantidadePeca2 = entrada2.nextInt();

        double resultado = (valorPeca1 * quantidadePeca1 + valorPeca2 * quantidadePeca2) * (1.35 / 100 + 1);

        System.out.println("O valor a ser pago é de: " + resultado);

    }

}