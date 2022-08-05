package JavaPOO;

public class CarroObjeto {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombistivel;
    double consumoCombustivel;

    public CarroObjeto(String marca, String modelo,
                       int numPassageiros, double capCombistivel, double consumoCombustivel){
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombistivel = capCombistivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    // metodos simples
    void exibirAutonomia(){
        System.out.println("a autonomia do carro é: "+ capCombistivel * consumoCombustivel + "Km");
    }

    //metodos com argumentos
    double obterAutonomia(){
        System.out.println("metodo obter autonima foi chamado");
        return capCombistivel * consumoCombustivel;
    }

// metodos com parametros
    double  calcularCombustivel(double km){
        double qtdCombustivel = km/consumoCombustivel;
        return qtdCombustivel;
    }
}
