package Level2;

public class InverseTransformer extends TextTransfomer{
    public InverseTransformer() {
    }

    @Override
    public String transform(String text){
        StringBuilder sb = new StringBuilder(text);
        sb.reverse();
        return sb.toString();
    }
}
