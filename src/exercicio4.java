import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo numero");
        int numero2 = scanner.nextInt();

        if (numero1 < numero2){
            System.out.println(numero1 +" "+ numero2);
        } else {
            System.out.println(" Os numeros em ordem decrescente Digitados pelo usuario sao " +numero2 + " e " + numero1);

        }
        scanner.close();
    }
}
