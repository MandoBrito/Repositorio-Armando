package Questao2;

public class Main {
    public static void main(String[] args) {
        Instrutor Olga = new Instrutor("Olga Ester", "Bacharel", "olga@unifesspa.edu.br", 8);
        Instrutor Sophia = new Instrutor("Sophia Ester", "Bacharel", "sophia@unifesspa.edu.br", 4);
        Instrutor Lara = new Instrutor("Lara Ester", "Bacharel", "lara@unifesspa.edu.br", 4);



        Curso Informatica = new Curso(
                "Informatica", 120, "Básico", "Curso Basicos de Informatica");

        Informatica.addInstrutor(Olga);
        Informatica.addInstrutor(Sophia);
        Informatica.addInstrutor(Lara);


        Informatica.exibirDetalhes();
    }
}
