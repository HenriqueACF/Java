package JavaBasico.Java;

public class Array {
    public static void main(String[] args) {

        double[] temperaturas = new double[365];
        temperaturas[0] = 31.3;
        temperaturas[1] = 31.9;
        temperaturas[2] = 32.5;
        temperaturas[3] = 32.8;

        System.out.println("o valor da temperatura do dia 2 é: " + temperaturas[1]);
        System.out.println("o tamanho do array é: " + temperaturas.length);

        // for para array
        for (double temp: temperaturas ) {
            System.out.println(temp);
        }

        // matriz
        double [][] notasAlunos = new double[30][4];
        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7.5;
        notasAlunos[0][2] = 6.8;
        notasAlunos[0][3] = 9.5;

        notasAlunos[1][0] = 7;
        notasAlunos[1][1] = 7.5;
        notasAlunos[1][2] = 8.8;
        notasAlunos[1][3] = 7.5;
    }
}
