public class Semaforo {
    private String[] cores;
    private int[] tempos;

    public Semaforo(String[] cores, int[] tempos) {
        this.cores = cores;
        this.tempos = tempos;
    }

    public void iniciarSemaforo() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Cor do semáforo: " + cores[i]);
            try {
                Thread.sleep(tempos[i] * 1000);
            } catch (InterruptedException e) {
                System.err.println("Erro: " + e.getMessage());
            }
        }
    }
}