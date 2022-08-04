package JavaBasico.Java;

import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine();
        System.out.println("digite a sua idade: ");
        int idade = scan.nextInt();
        System.out.println("seu nome é: " + nome + ", sua idade é: " + idade);
    }
}
