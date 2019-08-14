package tooobi.codewars.excercise;


public class TenMinWalk {

    public static boolean isValid(char[] walk) {
        // Insert brilliant code here
        if (walk.length != 10) {
            return false;
        }

        int verticalCounter = 0;
        int horizontalCounter = 0;

        for (char element : walk) {
            switch (element) {
                case 'n':
                    verticalCounter++;
                    break;
                case 's':
                    verticalCounter--;
                    break;
                case 'e':
                    horizontalCounter++;
                    break;
                case 'w':
                    horizontalCounter--;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + element);
            }
        }

        if (horizontalCounter == 0 && verticalCounter == 0) {
            return true;
        }

        return false;
    }
}
