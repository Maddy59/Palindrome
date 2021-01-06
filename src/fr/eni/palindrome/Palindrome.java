package fr.eni.palindrome;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Bienvenu");
		System.out.println("Votre phrase est-elle un paladrome?");
		// Transforme la saisie en variable de type String et de nom phrase
		String phrase = scannerString("Veuillez entrer votre texte:");
		// Retire les espaces de la phrase saisie grace à la méthode
		// "formatPhrase"
		phrase = formatPhrase(phrase);
		System.out.println(phrase);
		// variables
		int longeurPhrase = phrase.length();
		int millieuPhrase = longeurPhrase / 2;
		int indiceLettre = 0;
		boolean palindrome = true;
		// code pour le palindrome
		while ((indiceLettre < millieuPhrase) && (palindrome)) {
			if (phrase.charAt(indiceLettre) != phrase
					.charAt(longeurPhrase - indiceLettre - 1)) {
				palindrome = false;
			}
			indiceLettre++;
		}
		if (palindrome) {
			System.out.println("C'est un palindrome !");
		} else {
			System.out.println("Ce n'est pas un palindrome!");
		}
	}

	// Formate la phrase en enlevant les espaces
	private static String formatPhrase(String phrase) {
		phrase = phrase.replace(" ", "");
		phrase = phrase.toLowerCase();
		return phrase;
	}

	// Affiche un message et retourne une saisie de type String
	private static String scannerString(String message) {
		System.out.println(message);
		Scanner scan = new Scanner(System.in);
		return scan.nextLine();
	}
}
