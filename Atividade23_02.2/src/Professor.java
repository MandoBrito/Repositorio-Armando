import java.io.Serializable;

public class Professor extends Funcionario implements PresencaRegistravel {
    private String disciplina;

    public Professor(String nome, String disciplina) {
    super(nome);
    this.disciplina = disciplina;
    }
    public void lecionar() {
        System.out.println(nome + "esta lecionando a disciplina " + disciplina);
    }

    public void registrarPresenca() {
        System.out.println("Presenca registrada para o professor " + nome);
    }
}
