package sportbettingdashboard.controllers;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import sportbettingdashboard.data.FavoriteGameDao;
import sportbettingdashboard.data.GameDao;
import sportbettingdashboard.models.Game;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@Controller
public class FavoriteGamesController {
    @Autowired
    GameDao gameDao;

    @Autowired
    FavoriteGameDao favoriteGameDao;

    @GetMapping("favoritegames")
    public String displayFavoriteGames(Model model) throws JSONException, IOException {
        List<Game> nhlGames = gameDao.getNHLGames();
        List<Game> nflGames = gameDao.getNFLGames();
        List<Game> nbaGames = gameDao.getNBAGames();
        List<String> favoriteGameIds = favoriteGameDao.getAllFavoriteGames();
        model.addAttribute("nhlGames", nhlGames);
        model.addAttribute("nflGames", nflGames);
        model.addAttribute("nbaGames", nbaGames);
        model.addAttribute("favoriteGameIds", favoriteGameIds);
        return "favoritegames";
    }

    @GetMapping("deleteFavoriteGame")
    public String deleteFavoriteGame(HttpServletRequest request){
        String id = request.getParameter("id");
        favoriteGameDao.deleteFavoriteGameById(id);
        return "redirect:/favoritegames";
    }
}
