package sportbettingdashboard.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FavoriteGameDaoDB implements FavoriteGameDao{
    @Autowired
    JdbcTemplate jdbc;

    @Override
    public List<String> getAllFavoriteGames() {
        final String SELECT_ALL_GAMES = "SELECT id FROM games";
        return jdbc.queryForList(SELECT_ALL_GAMES, String.class);
    }

    @Override
    public void addFavoriteGame(String id) {
        final String INSERT_GAME_ID = "INSERT INTO games(id) VALUES(?)";
        jdbc.update(INSERT_GAME_ID, id);
    }

    @Override
    public void deleteFavoriteGameById(String id) {
        final String DELETE_GAME_ID = "DELETE FROM games WHERE id = ?";
        jdbc.update(DELETE_GAME_ID, id);
    }
}
