package com.jfk;

import com.jfk.customannotation.*;

public class ProxyApplication {

    public static void main(String[] args) {
        MessageReader reader = new LoggedWebMessageReaderProxy(new MessageReaderEmail(new XmlMessageReader())) ;
        reader.read();
    }
}
