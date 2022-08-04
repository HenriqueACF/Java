package JavaBasico.Java;

import java.util.Scanner;

public class condicionais {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("informe sua idade: ");
        int idade = scan.nextInt();

        if(idade < 18){
            System.out.println("voce é menor de idade");
        }else{
            System.out.println("voce é maior de idade");
        }
    }
}
