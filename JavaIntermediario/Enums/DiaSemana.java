package JavaIntermediario.Enums;

public enum DiaSemana {
    Segunda(1),
    Terca(2),
    Quarta(3),
    Quinta(4),
    Sexta(5),
    Sabado(6),
    Domingo(7);

    private int valor;

    DiaSemana(int valor){
        this.valor = valor;
    }

    public int getValor(){
        return this.valor;
    }
}
