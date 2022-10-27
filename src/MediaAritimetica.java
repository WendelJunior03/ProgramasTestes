/*Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
números 4, 5 e 6. A soma das duas médias. A média das médias.*/
public class MediaAritimetica {

    public static void media(int num1, int num2, int num3){
        int mediaDois = (4 + 5 + 6) / 3;
        int mediaUm = (num1 + num2 + num3) / 3;

        System.out.println("A média das médias é: " + mediaUm + mediaDois);

    }
}
