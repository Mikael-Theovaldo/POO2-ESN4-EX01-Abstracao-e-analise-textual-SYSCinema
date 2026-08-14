import java.util.ArrayList;
import java.util.List;

public class Cinema {

    private int id;
    private String nome;
    private String endereco;
    private List<Sala> salas;
    private List<Filme> filmes;

    public Cinema(int id, String nome, String endereco, List<Sala> salas, List<Filme> filmes) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.salas = salas;
        this.filmes = filmes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Sala> getSalas() {
        return salas;
    }

    public void setSalas(List<Sala> salas) {
        this.salas = salas;
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }
}