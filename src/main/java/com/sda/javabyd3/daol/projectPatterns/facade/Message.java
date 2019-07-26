package com.sda.javabyd3.daol.projectPatterns.facade;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder

public class Message {
    private String text;
    private String status;
    private String receipient;
}
