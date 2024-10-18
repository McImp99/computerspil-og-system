public class Main {
    public static void main(String[] args) {

        //Creating gamesystem
        Gamesystem system = new Gamesystem();

        //add different games and prices to the system
        system.addGame(new Game(1, "World of Warcraft", 79.99));
        system.addGame(new Game(2, "Valorant", 19.99));

        // add two players
        system.addPlayer(new Player(101, "Magnus", 1500));
        system.addPlayer(new Player(102, "Elias", 2000));

        //Display games and players
        System.out.println("Different Games:");
        system.displayAllGames();
        System.out.println("\nAll Players:");
        system.displayAllPlayers();

        //Giving players new updated score
        system.updatePlayerScore(101, 2400);
        system.updatePlayerScore(102, 2350);

        //Find best player and display
        Player topPlayer = system.findTopScoringPlayer();
        if (topPlayer != null) {
            System.out.println("\nTop Scoring Player:");
            topPlayer.displayDetails();
        }

        //Calculate revenue from games
        double totalRevenue = system.calculateTotalRevenue();
        System.out.println("\nTotal Revenue: $" + totalRevenue);
    } // main end
}