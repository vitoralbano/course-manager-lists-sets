package gerenciador.cursos;

public class TesteBuscaAlunos {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando coleções", 22));

        Aluno a1 = new Aluno("Rodrigo Turini", 36473);
        Aluno a2 = new Aluno("Guilherme Silveira", 12572);
        Aluno a3 = new Aluno("Vitor Albano", 57831);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        Aluno matriculado = javaColecoes.buscaMatriculado(12572);
        System.out.println(matriculado);
    }
}
