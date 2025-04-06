public class Circulo {
    //atributos
    double raio;

    //construtor 
    public Circulo (double raio){
        this.raio = raio;
    }

    //metódos
    public double calcularArea(){
        return Math.PI * raio * raio;
    }

    public double calcularPerimetro(){
        return 2 * Math.PI * raio;
    }

}
