package gerenciador.cursos;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class TesteCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando coleções", 22));

        System.out.println(javaColecoes.getAulas());
        System.out.println(javaColecoes.getTempoTotal());
        System.out.println(javaColecoes);

        List<Aula> aulas = new LinkedList<>(javaColecoes.getAulas());

        aulas.sort(Comparator.comparing(Aula::getTempo));
        System.out.println(aulas);
    }
}
