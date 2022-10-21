package aulas.poo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Cliente {
    private long id;
    private String nome;
    private String sobreNome;
    private LocalDate dataNascimento;
    private LocalDateTime dataHoraCadastro;
    private double altura;
    private double peso;

    Cliente (int id, String nome, String sobreNome, LocalDate dataNascimento, double altura, double peso) {
        this.setId(id);
        this.setNome(nome);
        this.setSobreNome(sobreNome);
        this.setDataNascimento(dataNascimento);
        this.setDataHoraCadastro(LocalDateTime.now());
        this.setAltura(altura);
        this.setPeso(peso);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDateTime getDataHoraCadastro() {
        return dataHoraCadastro;
    }

    public void setDataHoraCadastro(LocalDateTime dataHoraCadastro) {
        this.dataHoraCadastro = dataHoraCadastro;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}

