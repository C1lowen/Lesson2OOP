package Level2;

public class UpDownTransformer extends TextTransfomer{
    public UpDownTransformer() {
    }

    @Override
    public String transform(String text){
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < text.length(); i++){
            if((i+1) % 2 != 0) {
                char ch = Character.toUpperCase(text.charAt(i));
                sb.append(ch);
            }else{
                char ch = Character.toLowerCase(text.charAt(i));
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
