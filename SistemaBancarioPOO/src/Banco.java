import Conta.ContaFisica;
import Conta.ContaJuridica;
import Correntista.Correntista;
import Correntista.CorrentistaFisico;
import Correntista.CorrentistaJuridico;
import java.io.*;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;

public class Banco {
    private ArrayList<Correntista> listaDeClientes;
    public Banco() {
        listaDeClientes = new ArrayList<Correntista>();
    }

    public Collection<Correntista> getListaDeClientes() {
        return listaDeClientes;
    }

    public void setListaDeClientes(Collection<Correntista> c){
        this.listaDeClientes = new ArrayList<>(c);
    }
    void SalvaClientes() throws IOException {
        File file = new File("Database.dat");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        for(Correntista c: listaDeClientes){
            oos.writeObject(c);
        }
        //fecha fluxo
        oos.close();
    }
    void leClientes() throws IOException, ClassNotFoundException {
        File file = new File("Database.dat");
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        Object obj = null;
        try{
            while ((obj = ois.readObject()) != null) {
                this.listaDeClientes.add((Correntista) obj);
            }
        } catch (EOFException e){

        }
        finally {
            ois.close();
        }

    }
    public static void main(String[] args){

        Banco banco = new Banco();
        
        System.out.println("-------------------CLIENTES ---------------------------");
        CorrentistaFisico correntista1 = new CorrentistaFisico("Henrique", new ContaFisica());
        banco.getListaDeClientes().add(correntista1);
        CorrentistaFisico correntista2 = new CorrentistaFisico("João", new ContaFisica());
        banco.getListaDeClientes().add(correntista2);
        CorrentistaFisico correntista3 = new CorrentistaFisico("Maria", new ContaFisica());
        banco.getListaDeClientes().add(correntista3);
        CorrentistaJuridico correntista4 = new CorrentistaJuridico("Henrique Dev", "Henrique Assis", new ContaJuridica());
        banco.getListaDeClientes().add(correntista4);

        try {
            banco.SalvaClientes();
        } catch (IOException e){}

        try {
            banco.leClientes();
            for(Correntista c: banco.getListaDeClientes()){
                System.out.println(c.getNome());
            }
        } catch (Exception e){}

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
