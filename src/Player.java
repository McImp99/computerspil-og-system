public class Player {

    private int playerId;
    private String name;
    private int score;

    //constructor
    public Player(int playerId, String name, int score) {
        this.playerId = playerId;
        this.name = name;
        this.score = score;
    }
    //method to display player details
    public void displayDetails() {
        System.out.println("Player ID: " + playerId);
        System.out.println("Name: " + name);
        System.out.println("Score: " + score);
    }
    //method to update player score
    public void updateScore(int newScore) {
        this.score = newScore;
    }

    //getter for playerID and score
    public int getPlayerId() {
        return playerId;
    }

    public int getScore() {
        return score;
    }
}
