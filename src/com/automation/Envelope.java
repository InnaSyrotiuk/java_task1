package com.automation;

public class Envelope{
    public double Width;
    public  double Height;

    public Envelope(double width, double height){
        Width = width;
        Height = height;
    }

    public boolean CanHold(Envelope envelope){
        // check that width and height bigger than passed envelope height and width
        return Width > envelope.Width && Height > envelope.Height ||
                Height > envelope.Width && Width > envelope.Height;
    }
}
