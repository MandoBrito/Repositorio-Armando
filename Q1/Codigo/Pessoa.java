package Questao1;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private String cpf;
    private List<Carro> carrosUtilizados;

    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.carrosUtilizados = new ArrayList<>();
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    public List<Carro> getCarrosUtilizados() {
        return carrosUtilizados;
    }

    public void usarCarro(Carro carro){
        carrosUtilizados.add(carro);
        carro.dirigir();
    }
}
