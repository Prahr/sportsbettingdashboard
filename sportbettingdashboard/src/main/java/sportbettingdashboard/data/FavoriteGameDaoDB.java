package sportbettingdashboard.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import sportbettingdashboard.models.Game;

import java.util.List;

@Repository
public class FavoriteGameDaoDB implements FavoriteGameDao{
    @Autowired
    JdbcTemplate jdbc;

    @Override
    public Game getFavoriteGameById(int id) {
        return null;
    }

    @Override
    public List<Game> getAllFavoriteGames() {
        return null;
    }

    @Override
    public Game addFavoriteGame(Game game) {
        return null;
    }

    @Override
    public void updateFavoriteGame(Game game) {

    }
    @Override
    public void deleteFavoriteGameById(int id) {

    }
}
