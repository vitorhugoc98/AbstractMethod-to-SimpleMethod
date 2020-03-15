package simpleAbstract;

public class FactoryCarro  {

    
    public Carro getCarro(String fabricante, String tipoVeiculo) {
        if(fabricante.equals("FORD")){
            if(tipoVeiculo.equals("SUV")){
                return new Edge(fabricante, tipoVeiculo);
            }else return new Fusion(fabricante, tipoVeiculo);
        }else if(fabricante.equals("CHEVROLET")){
            if(tipoVeiculo.equals("SUV")){
                return new Captiva(fabricante, tipoVeiculo);
            }else return new Cruze(fabricante, tipoVeiculo);
        }
        return null;
        
    }
}
