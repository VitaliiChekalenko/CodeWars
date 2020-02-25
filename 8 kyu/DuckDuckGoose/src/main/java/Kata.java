public class Kata {
    public static String duckDuckGoose(Player[] players, int goose) {
        return players[goose/players.length].toString();
    }
}