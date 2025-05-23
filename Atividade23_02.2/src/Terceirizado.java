public class Terceirizado {
    private String nome;

    public Terceirizado(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public  void executarServico() {
        System.out.println(nome + " esta executando servico terceirizados");
    }

    public  void registrarPresenca() {
        System.out.println("Presenca registrada para o terceirtizado");
    }
}
