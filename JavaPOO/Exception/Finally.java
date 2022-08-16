package JavaPOO.Exception;

public class Finally {

        public static void main(String[] args) {

            int[] numeros = {3,6,9,12,15,18,21,24,27,30};
            int[] denominadores = {0,3,6};

            for(int i = 0; i< numeros.length; i++){
                try{
                    System.out.println(numeros[i] + "/" + denominadores[i] + " = " + (numeros[i]/denominadores[i]));
                }
                catch (ArithmeticException e1){
                System.out.println("erro ao dividir por zero");
                } catch (ArrayIndexOutOfBoundsException e2){
                    System.out.println("posição do array invalida ");
                } finally {
                    System.out.println("linha executada apos o try e catch");
                }
        }

    }
}

