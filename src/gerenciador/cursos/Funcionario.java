package gerenciador.cursos;

public class Funcionario implements Comparable<Funcionario> {
    private String nome;
    private int idade;


    public Funcionario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public int compareTo(Funcionario o) {
        return getNome().compareTo(o.getNome());
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
