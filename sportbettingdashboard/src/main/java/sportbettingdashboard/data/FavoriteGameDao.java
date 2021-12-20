package sportbettingdashboard.data;

import sportbettingdashboard.models.Game;

import java.util.List;

public interface FavoriteGameDao {
    List<String> getAllFavoriteGames();
    void addFavoriteGame(String id);
    void deleteFavoriteGameById(String id);
}
