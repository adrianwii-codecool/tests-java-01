package com.company;

public class Main {

    public static void main(String[] args) {
	    Histogram histogram = new Histogram();

	    histogram.createHistogram("Ala ma kota");
		System.out.println(histogram.toString());
    }
}
