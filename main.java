import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1; // Número entre 1 y 100
        Scanner scanner = new Scanner(System.in);
        int intento = 0;
        int adivinanza;

        System.out.println("¡Adivina el número secreto entre 1 y 100!");

        do {
            System.out.print("Tu intento: ");
            adivinanza = scanner.nextInt();
            intento++;

            if (adivinanza < numeroSecreto) {
                System.out.println("Muy bajo.");
            } else if (adivinanza > numeroSecreto) {
                System.out.println("Muy alto.");
            } else {
                System.out.println("¡Correcto! Adivinaste en " + intento + " intentos.");
            }

        } while (adivinanza != numeroSecreto);

        scanner.close();
    }
}

