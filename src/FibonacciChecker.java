
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Classe responsável por verificar se um número pertence à sequência de
 * Fibonacci.
 */
public class FibonacciChecker {

    /**
     * Solicita um número ao usuário e retorna o valor informado. Trata
     * possíveis exceções de entrada incorreta.
     *
     * @param scanner o objeto Scanner utilizado para leitura
     * @return o número informado pelo usuário
     * @throws InputMismatchException se o valor informado não for um número
     * inteiro
     */
    public static int getUserInput(Scanner scanner) throws InputMismatchException {
        System.out.print("Informe um número: ");
        return scanner.nextInt();
    }

    /**
     * Verifica se um número pertence à sequência de Fibonacci.
     *
     * @param number o número a ser verificado
     * @return true se o número pertence à sequência de Fibonacci, false caso
     * contrário
     */
    public static boolean isFibonacci(int number) {
        if (number < 0) {
            return false;
        }
        int a = 0;
        int b = 1;
        if (number == a || number == b) {
            return true;
        }
        int next = a + b;
        while (next <= number) {
            if (next == number) {
                return true;
            }
            a = b;
            b = next;
            next = a + b;
        }

        return false;
    }

    /**
     * Exibe o resultado da verificação se o número pertence ou não à sequência
     * de Fibonacci. Usa StringBuilder para construir a mensagem de saída.
     *
     * @param number o número informado pelo usuário
     * @param isFibonacci resultado da verificação
     */
    public static void displayResult(int number, boolean isFibonacci) {
        StringBuilder sb = new StringBuilder();
        String resposta = " não pertence";
        sb.append("O número ").append(number);
        if (isFibonacci) {
            resposta = " pertence";
        }
        sb.append(resposta);
        sb.append(" à sequência de Fibonacci.");
        System.out.println(sb.toString());
    }

    /**
     * Pergunta ao usuário se ele deseja verificar outro número.
     *
     * @param scanner o objeto Scanner utilizado para leitura
     * @return true se o usuário deseja continuar, false para encerrar o
     * programa
     */
    public static boolean shouldContinue(Scanner scanner) {
        System.out.print("Deseja verificar outro número? (s/n): ");
        String resposta = scanner.next().toLowerCase();

        return resposta.equals("s");
    }

    /**
     * Método principal que inicializa o programa. O loop continua até o usuário
     * decidir sair.
     *
     * @param args argumentos da linha de comando
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        int number;
        boolean result;
        while (continuar) {
            try {
                number = getUserInput(scanner);
                result = isFibonacci(number);
                displayResult(number, result);
                continuar = shouldContinue(scanner);
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por favor, informe um número inteiro.");
                scanner.next();
                continuar = true;
            }
        }
        scanner.close();
    }
}
