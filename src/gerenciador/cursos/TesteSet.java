package gerenciador.cursos;

import java.util.HashSet;
import java.util.Set;

public class TesteSet {
    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();

        alunos.add("Vitor Albano");
        alunos.add("Paulo");
        alunos.add("Alberto");
        alunos.add("Pedro");
        alunos.add("Nico");

        alunos.forEach(System.out::println);
    }
}
