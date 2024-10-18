public class Game {
    private int gameId;
    private String title;
    private double price;

    //Constructor
    public Game(int gameId, String title, double price) {
        this.gameId = gameId;
        this.title = title;
        this.price = price;
    }

    //method to display game details
    public void displayDetails() {
        System.out.println("Game ID: " + gameId);
        System.out.println("Title: " + title);
        System.out.println("Price: $" + price);
    }

    //getters for gameId and price
    public int getGameId() {
        return gameId;
    }

    public double getPrice() {
        return price;
    }
}
