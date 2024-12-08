package javacore.h.exception.domain;

import java.io.Closeable;

public class Reader1 implements Closeable {
    @Override
    public void close() {
        System.out.println("Closing Reader1");
    }
}
