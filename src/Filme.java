public class Filme {

    private int id;
    private String titulo;
    private int duracaoMinutos;

    public Filme() {
    }

    public Filme(int id, String titulo, int duracaoMinutos) {
        this.id = id;
        this.titulo = titulo;
        this.duracaoMinutos = duracaoMinutos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }
}