package JavaPOO.SuperHenrança;

public class Aluno extends Pessoa {

    public Aluno(){
        super();
    }

    public Aluno(String nome, String endereco, String telefone, String curso, double[] notas) {
        super(nome, endereco, telefone);
        this.curso = curso;
        this.notas = notas;
    }

    private String curso;
    private double[] notas;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calularMedia(){
        return 0;
    }

    public boolean verificarAprovacao(){
        return true;
    }
}
