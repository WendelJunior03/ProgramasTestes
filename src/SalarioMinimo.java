import java.util.Scanner;

public class SalarioMinimo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valorSalarioUsuario;
        double salario = 1212;

       /* System.out.println("Quer saber quantos salarios minimos voce ganha? Aperte enter!");*/
        System.out.println("Qual valor do seu salário?: ");
        valorSalarioUsuario = entrada.nextDouble();

        double resultado = valorSalarioUsuario / salario;
        /*int resultado = (int) (valorSalarioUsuario / salario);
        Aqui eu transformei um double em int*/

        if (resultado > 1 ){
            System.out.println("Seu salário é " + valorSalarioUsuario + ", " + "e você recebe " + resultado +
                    " salários minimos");
        } else {
            System.out.println("Seu salário é " + valorSalarioUsuario + ", " + "e você recebe " + resultado +
                    " salário minimo");
        }
    }
}
