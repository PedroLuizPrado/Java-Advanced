package br.com.fiap.entity;

import javax.persistence.*;
import java.util.Calendar;
import java.util.List;

@Entity
@Table(name = "TB_BIBLIOTECA")
@SequenceGenerator(name = "bibli", sequenceName = "SQ_TB_BIBLIOTECA", allocationSize = 1)
public class Biblioteca {

    @Id
    @Column(name = "cd_biblioteca")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bibli")
    private Integer codigo;

    @Column(name = "nm_biblioteca", nullable = false, length = 80)
    private String nome;

    @Temporal(TemporalType.DATE)
    @Column(name = "dt_abertura")
    private Calendar dataAbertura;

    @OneToOne(cascade = {CascadeType.MERGE, CascadeType.REMOVE}, fetch = FetchType.EAGER)
    @JoinColumn(name = "cd_endereco", nullable = false)
    private Endereco endereco;

    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(name = "TB_LIVRO_BIBLIOTECA",
            joinColumns = @JoinColumn(name = "cd_biblioteca"),
    inverseJoinColumns = @JoinColumn(name = "cd_livro"))
    private List<Livro> livros;

    public Biblioteca() {
    }

    public Biblioteca(String nome, Calendar dataAbertura, Endereco endereco) {
        this.nome = nome;
        this.dataAbertura = dataAbertura;
        this.endereco = endereco;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Calendar getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Calendar dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }
}
