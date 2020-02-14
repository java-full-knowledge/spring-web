package com.jfk.customannotation;

public class LoggedWebMessageReaderProxy implements MessageReader {

    private MessageReader messageReader;

    public LoggedWebMessageReaderProxy(MessageReader messageReader) {
        this.messageReader = messageReader;
    }

    @Override
    public String read() {
        System.out.println("LOGGING START.");
        messageReader.read();
        System.out.println("LOGGING END.");
        return null;
    }
}
