package Questao4;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String nome;
    private List<Unidade> unidades;

    public Hospital(String nome) {
        this.nome = nome;
        this.unidades = new ArrayList<>();
    }

    public void adicionarUnidade(Unidade unidade) {
        unidades.add(unidade);
    }

    public void exibirUnidades() {
        System.out.println("Unidades do hospital " + nome + ":");
        for (Unidade u : unidades) {
            System.out.println("- " + u.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public List<Unidade> getUnidades() {
        return unidades;
    }
}
