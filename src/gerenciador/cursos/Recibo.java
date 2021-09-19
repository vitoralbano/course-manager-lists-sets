package gerenciador.cursos;

import java.time.OffsetDateTime;
import java.util.Objects;

public class Recibo implements Comparable{
    private OffsetDateTime dateTime;

    public OffsetDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recibo recibo = (Recibo) o;
        return Objects.equals(dateTime, recibo.dateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateTime);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
