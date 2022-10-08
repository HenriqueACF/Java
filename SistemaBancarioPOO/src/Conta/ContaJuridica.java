package Conta;
import Conta.Interface.Conta;

public class ContaJuridica implements Conta {
    private double saldo = 0.0;
    //I = taxa de juros
    public static final double I = 0.05;

    @Override
    public void extrato() {
        System.out.println("Saldo da conta fisica: " + saldo);
    }

    @Override
    public void deposito(double valor) {
        saldo += valor;
        System.out.println("Valor depositado: "+ valor);
    }

    @Override
    public void saque(double valor) {
        if(valor <= saldo){
            saldo -= valor;
            System.out.println("Valor sacado: "+ valor);
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public double simulaEmprestimo(double cf, int n) throws IllegalArgumentException {
        if(cf <= 0.0 || n <= 0){
            throw new IllegalArgumentException();
        }else
        {
            return I/(1-1/Math.pow(1+I, n))*cf;
        }
    }
}
