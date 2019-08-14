package tooobi.codewars.excercise;

public class VowelCount {

    public static int getCount(String str) {
        int vowelsCount = 0;
        // your code here

        for (char element : str.toCharArray()) {
            switch (element) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowelsCount++;
            }
        }
        return vowelsCount;
    }
}
