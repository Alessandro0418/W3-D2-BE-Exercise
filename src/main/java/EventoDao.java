import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.hibernate.loader.ast.internal.CacheEntityLoaderHelper;

public class EventoDao {
    private EntityManager em;

    public EventoDao(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
        em = emf.createEntityManager();
    }

    //Metodo save
    public void save(Evento evento){
        em.getTransaction().begin();
        em.persist(evento);
        em.getTransaction().commit();
    }

    //Metodo getById
    public Evento getById(int numeroEvento){return em.find(Evento.class, numeroEvento);}


    //Metodo remove
    public void remove(int numeroEvento){
        Evento e = getById(numeroEvento);

        if (e!=null){
            em.getTransaction().begin();
            em.remove(e);
            em.getTransaction().commit();
        } else {
            System.out.println("Evento con Id " + numeroEvento + " non trovato");
        }
    }
}
