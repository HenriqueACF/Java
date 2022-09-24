package Correntista;

public class CorrentistaJuridico extends Correntista{
    private String nomeResponsavel;

    public CorrentistaJuridico(String nome, String nomeResponsavel) {
        super(nome);
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }
}