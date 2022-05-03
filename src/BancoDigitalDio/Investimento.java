package BancoDigitalDio;

public class Investimento extends Conta {

    public Investimento(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("===Extrato Investimentos===");
        super.imprimirInfosComuns();

    }
}
