import java.util.ArrayList;

public class Gamesystem {


        private ArrayList<Game> games; //list storing games
        private ArrayList<Player> players; //list storing players

        //Constructor
        public Gamesystem() {
            games = new ArrayList<>();
            players = new ArrayList<>();
        }

        //method to add new game
        public void addGame(Game game) {
            games.add(game);
        }

        //method to add new player
        public void addPlayer(Player player) {
            players.add(player);
        }

        //method to show all games
        public void displayAllGames() {
            for (Game game : games) {
                game.displayDetails();
            }
        }

        //method to show all players
        public void displayAllPlayers() {
            for (Player player : players) {
                player.displayDetails();
            }
        }

        //method to update a players score by playerId
        public void updatePlayerScore(int playerId, int newScore) {
            Player player = findPlayerById(playerId);
            if (player != null) {
                player.updateScore(newScore);
            } else {
                System.out.println("Player not found.");
            }
        }

        //method to find player by playerID
        public Player findPlayerById(int playerId) {
            for (Player player : players) {
                if (player.getPlayerId() == playerId) {
                    return player;
                }
            }
            return null;
        }

        //method to calculate  total revenue
        public double calculateTotalRevenue() {
            double totalRevenue = 0;
            for (Game game : games) {
                totalRevenue += game.getPrice();
            }
            return totalRevenue;
        }

        //method to find best player
        public Player findTopScoringPlayer() {
            if (players.isEmpty()) {
                return null;
            }

            Player topPlayer = players.get(0);
            for (Player player : players) {
                if (player.getScore() > topPlayer.getScore()) {
                    topPlayer = player;
                }
            }
            return topPlayer;
        }
    }


