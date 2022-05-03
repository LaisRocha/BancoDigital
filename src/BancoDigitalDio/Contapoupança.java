package BancoDigitalDio;

public class Contapoupança extends Conta {

    public Contapoupança(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("===Extrato Conta Poupança===");
        super.imprimirInfosComuns();

    }
}
