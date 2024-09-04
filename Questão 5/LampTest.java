public class LampTest {
    public static void main(String[] args) {
        // Simulação dos interruptores e lâmpadas
        boolean[] lamps = new boolean[3]; // False = apagada, True = acesa
        boolean[] switches = new boolean[3]; // False = desligado, True = ligado

        // Liga o interruptor 1 e espera um tempo
        switches[0] = true;
        // Simula o tempo de espera para a lâmpada esquentar
        pause(5);

        // Desliga o interruptor 1 e liga o interruptor 2
        switches[0] = false;
        switches[1] = true;
        // Simula a ida para a sala das lâmpadas

        // Vamos simular a leitura das lâmpadas
        lamps[0] = true; // Lâmpada 1
        lamps[1] = false; // Lâmpada 2
        lamps[2] = true; // Lâmpada 3

        // Verifica o estado das lâmpadas
        for (int i = 0; i < 3; i++) {
            if (lamps[i]) {
                System.out.println("Lâmpada " + (i + 1) + " está acesa.");
            } else {
                System.out.println("Lâmpada " + (i + 1) + " está apagada.");
            }
        }

        // Desliga o interruptor 2 e liga o interruptor 3
        switches[1] = false;
        switches[2] = true;
        // Simula a ida para a sala das lâmpadas
    }

    private static void pause(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
