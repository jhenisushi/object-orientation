package javacore.h.exception.domain;

import java.io.Closeable;

public class Reader2 implements Closeable {
    @Override
    public void close() {
        System.out.println("Closing Reader2");
    }
}
