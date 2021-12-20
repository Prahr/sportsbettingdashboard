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
public class NBAGamesController {
    @Autowired
    GameDao gameDao;

    @Autowired
    FavoriteGameDao favoriteGameDao;

    @GetMapping("nbagames")
    public String displayNHLGames(Model model) throws JSONException, IOException {
        List<Game> games = gameDao.getNBAGames();
        List<String> favoriteGameIds = favoriteGameDao.getAllFavoriteGames();
        model.addAttribute("games", games);
        model.addAttribute("favoriteGameIds", favoriteGameIds);
        return "nbagames";
    }

    @GetMapping("addFavoriteNBAGame")
    public String addFavoriteGame(HttpServletRequest request){
        String id = request.getParameter("id");
        favoriteGameDao.addFavoriteGame(id);
        return "redirect:/nbagames";
    }

    @GetMapping("deleteFavoriteNBAGame")
    public String deleteFavoriteGame(HttpServletRequest request){
        String id = request.getParameter("id");
        favoriteGameDao.deleteFavoriteGameById(id);
        return "redirect:/nbagames";
    }
}
