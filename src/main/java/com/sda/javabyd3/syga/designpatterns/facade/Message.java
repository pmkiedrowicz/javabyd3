package com.sda.javabyd3.syga.designpatterns.facade;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Message {
    private String text;
    private String status;
    private String receipient;
}
