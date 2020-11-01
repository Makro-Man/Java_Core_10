package ua.lviv.lgs.numberofword;

public class Application {
    public static void main(String[] args) {
        String str = "Logos is good for learning";
        int count = str.split(" ").length;
        System.out.println(count);
    }


}
