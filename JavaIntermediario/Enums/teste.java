package JavaIntermediario.Enums;

public class teste {
    public static void main(String[] args) {
        DiaSemana dia = DiaSemana.Domingo;
        System.out.println(dia.toString() + " - " + dia.getValor());

        Data data = new Data(1, 4,1997, DiaSemana.Quinta);
    }
}
