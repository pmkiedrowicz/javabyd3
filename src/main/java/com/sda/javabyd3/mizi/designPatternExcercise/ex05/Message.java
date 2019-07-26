package com.sda.javabyd3.mizi.designPatternExcercise.ex05;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * Created by Michal Ziolecki.
 */
@AllArgsConstructor
@Setter
@Getter
public class Message {
    private String recipient;
    private String sender;
    private String topic;
    private String tag;
    private String text;
    private LocalDateTime localDateTime;

    @Override
    public String toString() {
        return "Message{" +
                "recipient='" + recipient + '\'' +
                ", sender='" + sender + '\'' +
                ", topic='" + topic + '\'' +
                ", tag='" + tag + '\'' +
                ", text='" + text + '\'' +
                ", localDateTime=" + localDateTime +
                '}';
    }
}
