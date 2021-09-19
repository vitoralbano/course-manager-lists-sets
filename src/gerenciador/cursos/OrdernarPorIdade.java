package gerenciador.cursos;

import java.util.Comparator;

public class OrdernarPorIdade implements Comparator<Funcionario> {
    @Override
    public int compare(Funcionario o1, Funcionario o2) {
        return Integer.compare(o1.getIdade(), o2.getIdade());
    }
}
