package com.company;

import java.util.HashMap;
import java.util.Iterator;

public class Histogram {
    private HashMap<Character, Integer> histogram;

    public Histogram() {
       histogram = new HashMap<Character, Integer>();
    }

    public HashMap<Character, Integer> getHistogram() {
        return histogram;
    }

    public void createHistogram(String sentence) {
        sentence = sentence.toLowerCase().replaceAll(" ", "");

        for(int i = 0; i < sentence.length(); ++i) {
            char letter = sentence.charAt(i);
            int count = 0;

            for(int j = 0; j < sentence.length(); ++j) {
                if (sentence.charAt(j) == letter) {
                    count = count + 1;
                }
            }

            this.histogram.put(letter, count);
        }
    }

    public String toString() {
        Iterator histogramIterator = histogram.keySet().iterator();
        String output = "";

        while(histogramIterator.hasNext()) {
            Character letter = (Character)histogramIterator.next();
            Integer value = histogram.get(letter);
            output += letter + " : " + value+"\n";
        }
        return output;
    }
}