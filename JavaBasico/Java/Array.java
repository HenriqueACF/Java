package JavaBasico.Java;

public class Array {
    public static void main(String[] args) {

        double[] temperaturas = new double[365];
        temperaturas[0] = 31.3;
        temperaturas[1] = 31.9;
        temperaturas[2] = 32.5;
        temperaturas[3] = 32.8;

        System.out.println("o valor da temperatura do dia 2 é: " + temperaturas[1]);
        System.out.println("o tamanho do array é: " + temperaturas.length);

        // foreach
        for (double temp: temperaturas ) {
            System.out.println(temp);
        }
    }
}
