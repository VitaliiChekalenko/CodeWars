public class Kata {
    public static String duckDuckGoose(Player[] players, int goose) {
        String s = players[players.length%goose];
            return s;
    }
}