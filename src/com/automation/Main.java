package com.automation;

import org.omg.CORBA.WStringSeqHelper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException  {
        EnvelopeReader reader = new EnvelopeReader();
        BufferedReader cReader =
                new BufferedReader(new InputStreamReader(System.in));
        String shouldContinueCheck = "";
        do {
            System.out.println("Please enter first envelope params");
            Envelope env1 = reader.Read();
            System.out.println("Please enter second envelope params");
            Envelope env2 = reader.Read();

            if (env1.CanHold(env2)) {
                System.out.println("Second envelope can be put inside of first envelope");
            } else if (env2.CanHold(env1)) {
                System.out.println("First envelope can be put inside of second envelope");
            } else {
                System.out.println("Envelopes have such sizes that first can't be put inside of second and vice versa");
            }
            System.out.println("Enter data for another pair of envelopes? (type y or yes and enter)");
            shouldContinueCheck = cReader.readLine();
        } while (shouldContinueCheck.equalsIgnoreCase("y") || shouldContinueCheck.equalsIgnoreCase("yes"));
    }
}
