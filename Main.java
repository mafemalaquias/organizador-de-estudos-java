import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Tarefa> tarefas = new ArrayList<>();

        System.out.println("Organizador de Estudos");

        System.out.println("Digite uma tarefa:");
        String desc = sc.nextLine();

        tarefas.add(new Tarefa(desc));

        System.out.println("Tarefa adicionada com sucesso!");

        System.out.println("Tarefa cadastrada: " + desc);
       



    }
}
