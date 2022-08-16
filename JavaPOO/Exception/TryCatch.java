package JavaPOO.Exception;

public class TryCatch {
    public static void main(String[] args) {
        try{
            int[] vetor = new int[4];
            vetor[4] = 1;
        } catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("erro ao acessar um indice de um vetor que nao existe");
        }
        System.out.println("imprimir texto apos a exception");
    }
}
