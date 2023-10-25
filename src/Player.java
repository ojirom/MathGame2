public class Player {

    private String name;
    private int score;
    private int winStreak;
    private int highestWinStreak;

    public Player(String name) {
        this.name = name;
        score = 0;
        winStreak = 0;
        highestWinStreak = 0;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
    public int getWinStreak() {
        return winStreak;
    }
    public int getHighestWinStreak() {
        return highestWinStreak;
    }

    public void incrementScore() {
        score++;
    }
    public void incrementWin() {
        winStreak++;
        if (winStreak > highestWinStreak) {
            highestWinStreak = winStreak;
        }
    }

    public void reset() {
        score = 0;
    }
    public void resetWinStreak() {
        winStreak = 0;
    }
}