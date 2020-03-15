package simpleAbstract;

public class Client {

    public static void main(String[] args) {
        FactoryCarro factory = new FactoryCarro();
        String fabricante = "CHEVROLET";
        String tipoVeiculo = "Seda";
        factory.getCarro(fabricante,tipoVeiculo);
    }

}
