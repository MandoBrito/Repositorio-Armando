package Questao3;

public class PlacaMae {
    private String modelo;
    private int nDeSlots;
    private String tipoDeMemoria;

    public PlacaMae(String modelo, int nDeSlots, String tipoDeMemoria) {
        this.modelo = modelo;
        this.nDeSlots = nDeSlots;
        this.tipoDeMemoria = tipoDeMemoria;
    }

    public String getModelo() {
        return modelo;
    }

    public int getnDeSlots() {
        return nDeSlots;
    }

    public String getTipoDeMemoria() {
        return tipoDeMemoria;
    }

    public void exibirDetalhes() {
        System.out.println("Placa Mãe:");
        System.out.println(" - Modelo: " + modelo);
        System.out.println(" - Número de Slots: " + nDeSlots);
        System.out.println(" - Tipo de Memória: " + tipoDeMemoria);
    }
}
