package com.sda.javabyd3.lusi.introduction.regularexpression.ex04;


import com.sda.javabyd3.lusi.introduction.TextColor;
import com.sda.javabyd3.lusi.introduction.Utils;
import com.sda.javabyd3.lusi.introduction.regularexpression.ConsoleHelper;

public class Main {
	public static void main(String[] args) {
		String word = ConsoleHelper.displayMessageAndGetValue("Wprowadź słowo");
		if (new WordValidator().isValid(word)) {
			Utils.displayTextOnConsole(TextColor.ANSI_GREEN, "%s zawiera słowo ala", word);
		} else {
			Utils.displayTextOnConsole(TextColor.ANSI_RED, "%s nie zawiera słowa ala", word);
		}
	}
}
