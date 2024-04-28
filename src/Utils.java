import java.util.Scanner;

public class Utils {
    public static String[] obterCores() {
        Scanner scanner = new Scanner(System.in);
        String[] cores = new String[3];

        for (int i = 0; i < 3; i++) {
            while (true) {
                System.out.print("Informe a " + (i + 1) + "ª cor: ");
                String cor = scanner.nextLine().trim();

                if (!cor.isEmpty() && contemApenasLetras(cor) && !corRepetida(cores, cor)) {
                    cores[i] = cor;
                    break;
                } else {
                    System.out.println("Cor inválida ou repetida. Tente novamente.");
                }
            }
        }

        return cores;
    }

    public static boolean contemApenasLetras(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

    public static int[] obterTempos(String[] cores) {
        Scanner scanner = new Scanner(System.in);
        int[] tempos = new int[3];

        for (int i = 0; i < 3; i++) {
            while (true) {
                System.out.print("Tempo em segundos para a cor " + cores[i] + ": ");
                if (scanner.hasNextInt()) {
                    int tempo = scanner.nextInt();

                    if (tempo > 0) {
                        tempos[i] = tempo;
                        break;
                    } else {
                        System.out.println("Tempo deve ser maior que zero. Tente novamente.");
                    }
                } else {
                    System.out.println("Valor inválido. Informe um número inteiro.");
                    scanner.next();
                }
            }
        }

        return tempos;
    }

    public static boolean corRepetida(String[] cores, String cor) {
        for (String c : cores) {
            if (cor.equalsIgnoreCase(c)) {
                return true;
            }
        }
        return false;
    }
}