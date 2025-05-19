package Questao1;

public class Main {
    public static void main(String[] args) {

        Pessoa OSL = new Pessoa("OLga Sophia Lara","201120162020");
        Carro Impala1967 = new Carro("Chevrolet","Impala", 1967);
        Carro MustangMarch1 = new Carro("Ford","Mustang March 1",1969);

        OSL.usarCarro(MustangMarch1);
        OSL.usarCarro(Impala1967);

        System.out.println(OSL.getCarrosUtilizados());
        System.out.println("MustangMarch1: "+MustangMarch1);
        System.out.println("Impala: " + Impala1967);

    }
}
