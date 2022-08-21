package JavaIntermediario;

public class teste {
    public static void main(String[] args) {
        usandoConstante();
        System.out.println();
        usandoEnum();
    }

    //Usando constantes para imprimir os dias da semana
    private static void usandoConstante(){

        int segunda = DiasDaSemana.Segunda;
        int terca = DiasDaSemana.Terca;
        int quarta = DiasDaSemana.Quarta;
        int quinta = DiasDaSemana.Quinta;
        int sexta = DiasDaSemana.Sexta;
        int sabado = DiasDaSemana.Sabado;
        int domingo = DiasDaSemana.Domingo;

        System.out.println("utilizando constantes no java");
        imprimeDiaSemana(segunda);
        imprimeDiaSemana(terca);
        imprimeDiaSemana(quarta);
        imprimeDiaSemana(quinta);
        imprimeDiaSemana(sexta);
        imprimeDiaSemana(sabado);
        imprimeDiaSemana(domingo);
    }

    private static void imprimeDiaSemana(int dia){
        switch (dia){
            case 1:
                System.out.println("Segunda feira");
                break;
            case 2:
                System.out.println("Terça feira");
                break;
            case 3:
                System.out.println("Quarta feira");
                break;
            case 4:
                System.out.println("Quinta feira");
                break;
            case 5:
                System.out.println("Sexta feira");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }
    }

    //usando enums para imprimir os dias da semana

    private static void usandoEnum(){
        DiaSemana segunda = DiaSemana.Segunda;
        DiaSemana terca = DiaSemana.Terca;
        DiaSemana quarta = DiaSemana.Quarta;
        DiaSemana quinta = DiaSemana.Quinta;
        DiaSemana sexta = DiaSemana.Sexta;
        DiaSemana sabado = DiaSemana.Sabado;
        DiaSemana domingo = DiaSemana.Domingo;

        System.out.println("utilizando Enum no java");
        imprimeDiaSemanaEnum(segunda);
        imprimeDiaSemanaEnum(terca);
        imprimeDiaSemanaEnum(quarta);
        imprimeDiaSemanaEnum(quinta);
        imprimeDiaSemanaEnum(sexta);
        imprimeDiaSemanaEnum(sabado);
        imprimeDiaSemanaEnum(domingo);
    }

    private static void imprimeDiaSemanaEnum(DiaSemana dia){
        switch (dia){
            case Segunda:
                System.out.println("Segunda feira");
                break;
            case Terca:
                System.out.println("Terça feira");
                break;
            case Quarta:
                System.out.println("Quarta feira");
                break;
            case Quinta:
                System.out.println("Quinta feira");
                break;
            case Sexta:
                System.out.println("Sexta feira");
                break;
            case Sabado:
                System.out.println("Sabado");
                break;
            case Domingo:
                System.out.println("Domingo");
                break;
        }
    }
}
