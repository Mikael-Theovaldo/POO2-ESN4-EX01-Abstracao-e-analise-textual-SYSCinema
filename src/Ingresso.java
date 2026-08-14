import java.time.LocalDateTime;

public class Ingresso {

    private int id;
    private TipoIngresso tipo;
    private Sessao sessao;
    private Cliente cliente;
    private Funcionario funcionario;
    private LocalDateTime dataCompra;

    public Ingresso(int id, TipoIngresso tipo, Sessao sessao, Cliente cliente, Funcionario funcionario, LocalDateTime dataCompra) {
        this.id = id;
        this.tipo = tipo;
        this.sessao = sessao;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.dataCompra = dataCompra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoIngresso getTipo() {
        return tipo;
    }

    public void setTipo(TipoIngresso tipo) {
        this.tipo = tipo;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public LocalDateTime getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDateTime dataCompra) {
        this.dataCompra = dataCompra;
    }
    }