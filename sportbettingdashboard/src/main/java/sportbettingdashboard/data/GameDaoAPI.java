package sportbettingdashboard.data;

import org.springframework.stereotype.Repository;
import sportbettingdashboard.models.Game;

import java.util.List;

@Repository
public class GameDaoAPI implements GameDao{
    @Override
    public List<Game> getNHLGames() {
        return null;
    }

    @Override
    public List<Game> getNBAGames() {
        return null;
    }

    @Override
    public List<Game> getNFLGames() {
        return null;
    }
}
