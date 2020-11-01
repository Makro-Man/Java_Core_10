package ua.lviv.lgs.palidrom;

public class Word {
    StringBuffer str = new StringBuffer();


    public void isPalidron(StringBuffer str) throws Wrong {
        this.str = str;
        if (str.length() !=5){
            StringBuffer message = new StringBuffer("You did not enter words with 5 letters: "+str);
            throw new Wrong(message);
        }else if (str.equals(str.reverse())){
            System.out.println("Word: " + str +" is palidron");
        }else {
            System.out.println("Word: " + str +" is not palidron");
        }
    }
}
