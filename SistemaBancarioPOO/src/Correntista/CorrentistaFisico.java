package Correntista;
import Conta.Interface.Conta;

public class CorrentistaFisico extends Correntista{

    public CorrentistaFisico(String nome, Conta conta) {
        super(nome, conta);
    }

    public void exibeIdentificacao(){
        System.out.println("Eu sou um correntista fisico: " + getCodigo() + " -> " + getNome());
    }
}
