package com.sda.javabyd3.lusi.exg009.ex03;

import static com.sda.javabyd3.lusi.introduction.Utils.displayTextAndGetValue;
import static com.sda.javabyd3.lusi.introduction.Utils.displayTextOnConsole;

public class Menu {

    public void displayMenu() {
        displayTextOnConsole("Program umożliwia wyszukiwanie osób");
        displayTextOnConsole("Wciśnij:");
        displayTextOnConsole("1 by wyszukiwać po imieniu");
        displayTextOnConsole("2 by wyszukiwać po nazwisku");
        displayTextOnConsole("3 by wyszukiwać po e-mailu");
        displayTextOnConsole("4 by wyszukiwać po telefonie");
        displayTextOnConsole("5 by wyszukiwać po wszystkich polach");
    }

    public SearchByEnum getAnswer() {
        String answer = displayTextAndGetValue("Wprowadź odpowiedź: ", false);
        return SearchByEnum.forInt(Integer.parseInt(answer));
    }

    public String searchText() {
        String answer = displayTextAndGetValue("Wprowadź text: ", false);
        return answer;
    }
}
