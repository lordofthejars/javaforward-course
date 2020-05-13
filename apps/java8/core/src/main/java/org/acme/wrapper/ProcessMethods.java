package org.acme.wrapper;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ProcessMethods {

    public static void main(String args[]) throws IOException {
        Process process = new ProcessBuilder("sleep", "5").start();

        System.out.println("Is Alive?" + process.isAlive());

        try {
            boolean result = process.waitFor(1, TimeUnit.SECONDS);
            System.out.println("Has finished? " + result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            process.destroyForcibly().waitFor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Exit code " + process.exitValue());

    }

}