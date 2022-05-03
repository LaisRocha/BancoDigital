package BancoDigitalDio;

public class CartaoDeCredito extends Conta{

    public CartaoDeCredito(Cliente cliente) {
        super(cliente);
    }


    @Override
    public void imprimirExtrato() {
        System.out.println("===Cartão de Crédito===");
        System.out.println("**Vencimento 15**");
        System.out.println("**Melhor dia para compra 10**");
        System.out.println(String.format("Valor da Ultima Compra: %.2f", this.ultimacompra));
        System.out.println(String.format("Saldo Devedor Total: %.2f", this.compras));
       // System.out.println(String.format("Saldo Devedor Total: %.2f" , this.compras + this.ultimacompra));

    }
}
