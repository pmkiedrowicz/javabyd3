package com.sda.javabyd3.mizi.exg013.ex02;

import java.util.Optional;

/**
 * Created by Michal Ziolecki.
 */
public class Main02 {
    public static void main(String[] args) {
        TextContainer textContainer = new TextContainer( "123456789" );
        System.out.println(Optional.ofNullable( textContainer.getText() )
                .map( text -> text.length() ).orElse( -1 ));
    }
}
