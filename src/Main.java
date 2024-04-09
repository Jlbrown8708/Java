public class Main {
public static void main(String[] args){ 

    boolean gameOver = true;
    int score = 800;
    int levelCompleted = 5;
    int bonus = 100;

    int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
    System.out.println("The highScore is " + highScore);

    score = 10000;
    levelCompleted = 8;
    bonus = 200;

    System.out.println("The next highScore is " +
            calculateScore(gameOver, score, levelCompleted, bonus));
}

public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

    int finalScore = score;

    if (gameOver) {
        finalScore += (levelCompleted * bonus);
        finalScore += 1000;
    }

    return finalScore;
}

public static void main (String[] args){
    {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Gilbert", highScorePosition);

        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("James", highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position "
                + highScorePosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {

       int position;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        } else
            position = 4;

        return position;
  
    }
  public static void main (String[] args){

    System.out.println("New score is " + calculateScore("Tim", 500));
    System.out.println("New score is " + calculateScore(10));
}

public static int calculateScore(String playerName, int score) {

    System.out.println("Player " + playerName + " scored " + score + " points");
    return score * 1000;
}
public static int calculateScore(int score) {

    return calculateScore("Anonymous", score);
}

public static int calculateScore() {

    System.out.println("No player name, no player score.");
    return 0;
}

public class Main {

    public static void main(String[] args) {

        System.out.println(getDurationString(3945));  // This is the first test case
        System.out.println(getDurationString(65, 45));  // This is the second test case
    }

    public static String getDurationString(int seconds) {

        int minutes = seconds / 60;
        return getDurationString(minutes, seconds);
    }

    public static String getDurationString(int minutes, int seconds) {

        int hours = minutes / 60;

        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;

        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
    }

    public class Main {

        public static void main(String[] args) {
    
    //        int value = 3;
    //        if (value == 1) {
    //            System.out.println("Value was 1");
    //        } else if (value == 2) {
    //            System.out.println("Value was 2");
    //        } else {
    //            System.out.println("Was not 1 or 2");
    //        }
    
            int switchValue = 3;
    
            switch (switchValue) {
                case 1:
                    System.out.println("Value was 1");
                    break;
                case 2:
                    System.out.println("Value was 2");
                    break;
                case 3: case 4: case 5:
                    System.out.println("Was a 3, a 4, or a 5");
                    System.out.println("Actually it was a " + switchValue);
                    break;
                default:
                    System.out.println("Was not 1, 2, 3, 4, or 5");
                    break;
            }
           
         int switchValue = 3;

        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
            }
            default -> System.out.println("Was not 1, 2, 3, 4, or 5");
        }

        String month = "XYZ";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
    }

    public static String getQuarter(String month) {

        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> { yield "1st"; }
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };

    }  public static void main(String[] args) {

        char charValue = 'X';
        switch (charValue) {
            case 'A':
                System.out.println("A is able");
                break;
            case 'B':
                System.out.println("B is baker");
                break;
            case 'C':
                System.out.println("C is charlie");
                break;
            case 'D':
                System.out.println("D is dog");
                break;
            case 'E':
                System.out.println("E is easy");
                break;
            default:
                System.out.println("Letter " + charValue + " was not found in the switch");
                break;
        }
    }
}


    


        
    }
    
}
