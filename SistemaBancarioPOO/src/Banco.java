import Conta.ContaFisica;
import Conta.ContaJuridica;
import Correntista.Correntista;
import Correntista.CorrentistaFisico;
import Correntista.CorrentistaJuridico;
import java.text.NumberFormat;
import java.util.ArrayList;

public class Banco {
    public static void main(String[] args){
        ArrayList<Correntista> listaDeClientes = new ArrayList<Correntista>();
        System.out.println("-------------------CLIENTES ---------------------------");
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

        try{
            System.out.println("-------------------EMPRESTIMO PESSOA FISICA---------------------------");
            double valorParcelaPF = correntista1.getConta().simulaEmprestimo(2000, 24);
            System.out.println("O valor das parcelas será: R"+ NumberFormat.getCurrencyInstance().format(valorParcelaPF));
        }catch (IllegalArgumentException e){
            System.out.println("Digite valores validos");        }

        try{
            System.out.println("-------------------EMPRESTIMO PESSOA FISICA---------------------------");
            double valorParcelaPJ = correntista4.getConta().simulaEmprestimo(20000, 12);
            System.out.println("O valor das parcelas será: R"+ NumberFormat.getCurrencyInstance().format(valorParcelaPJ));
        }catch (IllegalArgumentException e){
            System.out.println("Digite valores validos");
        }
    }
}
