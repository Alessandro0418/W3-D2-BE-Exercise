import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "eventi")
public class Evento {
    @Id
    @Column(name = "numero_evento")
    private int numeroEvento;

    @Column(length = 20, nullable = false)
    private String titolo;

    @Column(name = "data_evento", nullable = false)
    private LocalDate dataEvento;


    private String descrizione;


    @Column(name = "numero_massimo_partecipanti")
    private int numeroMassimoPartecipanti;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_evento")
    private TipoEvento tipoEvento;


    public Evento(int numeroEvento, String titolo, LocalDate dataEvento, String descrizione, int numeroMassimoPartecipanti, TipoEvento tipoEvento) {
        this.numeroEvento = numeroEvento;
        this.titolo = titolo;
        this.dataEvento = dataEvento;
        this.descrizione = descrizione;
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
        this.tipoEvento = tipoEvento;
    }


    public int getNumeroEvento() {
        return numeroEvento;
    }

    public void setNumeroEvento(int numeroEvento) {
        this.numeroEvento = numeroEvento;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(LocalDate dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public int getNumeroMassimoPartecipanti() {
        return numeroMassimoPartecipanti;
    }

    public void setNumeroMassimoPartecipanti(int numeroMassimoPartecipanti) {
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "numeroEvento=" + numeroEvento +
                ", titolo='" + titolo + '\'' +
                ", dataEvento=" + dataEvento +
                ", descrizione='" + descrizione + '\'' +
                ", numeroMassimoPartecipanti=" + numeroMassimoPartecipanti +
                ", tipoEvento=" + tipoEvento +
                '}';
    }
}