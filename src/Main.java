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




}
