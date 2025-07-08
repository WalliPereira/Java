import java.util.Scanner;
public class Condicoes {

    public static void main(String args[]) {

        Scanner s= new Scanner(System.in);

        System.out.println("Digite um numero de 0 a 12:  ");
        byte num= s.nextByte();

        if (num == 8) {
            System.out.println(("Voce acertou!!"));
        } else {
            System.out.println("Voce digitou o numero errado.");
        }
    }
}
