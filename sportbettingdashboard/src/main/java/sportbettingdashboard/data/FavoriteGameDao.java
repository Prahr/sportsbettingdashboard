package sportbettingdashboard.data;

import sportbettingdashboard.models.Game;

import java.util.List;

public interface FavoriteGameDao {
    Game getFavoriteGameById(int id);
    List<Game> getAllFavoriteGames();
    Game addFavoriteGame(Game game);
    void updateFavoriteGame(Game game);
    void deleteFavoriteGameById(int id);
}
