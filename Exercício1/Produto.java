public class Produto {
    //atributos
    String nome;
    double preco;
    int quantidade;

    //construtores
    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco= preco;
        this.quantidade = quantidade;
    }

    //metódos
    public double calculaValorTotal(){
        double valor = preco * quantidade;
        return valor;
    }

    public double aplicarDesconto(double percentual){
        double desconto = preco * (percentual / 100);
        preco -= desconto;
        return preco;
    }

}