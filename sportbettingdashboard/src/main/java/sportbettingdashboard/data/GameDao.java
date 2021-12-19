package sportbettingdashboard.data;

import org.json.JSONException;
import sportbettingdashboard.models.Game;

import java.io.IOException;
import java.util.List;

public interface GameDao {
    List<Game> getNHLGames() throws IOException, JSONException;
    List<Game> getNBAGames() throws IOException, JSONException;
    List<Game> getNFLGames() throws IOException, JSONException;

}
