package com.jfk.customannotation;

public class MessageReaderEmail implements MessageReader {

    private MessageReader messageReader;

    public MessageReaderEmail(MessageReader messageReader) {
        this.messageReader = messageReader;
    }
    @Override
    public String read() {
        System.out.println("SENDING EMAIL");
        messageReader.read();
        System.out.println("DONE");
        return null;
    }
}
