import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Opções do jogo
        String[] choices = {"pedra", "papel", "tesoura"};

        System.out.println("Bem-vindo ao Jogo Pedra, Papel e Tesoura!");
        System.out.print("Escolha uma opção (pedra, papel, tesoura): ");
        String userChoice = scanner.nextLine().toLowerCase();

        // Verificar se a escolha do usuário é válida
        if (!userChoice.equals("pedra") && !userChoice.equals("papel") && !userChoice.equals("tesoura")) {
            System.out.println("Escolha inválida. Tente novamente.");
            return;
        }

        // Escolha aleatória do computador
        String computerChoice = choices[random.nextInt(3)];

        System.out.println("Você escolheu: " + userChoice);
        System.out.println("Computador escolheu: " + computerChoice);

        // Determinar o resultado
        if (userChoice.equals(computerChoice)) {
            System.out.println("Empate!");
        } else if (
                (userChoice.equals("pedra") && computerChoice.equals("tesoura")) ||
                        (userChoice.equals("papel") && computerChoice.equals("pedra")) ||
                        (userChoice.equals("tesoura") && computerChoice.equals("papel"))
        ) {
            System.out.println("Você venceu!");
        } else {
            System.out.println("Você perdeu!");
        }
    }
}
