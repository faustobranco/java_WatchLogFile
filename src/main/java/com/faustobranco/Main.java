package com.faustobranco;
// org.apache.commons.io.input
import java.io.*;
import org.apache.commons.io.input.Tailer;
import org.apache.commons.io.input.TailerListenerAdapter;

public class Main {


    private static final int SLEEP = 500;

    public static void main(String[] args) throws Exception {
        MyListener listener = new MyListener();
        Tailer tailer_app = Tailer.create(new File("logs/app.log"), listener, SLEEP);
        Tailer tailer_debug = Tailer.create(new File("logs/debug.log"), listener, SLEEP);
        while (true) {
            Thread.sleep(SLEEP);
        }
    }

    public static class MyListener extends TailerListenerAdapter {

        @Override
        public void handle(String line) {
            System.out.println(line);
        }

    }
}