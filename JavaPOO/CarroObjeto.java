package JavaPOO;

public class CarroObjeto {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombistivel;
    double consumoCombustivel;

    void exibirAutonomia(){
        System.out.println("a autonomia do carro é: "+ capCombistivel * consumoCombustivel + "Km");
    }

    double obterAutonomia(){
        System.out.println("metodo obter autonima foi chamado");
        return capCombistivel * consumoCombustivel;
    }
}
