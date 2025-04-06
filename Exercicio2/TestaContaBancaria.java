public class TestaContaBancaria{
    
    public static void main (String[] args){

    ContaBancaria conta = new ContaBancaria("12345-6", "Mariana", 2000.00);

    conta.depositar(600.00);
    conta.sacar(200.00);

    System.out.println(conta.numeroConta + "  " +  conta.titular + "  " + conta.saldo);
    }
}