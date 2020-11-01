package ua.lviv.lgs.palidrom;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws Wrong {
        Word word = new Word();
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the word: ");
        StringBuffer str = new StringBuffer(String.valueOf(sc.nextLine().toUpperCase()));
        word.isPalidron(str);


    }
}
