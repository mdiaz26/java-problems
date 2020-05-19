// method takes a string and prints a boolean value on whether it is a palindrome.
// for MVP, we will not exclude spaces, apostrophes, or punctuation.

public class IsPalindrome{

    // public boolean isPalindrome(String string) {
    //     int stringLength = string.length();
    //     for (int i = 0; i < stringLength; i++){
    //         int mirrorIndex = stringLength - (i + 1);
    //         if (string.charAt(i) != string.charAt(mirrorIndex)) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    public static void main(String[] args){
        String word = "tacocatt";
        int stringLength = word.length();
        for (int i = 0; i < stringLength; i++){
            int mirrorIndex = stringLength - (i +1);
            if (word.charAt(i) != word.charAt(mirrorIndex)) {
                System.out.println("false");
                break;
            }
        }
        System.out.println("true");
    }
}