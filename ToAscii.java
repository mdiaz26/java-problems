public class ToAscii {
    public static void main(String[] args){
        for (String str : args) {
            int total = 0;
            for (int i = 0; i < str.length(); i++) {
                int asciiValue = (int) str.charAt(i);
                // System.out.println(asciiValue);
                total = total + asciiValue;
            }
            System.out.println(total);
        }
    }
}