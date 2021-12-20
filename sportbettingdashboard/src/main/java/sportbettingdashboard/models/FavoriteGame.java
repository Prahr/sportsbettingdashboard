package sportbettingdashboard.models;

import java.util.List;

public class FavoriteGame {
    private List<String> gameIds;

    public List<String> getGames() {
        return gameIds;
    }

    public void setGames(List<String> gameIds) {
        this.gameIds = gameIds;
    }
}
