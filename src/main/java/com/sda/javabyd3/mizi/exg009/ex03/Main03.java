package com.sda.javabyd3.mizi.exg009.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Michal Ziolecki.
 */
public class Main03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        List<PersonalData> listOfPersonalData = new ArrayList <>(  );
        JSONcreator jsonCreator = new JSONcreator();
        FindContact findContact;
        String answer = null;
        String filteredBy = null;
        String textToFilter = null;

        System.out.println("Czy stworzyc kontakty czy czytac z pliku? (k || p)");
        while(true){
            answer = scanner.nextLine();
            if(answer.equals( "k" )){
                jsonCreator.printToFileWithJSONformat();
                listOfPersonalData = jsonCreator.readFromFileWithJSONformat();
                break;
            }
            else if(answer.equals( "p" )){
                listOfPersonalData = jsonCreator.readFromFileWithJSONformat();
                break;
            }else System.out.println("Podaj p lub k");
        }

        System.out.println("Testowane wyswietlenie z to String");
        for(PersonalData person: listOfPersonalData)
        {
            System.out.println(person.toString());
        }

        findContact = new FindContact( listOfPersonalData );
        System.out.println("Wybierz po czy filtrowac 'EMAIL', 'NAME', 'SURNAME', 'TELEPHON', 'ALL': ");
        while(true)
        {
            filteredBy = scanner.nextLine();
            if(filteredBy.equals( "EMAIL" ) || filteredBy.equals( "NAME" )
                    || filteredBy.equals( "SURNAME" )|| filteredBy.equals( "TELEPHON" ) || filteredBy.equals( "ALL" )){
                break;
            }
            else System.out.println("Podaj 'EMAIL' lub 'NAME' lub 'SURNAME' lub 'TELEPHON'");
        }
        System.out.println("Wpisz tresc filtrowania");
        textToFilter = scanner.nextLine();
        findContact.findByElement(filteredBy, textToFilter );

    }
}
