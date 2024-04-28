import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bem-vindo ao semáforo!");

        while (true) {
            String[] cores = Utils.obterCores();
            int[] tempos = Utils.obterTempos(cores);

            String resposta;

            do {
                System.out.print("Deseja iniciar o semáforo? (Sim ou Não): ");
                resposta = new Scanner(System.in).nextLine();
                if (!resposta.equalsIgnoreCase("Sim") && !resposta.equalsIgnoreCase("Não")) {
                    System.out.println("Por favor, responda apenas com 'Sim' ou 'Não'.");
                }
            } while (!resposta.equalsIgnoreCase("Sim") && !resposta.equalsIgnoreCase("Não"));

            if (resposta.equalsIgnoreCase("Não")) {
                System.out.println("Programa encerrado.");
                break;
            }

            Semaforo semaforo = new Semaforo(cores, tempos);
            semaforo.iniciarSemaforo();


            while (true) {
                semaforo.iniciarSemaforo();
            }
        }
    }
}
/* Patrick-1526
Kevin-1489
Gustavo-1525
 */