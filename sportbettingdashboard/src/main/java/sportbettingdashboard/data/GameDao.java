package sportbettingdashboard.data;

import sportbettingdashboard.models.Game;

import java.util.List;

public interface GameDao {
    List<Game> getNHLGames();
    List<Game> getNBAGames();
    List<Game> getNFLGames();
}
