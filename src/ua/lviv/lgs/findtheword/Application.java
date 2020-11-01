package ua.lviv.lgs.findtheword;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        String[] m = "Пилип прилип прилип Пилип Пилип плаче Пилип посіяв просо Просо поспіло Пташки прилетіли Просо поїли.".split(" ");
        Arrays.sort(m);

        String maxWord = "";
        String   word = "";
        int maxCount = 0;
        int count = 1;

        for (String s : m) {
            if (s.equals(word)) {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                    maxWord = word;
                }
                word = s;
                count = 1;
            }
        }

        if (count > maxCount) {
            maxCount = count;
            maxWord = word;
        }

        System.out.println("слово: " + maxWord +  " повторяється " + maxCount + " раз)");
    }
    }

