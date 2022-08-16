package JavaPOO.Exception;

public class TryCatch {
    public static void main(String[] args) {
        // try e catch normal
//        try{
//            int[] vetor = new int[4];
//            vetor[4] = 1;
//        } catch (ArrayIndexOutOfBoundsException exception){
//            System.out.println("erro ao acessar um indice de um vetor que nao existe");
//        }
//        System.out.println("imprimir texto apos a exception");


        // multiplos catchs
        int[] numeros = {3,6,9,12,15,18,21,24,27,30};
        int[] denominadores = {0,3,6};

        for(int i = 0; i< numeros.length; i++){
            try{
                System.out.println(numeros[i] + "/" + denominadores[i] + " = " + (numeros[i]/denominadores[i]));
            } catch (ArithmeticException e1){
                System.out.println("erro ao dividir por zero");
            } catch (ArrayIndexOutOfBoundsException e2){
                System.out.println("posição do array invalida ");
            }
        }

    }
}
