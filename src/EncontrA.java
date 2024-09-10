
import java.util.Scanner;

/**
 * Classe para encontrar o número de ocorrências da letra 'a' (maiúscula ou
 * minúscula) em uma string fornecida.
 */
public class EncontrA {

    /**
     * Método que verifica se o usuário deseja continuar a verificar outra
     * string.
     *
     * @param scanner Scanner para entrada do usuário.
     * @return true se o usuário quiser continuar, false caso contrário.
     */
    public static boolean shouldContinue(Scanner scanner) {
        System.out.print("Deseja verificar outra frase? (s/n): ");
        String resposta = scanner.next().toLowerCase();

        return resposta.equals("s");
    }

    /**
     * Exibe o resultado para o número de ocorrências de 'a' na string
     * fornecida.
     *
     * @param entrada A string fornecida pelo usuário.
     * @param numerosDeA O número de ocorrências da letra 'a' na string.
     */
    public static void displayResult(String entrada, int numerosDeA) {
        System.out.println("A frase '" + entrada + "' contém " + numerosDeA + " ocorrência(s) da letra 'a'.");
    }

    /**
     * Conta o número de ocorrências da letra 'a' (maiúscula ou minúscula) na
     * string fornecida.
     *
     * @param entrada A string fornecida pelo usuário.
     * @return O número de ocorrências da letra 'a' na string.
     */
    public static int EncontrA(String entrada) {
        int contador = 0;
        for (int i = 0; i < entrada.length(); i++) {
            if (Character.toLowerCase(entrada.charAt(i)) == 'a') {
                contador++;
            }
        }
        return contador;
    }

    /**
     * Solicita ao usuário a entrada de uma string para análise.
     *
     * @param scanner Scanner para entrada do usuário.
     * @return A string fornecida pelo usuário.
     */
    public static String SolicitarEntrada(Scanner scanner) {
        System.out.print("Informe a frase que deseja saber o número de 'a' presente: \n");
        return scanner.nextLine();
    }

    /**
     * Método principal que executa o programa.
     *
     * @param args Argumentos da linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada;
        boolean continuar = true;
        int numerosDeA;

        while (continuar) {
            try {
                entrada = SolicitarEntrada(scanner);
                numerosDeA = EncontrA(entrada);
                displayResult(entrada, numerosDeA);
                continuar = shouldContinue(scanner);
            } catch (Exception e) {
                System.out.println("Erro: Entrada inválida. Por favor, informe uma entrada válida.");
                scanner.next();
                continuar = true;
            }
        }
        scanner.close();
    }
}
