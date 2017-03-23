package Anonymous.PaoYingChoops;
//C;ass นี้เป็น Class ที่ใช้ในการเก็บชื่อ และคะแนนของ Player 
public class Score {
    String playerName;
    int score;

    Score(String playerName, int score) {
        this.playerName = playerName;
        this.score = score;
    }
    
    //ชื่อ Player
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    
    //คะแนน Player
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
