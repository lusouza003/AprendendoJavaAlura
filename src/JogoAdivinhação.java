import java.util.Random;
import java.util.Scanner;
public class JogoAdivinhação {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                double numeroAleatorio = new Random().nextInt(100);
                double contador = 0;
                while (contador < 5) {
                    System.out.println("Digite um número entre 0 e 100: ");
                    double numeroAdivinhado = scanner.nextDouble();
                    contador = contador + 1;
                    System.out.println(contador);
                    if (numeroAdivinhado == numeroAleatorio) {
                        System.out.println("Voce acertou");
                        break;
                    } else
                        System.out.println("Voce errou tente novamente");

                }
                if (contador == 5) {
                    System.out.println("Você não conseguiu adivinhar o número em 5 tentativas. O número era " + numeroAleatorio);

                }
            }
    }
