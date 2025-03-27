package task2session.Case;

import task2session.Service.MessageFormatter;

public class Uppercase implements MessageFormatter {

    @Override
    public String getText(String message) {
        return message.toUpperCase();
    }
}

