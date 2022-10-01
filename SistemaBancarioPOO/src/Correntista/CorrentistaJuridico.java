package Correntista;
import Conta.Interface.Conta;

public class CorrentistaJuridico extends Correntista{
    private String nomeResponsavel;

    public CorrentistaJuridico(String nome, String nomeResponsavel, Conta conta) {
        super(nome, conta);
        this.nomeResponsavel = nomeResponsavel;
    }

    public void exibeIdentificacao(){
        System.out.println("Eu sou um correntista juridico: " + getCodigo() + " -> " + getNome());
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }
}
