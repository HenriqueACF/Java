package JavaPOO;

public class CarroTeste {
    public static void main(String[] args) {
        CarroObjeto van = new CarroObjeto();
        van.marca = "fiat";
        van.modelo = "ducato";
        van.numPassageiros = 10;
        van.capCombistivel= 100;
        van.consumoCombustivel = 0.2;

        van.exibirAutonomia();
        double autonomia = van.obterAutonomia();
        System.out.println("autonomia do carro é: "+ autonomia);
        double qtdCombustivel = van.calcularCombustivel(20);
        System.out.println(qtdCombustivel);
    }
}
