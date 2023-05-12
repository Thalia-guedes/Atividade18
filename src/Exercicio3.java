import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean retorno = true;

        System.out.println("Qual sera o tamnho da lista? ");
        int tamanhoLista = scanner.nextInt();

        List<Integer> listas = criarLista(tamanhoLista);

    }

    public static List<Integer> criarLista(int tamanhoLista){

        return new ArrayList<Integer>(tamanhoLista);

    }

    public static boolean retornoLista(int criarLista){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe os valores a serem adicionados na lista");
        int valores = scanner.nextInt();
        for (int i =0; i< criarLista; i++){
            System.out.println("o valor " + criarLista);

        }
        return false;

    }
}


// deu muito erro, nao consegui terminar
