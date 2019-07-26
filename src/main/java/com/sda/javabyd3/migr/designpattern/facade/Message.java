package com.sda.javabyd3.migr.designpattern.facade;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Message {
    private String text;
    private String status;
    private String receipient;
}
