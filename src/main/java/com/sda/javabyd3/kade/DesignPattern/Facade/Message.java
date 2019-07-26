package com.sda.javabyd3.kade.DesignPattern.Facade;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor


public class Message {

    private String text;
    private String status;
    private String receipient;

}
