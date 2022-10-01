package Correntista;

public abstract class Correntista {
    private static int proxCodigo = 1;
    private int codigo;
    private String nome;

    public Correntista(String nome) {
        codigo = getProxCodigo();
        this.nome = nome;
    }

    public abstract void exibeIdentificacao();

    public static int getProxCodigo() {
        return proxCodigo++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo(){
        return codigo;
    }
}
