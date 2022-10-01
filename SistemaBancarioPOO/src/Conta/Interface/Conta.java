package Conta.Interface;

public interface Conta {

    void extrato();
    void deposito(double valor);
    void saque(double valor);

    //cf = capital financiado
    //n = numero de meses
    double simulaEmprestimo(double cf, int n);
}
