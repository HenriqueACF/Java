package JavaBasico.Java;

import java.util.Scanner;

public class condicionaisSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("informe um dia da semana(1 à 7)");
        int dia = scan.nextInt();

        switch(dia){
            case 1:
                System.out.println("voce selecionou domingo");
            break;
            case 2:
                System.out.println("voce selecionou segunda feira");
            break;
            case 3:
                System.out.println("voce selecionou terça feira");
            break;
            case 4:
                System.out.println("voce selecionou quarta feira");
            break;
            case 5:
                System.out.println("voce selecionou quinta feira");
            break;
            case 6:
                System.out.println("voce selecionou sexta feira");
            break;
            case 7:
                System.out.println("voce selecionou sabado");
            break;
            default:
                System.out.println("opçao invalida");
            break;


        }

    }
}
