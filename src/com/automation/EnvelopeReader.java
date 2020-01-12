package com.automation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EnvelopeReader{
    public Envelope Read() throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Width: ");
        double w = Double.parseDouble(reader.readLine());
        System.out.print("Height: ");
        double h = Double.parseDouble(reader.readLine());
        return new Envelope(w,h);
    }
}
