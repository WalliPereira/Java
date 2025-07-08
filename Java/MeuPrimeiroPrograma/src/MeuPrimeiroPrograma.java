// Programa para medir a area de um triangulo.


// Import para ler algo digitado pelo usuario
import java.util.Scanner;
class MeuPrimeiroPrograma {

    public static void main(String args[]) {

        Scanner s= new Scanner(System.in);

            // Blocos de codigo para coletar o dado digitado pelo usuario.
            System.out.println("Insira a largura do triagulo: ");
            double b= s.nextDouble();

            System.out.println("Insira a altura do triagulo: ");
            double h= s.nextDouble();

        double area=(b*h)/2;
        System.out.println("A area do triagulo e:" + area);
    }
}
