package Level2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TextSaver {
    private TextTransfomer transfomer;
    private File file;

    public TextSaver(TextTransfomer transfomer,File file) {
        this.transfomer = transfomer;
        this.file = file;
    }
     public void saveTextToFile(String text){
        String result = this.transfomer.transform(text);

        try(FileWriter wr = new FileWriter(this.file, true)){
            wr.write(result);
            wr.append('\n');
        }catch(IOException e){
            System.out.println(e);
        }
     }
}
