package Arrays_5;

//https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
public class Panagram {
    public static void main(String[] args) {
        String inputString = "thequickrownfoxjumpsoverthelazydog";

        System.out.println(allLettersPresent(inputString));

    }

    private static boolean allLettersPresent(String inputString) {
        int letterArraySize = 26;

        inputString = inputString.toLowerCase();

        boolean[] letterPresentArray = new boolean[letterArraySize];

        for (int i = 0; i < inputString.length(); i++) {
            if(Character.isLetter(inputString.charAt(i))){
                int letter = inputString.charAt(i) - 'a';
                letterPresentArray[letter] = true;
            }
        }
        for (boolean b : letterPresentArray) {
            if (!b) {
                return false;
            }
        }
        return true;
    }
}
