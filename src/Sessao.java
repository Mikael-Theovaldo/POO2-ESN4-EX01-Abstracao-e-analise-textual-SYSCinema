import java.time.LocalDateTime;

public class Sessao {

    private int id;
    private Filme filme;
    private Sala sala;
    private LocalDateTime horario;
    private int ingressosDisponiveis;

    public Sessao() {
    }

    public Sessao(int id, Filme filme, Sala sala, LocalDateTime horario, int ingressosDisponiveis) {
        this.id = id;
        this.filme = filme;
        this.sala = sala;
        this.horario = horario;
        this.ingressosDisponiveis = ingressosDisponiveis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public int getIngressosDisponiveis() {
        return ingressosDisponiveis;
    }

    public void setIngressosDisponiveis(int ingressosDisponiveis) {
        this.ingressosDisponiveis = ingressosDisponiveis;
    }
}