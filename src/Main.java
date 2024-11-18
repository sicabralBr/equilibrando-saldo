import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList< String > ativos = new ArrayList < > ();

        //Entrada dos tipos de ativos
        System.out.println("Informe a quantidade de ativos: ");
        int quantidadeAtivos = scanner.nextInt();

        // Entrada dos códigos dos ativos
        for (int i = 0; i <= quantidadeAtivos; i++) {
            String codigoAtivo = scanner.nextLine();
            ativos.add(codigoAtivo);
        }

        //TODO: Ordenar os ativos em ordem alfabética.
        Collections.sort(ativos);

        //TODO: Imprimir a lista de ativos ordenada, conforme a tabela de exemplos.
        ativos.forEach(System.out::println);
    }
}