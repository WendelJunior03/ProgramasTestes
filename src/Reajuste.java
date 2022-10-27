
/*Informar um saldo e imprimir o saldo com reajuste de 1%.*/
public class Reajuste {

    public static void saldo(double valor){
        System.out.println("O saldo atual é: " + valor);
        double reajuste = valor + (valor * 0.01);

        System.out.println("o seu saldo foi reajustado para: " + reajuste );
    }
}
