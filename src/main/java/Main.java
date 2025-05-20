import java.time.LocalDate;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        EventoDao dao = new EventoDao();

        Evento e1 = new Evento(new Random().nextInt(10,1000), "Concerto",
                LocalDate.of(2025, 5, 12), "Concerto Travis", 1000, TipoEvento.PRIVATO);

        try {
            dao.save(e1);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(dao.getById(e1.getNumeroEvento()));
        dao.remove(e1.getNumeroEvento());
    }
}
