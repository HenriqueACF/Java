import Correntista.Correntista;

public class Banco {
    public static void main(String[] args){
        Correntista correntista1 = new Correntista( "Henrique");
        Correntista correntista2 = new Correntista( "João");
        Correntista correntista3 = new Correntista("Maria");

        System.out.println(correntista1.getCodigo() + " - " + correntista1.getNome());
        System.out.println(correntista2.getCodigo() + " - " + correntista2.getNome());
        System.out.println(correntista3.getCodigo() + " - " + correntista3.getNome());
    }
}
