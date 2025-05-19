package Questao4;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("Hospital Central");

        Unidade upa = new Unidade("UPA");
        Unidade enfermaria = new Unidade("Enfermaria");

        Medico Dra_Olga = new Medico("Olga Ester", "Clínica Geral");
        Medico Dra_Sophia = new Medico("Sophia Ester", "Pediatra");
        Medico Dra_Lara = new Medico("Lara Ester", "Pediatra");

        Paciente paciente1 = new Paciente("Armando Brito", "123.456.789-11");
        Paciente paciente2 = new Paciente("Debora Soares", "123.456.789-12");
        Paciente paciente3 = new Paciente("Hila Zoe", "123.456.789-13");

        upa.adicionarMedico(Dra_Olga);
        enfermaria.adicionarMedico(Dra_Lara);

        hospital.adicionarUnidade(upa);
        hospital.adicionarUnidade(enfermaria);

        Consulta consulta1 = new Consulta(Dra_Olga, paciente1, "10/05/2025");
        Consulta consulta2 = new Consulta(Dra_Sophia, paciente2, "20/05/2025");
        Consulta consulta3 = new Consulta(Dra_Lara, paciente3, "30/05/2025");


        hospital.exibirUnidades();
        System.out.println();

        upa.exibirMedicos();
        System.out.println();

        consulta1.exibirDetalhes();
        System.out.println();

        consulta2.exibirDetalhes();
        System.out.println();

        consulta3.exibirDetalhes();
    }
}
