package JavaBasico.Java;

public class Operadores {
    public static void main(String[] args) {
        int adicao = 1 + 1;
        System.out.println("o resultado da soma é:" + adicao);

        int subtracao = 100 - adicao;
        System.out.println("o resultado da subtração foi é:" + subtracao);

        double divisao = subtracao / 2;
        System.out.println("o resultado da divisao é: "+ divisao);

        double multiplicacao = divisao * 3;
        System.out.println("o resultado da multiplicação é: "+ multiplicacao);

        int valor1 = 10;
        int valor2 = 2;

        System.out.println("valor1 == valor2 " + (valor1 == valor2));
        System.out.println("valor1 != valor2 " + (valor1 != valor2));
        System.out.println("valor1 > valor2 " + (valor1 > valor2));
        System.out.println("valor1 < valor2 " + (valor1 < valor2));
        System.out.println("valor1 >= valor2 " + (valor1 >= valor2));
        System.out.println("valor1 <= valor2 " + (valor1 <= valor2));

        int value1 = 10;
        int value2 = 4;

        // && = AND, || = OR
    }
}
