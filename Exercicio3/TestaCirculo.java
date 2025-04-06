public class TestaCirculo{

    public static void main (String[] args){

        Circulo c1 = new Circulo (4.0);

        System.out.println(c1.raio + " " + c1.calcularArea() + " " + c1.calcularPerimetro() );
    }
}