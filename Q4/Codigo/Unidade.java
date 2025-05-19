package Questao4;

import java.util.ArrayList;
import java.util.List;

public class Unidade {
    private String nome;
    private List<Medico> medicos;

    public Unidade(String nome) {
        this.nome = nome;
        this.medicos = new ArrayList<>();
    }

    public void adicionarMedico(Medico medico) {
        medicos.add(medico);
    }

    public void exibirMedicos() {
        System.out.println("Médicos da unidade " + nome + ":");
        for (Medico m : medicos) {
            System.out.println("- " + m.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public List<Medico> getMedicos() {
        return medicos;
    }
}
