import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Teste para validar solução de desafio
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor informar o saldo atual");
        double saldoAtual = scanner.nextDouble();
        System.out.println("Por favor informar o valor do depósito");
        double valorDeposito = scanner.nextDouble();
        double valorRetirada = scanner.nextDouble();

        //TODO: Calcular o saldo atualizado de acordo com a descrição deste desafio.
        saldoAtual =+ valorDeposito;
        saldoAtual =- valorRetirada;

        //TODO: Imprimir o a saída de conforme a tabela de exemplos (uma casa decimal).
        System.out.println("Saldo atualizado na conta: " + saldoAtual);
    }
}