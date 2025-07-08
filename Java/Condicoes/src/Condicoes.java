import java.util.Scanner;
public class Condicoes {

    public static void main(String args[]) {

        Scanner s= new Scanner(System.in);

        // nextByte() para ler um numero em um intervalo entre -128 a 127.
        // caso o numero não esteja entre esses dara erro.
        System.out.println("Digite um numero de -12 a 12:  ");
        byte num= s.nextByte();

        if (num == 8 || num == -8) {
            System.out.println(("Voce acertou!!"));
        } else {
            System.out.println("Voce digitou o numero errado.");
        }
    }
}
