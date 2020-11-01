package ua.lviv.lgs.letterreplecement;

public class Application {
    public static void main(String[] args) {
        String str = "Logos are good for learning";
        String replace = str.replaceAll("[aeiouy]","-");
        System.out.println(replace);
    }
}
