package Questao2;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Curso {
    private String nome;
    private int cargaHoraria;
    private String nivel;
    private String descricao;
    private List<Instrutor> instrutores;

    public Curso(String nome, int cargaHoraria, String nivel, String descricao) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.nivel = nivel;
        this.descricao = descricao;
        this.instrutores = new ArrayList<>();
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getCargaHoraria() { return cargaHoraria; }
    public void setCargaHoraria(int cargaHoraria) { this.cargaHoraria = cargaHoraria; }
    public String getNivel() { return nivel; }
    public void setNivel(String nivel) { this.nivel = nivel; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    // Métodos de agregação
    public void addInstrutor(Instrutor instrutor) {
        if (!instrutores.contains(instrutor)) {
            instrutores.add(instrutor);
        }
    }

    public void removeInstrutor(Instrutor instrutor) {
        instrutores.remove(instrutor);
    }

    public List<Instrutor> getInstrutores() {
        return Collections.unmodifiableList(instrutores);
    }

    public void exibirDetalhes() {
        System.out.println("Curso: " + nome);
        System.out.println("Carga Horária: " + cargaHoraria);
        System.out.println("Nível: " + nivel);
        System.out.println("Descrição: " + descricao);
        System.out.println("Instrutores:");
        for (Instrutor instrutor : instrutores) {
            System.out.println(" - " + instrutor.getNome() + " (" + instrutor.getFormacao() + ")");
        }
    }
}

