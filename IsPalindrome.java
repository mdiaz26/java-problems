// method takes a string and prints a boolean value on whether it is a palindrome.
// for MVP, we will not exclude spaces, apostrophes, or punctuation.

public class IsPalindrome{

    public static void main(String[] args){
        String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (String word : args) {
            int stringLength = word.length();
            int i = 0;
            int mirrorIndex = stringLength - (i + 1);
            while (i < mirrorIndex) {
                while (letters.indexOf(word.charAt(i)) < 0 && i <= mirrorIndex) {
                    i++;
                }
                while (letters.indexOf(word.charAt(mirrorIndex)) < 0 && mirrorIndex >= i) {
                    System.out.println(letters.indexOf(word.charAt(mirrorIndex)));
                    mirrorIndex--;
                }
                char leftLetter = word.charAt(i);
                char rightLetter = word.charAt(mirrorIndex);
                System.out.println(leftLetter + " - " + rightLetter);
                if (leftLetter != rightLetter) {
                    System.out.println("false");
                    break;
                }
                i++;
                mirrorIndex--;
            }
        }
        System.out.println("true");
    }
}