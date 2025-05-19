package Questao3;

public class Computador {
    private String marca;
    private String modelo;
    private String processador;
    private String memoriaRAM;
    private PlacaMae placaMae;

    public Computador(String marca, String modelo, String processador, String memoriaRAM,
                      String modeloPlacaMae, int nDeSlots, String tipoDeMemoria) {
        this.marca = marca;
        this.modelo = modelo;
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.placaMae = new PlacaMae(modeloPlacaMae, nDeSlots, tipoDeMemoria);
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Processador: " + processador);
        System.out.println("Memória RAM: " + memoriaRAM);
        System.out.println("Placa Mãe:");
        System.out.println(" - Modelo: " + placaMae.getModelo());  // alterado aqui
        System.out.println(" - Slots de Memória: " + placaMae.getnDeSlots());
        System.out.println(" - Tipo de Memória: " + placaMae.getTipoDeMemoria());
    }
}
