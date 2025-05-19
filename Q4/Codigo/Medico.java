package Questao4;

public class Medico {
    private String nome;
    private String especialidade;

    public Medico(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void realizarConsulta(Paciente paciente) {
        System.out.println("Médico " + nome + " está realizando consulta com paciente " + paciente.getNome());
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }
}
