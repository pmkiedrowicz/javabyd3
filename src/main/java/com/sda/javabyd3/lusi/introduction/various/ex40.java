package com.sda.javabyd3.lusi.introduction.various;


import java.util.Optional;
import java.util.Scanner;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

/**
 * Napisz program rozwiązujący równanie kwadratowe ax2 + bx + c. Użytkownik musi
 * podać wartości a, b oraz c. Program musi sprawdzić czy wprowadzone liczby są
 * cyframi. Jeśli nie użytkownik musi podać wartości do momentu aż będą poprawne.
 * Korzystając z pętli switch wyznacz pierwiastki równania kwadratowego w zależności
 * od ilości rozwiązań (Mogą być 2, 1 lub wcale). Postaraj się przygotować klasę i
 * metodę odpowiedzialną za obliczanie rozwiązania. Klasa powinna zawierać metodę
 * o następującej sygnaturze (sygnatura do definicja metody składająca się z
 * modyfikatora dostępu, zwracanego typu, nazwy, oraz przyjmowanych argumentów)
 */
public class ex40 {
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";

	public static void main(String[] args) {
		System.out.println(ANSI_GREEN + "Program rozwiązuje równanie kwadratowe ax2 + bx + c" + ANSI_RESET);

		int a = getEquationFactor("a");
		int b = getEquationFactor("b");
		int c = getEquationFactor("c");

		EquationSolver equationSolver = new EquationSolver();
		Solution solution = equationSolver.calculate(a, b, c);
		displaySolution(solution);
	}

	public static int getEquationFactor(String factorName) {
		Scanner scanner = new Scanner(System.in);
		Optional<Integer> result = Optional.empty();
		do {
			try {
				System.out.print("Podaj współczynnik " + factorName + ": ");
				result = Optional.of(Integer.parseInt(scanner.nextLine()));
			} catch (Exception e) {
				System.out.println(ANSI_RED + "Podałeś nieprawidłową wartość" + ANSI_RESET);
			}
		} while (!result.isPresent());

		return result.get();
	}

	public static void displaySolution(Solution solution) {
		String msg;
		if (nonNull(solution.getX1()) && nonNull(solution.getX2())) {
			msg = String.format("Równanie ma 2 rozwiązania: x1=%.2f i x2=%.2f", solution.getX1(), solution.getX2());
		} else if (nonNull(solution.getX1()) && isNull(solution.getX2())) {
			msg = String.format("Równanie ma 1 rozwiązanie: x=%.2f", solution.getX1());
		} else {
			msg = "Rozwiązanie nie ma rozwiązań";
		}
		System.out.println(msg);

	}
}
