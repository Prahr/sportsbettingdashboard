package sportbettingdashboard.controllers;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import sportbettingdashboard.data.FavoriteGameDao;
import sportbettingdashboard.data.GameDao;
import sportbettingdashboard.models.Game;

import java.io.IOException;
import java.util.List;

@Controller
public class NFLGamesController {
    /*
    @Autowired
    GameDao gameDao;

    @Autowired
    FavoriteGameDao favoriteGameDao;

    @GetMapping("nflgames")
    public String displayNHLGames(Model model) throws JSONException, IOException {
        List<Game> games = gameDao.getNFLGames();
        model.addAttribute("games", games);
        return "nflgames";
    }

     */
}
