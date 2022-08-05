package JavaPOO;

public class CarroObjeto {

    public CarroObjeto(String marca_, String modelo_,
                       int numPassageiros_, double capCombistivel_, double consumoCombustivel_){
        marca = marca_;
        modelo = modelo_;
        numPassageiros = numPassageiros_;
        capCombistivel = capCombistivel_;
        consumoCombustivel = consumoCombustivel_;
    }
    String marca;
    String modelo;
    int numPassageiros;
    double capCombistivel;
    double consumoCombustivel;

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
