import Conta.ContaFisica;
import Conta.ContaJuridica;
import Correntista.Correntista;
import Correntista.CorrentistaFisico;
import Correntista.CorrentistaJuridico;
import java.util.ArrayList;

public class Banco {
    public static void main(String[] args){
        ArrayList<Correntista> listaDeClientes = new ArrayList<Correntista>();

        CorrentistaFisico correntista1 = new CorrentistaFisico("Henrique", new ContaFisica());
        listaDeClientes.add(correntista1);
        CorrentistaFisico correntista2 = new CorrentistaFisico("João", new ContaFisica());
        listaDeClientes.add(correntista2);
        CorrentistaFisico correntista3 = new CorrentistaFisico("Maria", new ContaFisica());
        listaDeClientes.add(correntista3);
        CorrentistaJuridico correntista4 = new CorrentistaJuridico("Henrique Dev", "Henrique Assis", new ContaJuridica());
        listaDeClientes.add(correntista4);

        correntista1.exibeIdentificacao();
        correntista2.exibeIdentificacao();
        correntista3.exibeIdentificacao();
        correntista4.exibeIdentificacao();
    }
}
