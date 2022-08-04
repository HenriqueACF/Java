package JavaBasico.Java;

public class Loops {
    public static void main(String[] args) {
        //while
        System.out.println("------------WHILE-----------");
        int i = 1;
        int max = 10;

        while(i <= max){
            System.out.println("valor de i: " +i);
            i++;
        }
        System.out.println("==============DO WHILE=================");

        do {
            i++;
            System.out.println("valor de i" + i);
        } while(i < 15);

        System.out.println("===================== FOR ============ ");

        for (int count = 1; count <10; count++){
            System.out.println("valor do contador: "+count);
        }

    }
}
