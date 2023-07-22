package Level2;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Введите текст");
        String text = sc.nextLine();

        TextTransfomer textTr1 = new InverseTransformer();
        TextTransfomer textTr2 = new UpDownTransformer();
        TextTransfomer textTr3 = new TextTransfomer();


        File file = new File("t.txt");

        saveAllOptions(file, textTr1, text);
        saveAllOptions(file, textTr2, text);
        saveAllOptions(file, textTr3, text);


    }

    public static void saveAllOptions(File file, TextTransfomer textTr, String text){
        TextSaver ts = new TextSaver(textTr, file);
        ts.saveTextToFile(text);
    }

}
