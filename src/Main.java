public class Main {
    public static void main(String[] args) {
        // Aula de Orientação á objetos
        // Declarar objetos
        Pessoa adao;
        // instanciar objetos
        adao = new Pessoa();
        Pessoa eva = new Pessoa();
        // Definição do formato
        adao.nome = "Adão";
        adao.sobrenome = "Silva";
        eva.nome = "Eva";
        eva.sobrenome = "Silva";
        // Adicionar comportamento
        adao.falar();
        eva.falar();
    }
}