import java.util.ArrayList;

public class Exercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> alunas = new ArrayList<Integer>();

        alunas.add(5);
        alunas.add(4);
        alunas.add(3);
        alunas.add(2);

        alunas.add(2, 6);

        System.out.println(alunas);

    }

}
