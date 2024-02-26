package examen;

import java.util.*;
/**Clase que simula el juego de piedra papel y tijera.
 * @param Keyboard Un entero inicializado a 0
 * @param scanner Un scanner
 * @param optionList Un arraylist inicializado con tres valores ("Rock", "Paper" y "Scissors")*/
public class RockPaperScissors {
	private static int keyboard = 0;
	private static Scanner scanner = new Scanner(System.in);
	public static List<String> optionList = Arrays.asList("Rock", "Paper", "Scissors");

	/**@constructor constructor por defecto */
	public RockPaperScissors() {
	}

	/**Método main que ejecuta un bucle que se ejecuta hasta que pongamos una opción correcta (entre 1 y 3 incluidos)
	 * almacena nuestra decision en la variable userChoice y nos muestra nuestra decision y la de computer
	 * para posteriormente llamar al metodo checkGame*/
	public static void main(String[] args) {
		do {
			System.out.println("Welcome to Rock, Paper, Scissors!");
			System.out.print("Enter your choice (Rock(1), Paper(2), or Scissors(3)): ");
			keyboard = scanner.nextInt();
			scanner.nextLine();
		} while (keyboard < 1 || keyboard > 3);
		String computerChoice = optionList.get(new Random().nextInt(3));
		String userChoice = optionList.get(keyboard - 1);
		System.out.println("Your chose: " + userChoice + "\nComputer chose: " + computerChoice);
		System.out.println(RockPaperScissors.checkGame(computerChoice, userChoice));
		scanner.close();
	}

	/**Clase que según los resultados del usuario y el computer, escribe el resultado obtenido
	 * @param userChoice Es la opción que elige el usuario
	 * @param computerChoice Es la opción generada aleatoriamente por el computer
	 * @param gameResult Es una variable que contiene el resultado
	 * @return Devuelve la variable que contiene el resultado*/
	public static String checkGame(String userChoice, String computerChoice) {
		String gameResult = "";
		if (userChoice.equals(computerChoice)) {
			gameResult = "It's a tie!";
		} else if (userChoice.equals("Rock") && computerChoice.equals("Scissors")) {
			gameResult = "You win this round!";
		} else if (userChoice.equals("Paper") && computerChoice.equals("Rock")) {
			gameResult = "You win this round!";
		} else if (userChoice.equals("Scissors") && computerChoice.equals("Paper")) {
			gameResult = "You win this round!";
		} else {
			gameResult = "Computer wins this round!";
		}
		return gameResult;
	}
}