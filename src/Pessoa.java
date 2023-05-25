
public class Pessoa extends Animal {
    // Atributos da classe
    public String sobrenome;
    // Método da classe
    public void falar(){
        System.out.println("Falei");
    }
    public String falar(String volume){
        return "falei" + volume;
    }
    public void comer() {
        System.out.println("Pessoa comeu");
    }
}
