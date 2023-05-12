import java.util.ArrayList;

public class Exercicio1 {
    public static void main(String[] args) {
        ArrayList<Integer> alunos = new ArrayList<Integer>();

        alunos.add(10);
        alunos.add(20);
        alunos.add(30);
        alunos.add(40);
        alunos.add(50);

        alunos.remove(new Integer(30));
        System.out.println(alunos);

    }
}