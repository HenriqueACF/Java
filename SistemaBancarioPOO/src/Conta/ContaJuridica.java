package Conta;
import Conta.Interface.Conta;

public class ContaJuridica implements Conta {
    private double saldo = 0.0;

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
}