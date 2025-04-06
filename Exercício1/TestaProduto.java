public class TestaProduto{
    public static void main(String[] args){
        
        Produto a1 = new Produto ("Celular", 2000, 2);
        
        System.out.println (a1.nome + " " + a1.calculaValorTotal() + " " + a1.aplicarDesconto(10));


    }
}