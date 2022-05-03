package BancoDigitalDio;

public class Main {
    public static void main(String[] args) {
        Cliente lais = new Cliente();
        lais.setNome("Lais");

        Conta cc = new ContaCorrente(lais);
        Conta poupanca = new Contapoupança(lais);
        Conta investimeto = new Investimento(lais);
        Conta cartaodecredito = new CartaoDeCredito(lais);


        cc.depositar(100);
        cc.transferir(100, poupanca);
        investimeto.investir(100);
        cartaodecredito.cartaodecredito(150);
        cartaodecredito.cartaodecredito(200);
        cartaodecredito.cartaodecredito(50);
        cartaodecredito.cartaodecredito(30);


        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        investimeto.imprimirExtrato();
        cartaodecredito.imprimirExtrato();
    }
}
