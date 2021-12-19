package sportbettingdashboard.data;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Repository;
import sportbettingdashboard.models.Game;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Repository
public class GameDaoAPI implements GameDao{

    @Override
    public List<Game> getNHLGames() throws IOException, JSONException {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://odds.p.rapidapi.com/v1/odds?sport=icehockey_nhl&region=us&mkt=h2h&dateFormat=iso&oddsFormat=american")
                .get()
                .addHeader("x-rapidapi-host", "odds.p.rapidapi.com")
                .addHeader("x-rapidapi-key", "dc3da50a39msh592d0c0db2d6f20p167c1cjsnaffa15d4d332")
                .build();
        Response response = null;

        try{
            response = client.newCall(request).execute();
        }catch(IOException e){
            return null;
        }

        String gameData = response.body().string();
        JSONObject Jobject = new JSONObject(gameData);
        JSONArray Jarray = Jobject.getJSONArray("data");

        int limit = Jarray.length();
        List<Game> games = new ArrayList<>();
        String dkHome = null, dkAway = null, fdHome = null, fdAway = null, mgmHome = null, mgmAway = null, timestamp;

        for(int i = 0; i < limit; i++){
            JSONObject game = Jarray.getJSONObject(i);
            JSONArray teams = game.getJSONArray("teams");
            JSONArray sites = game.getJSONArray("sites");

            for(int a = 0; a < sites.length(); a++){
                JSONObject site = sites.getJSONObject(a);
                JSONArray odds = site.getJSONObject("odds").getJSONArray("h2h");
                if(site.getString("site_nice").equals("DraftKings")){
                    dkHome = odds.getString(0);
                    dkAway = odds.getString(1);
                }
                else if(site.getString("site_nice").equals("FanDuel")){
                    fdHome = odds.getString(0);
                    fdAway = odds.getString(1);
                }
                else if(site.getString("site_nice").equals("BetMGM")){
                    mgmHome = odds.getString(0);
                    mgmAway = odds.getString(1);
                }
            }

            timestamp = game.getString("commence_time");

            timestamp = StringUtils.substring(timestamp, 0, timestamp.length() - 1);

            if(StringUtils.countMatches(timestamp, ":") == 1){
                timestamp+= ":00";
            }

            Timestamp startTimestamp = Timestamp.valueOf(timestamp.replace("T", " "));

            games.add(i, new Game(game.getString("sport_nice"), teams.getString(0), teams.getString(1), startTimestamp, dkHome, dkAway, fdHome, fdAway, mgmHome, mgmAway));
        }
        return games;
    }

    @Override
    public List<Game> getNBAGames() throws IOException, JSONException {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://odds.p.rapidapi.com/v1/odds?sport=basketball_nba&region=us&mkt=h2h&dateFormat=iso&oddsFormat=american")
                .get()
                .addHeader("x-rapidapi-host", "odds.p.rapidapi.com")
                .addHeader("x-rapidapi-key", "dc3da50a39msh592d0c0db2d6f20p167c1cjsnaffa15d4d332")
                .build();
        Response response = null;

        try{
            response = client.newCall(request).execute();
        }catch(IOException e){
            return null;
        }

        String gameData = response.body().string();
        JSONObject Jobject = new JSONObject(gameData);
        JSONArray Jarray = Jobject.getJSONArray("data");

        int limit = Jarray.length();
        List<Game> games = new ArrayList<>();
        String dkHome = null, dkAway = null, fdHome = null, fdAway = null, mgmHome = null, mgmAway = null, timestamp;

        for(int i = 0; i < limit; i++){
            JSONObject game = Jarray.getJSONObject(i);
            JSONArray teams = game.getJSONArray("teams");
            JSONArray sites = game.getJSONArray("sites");

            for(int a = 0; a < sites.length(); a++){
                JSONObject site = sites.getJSONObject(a);
                JSONArray odds = site.getJSONObject("odds").getJSONArray("h2h");
                if(site.getString("site_nice").equals("DraftKings")){
                    dkHome = odds.getString(0);
                    dkAway = odds.getString(1);
                }
                else if(site.getString("site_nice").equals("FanDuel")){
                    fdHome = odds.getString(0);
                    fdAway = odds.getString(1);
                }
                else if(site.getString("site_nice").equals("BetMGM")){
                    mgmHome = odds.getString(0);
                    mgmAway = odds.getString(1);
                }
            }

            timestamp = game.getString("commence_time");

            timestamp = StringUtils.substring(timestamp, 0, timestamp.length() - 1);

            if(StringUtils.countMatches(timestamp, ":") == 1){
                timestamp+= ":00";
            }

            Timestamp startTimestamp = Timestamp.valueOf(timestamp.replace("T", " "));

            games.add(i, new Game(game.getString("sport_nice"), teams.getString(0), teams.getString(1), startTimestamp, dkHome, dkAway, fdHome, fdAway, mgmHome, mgmAway));
        }
        return games;
    }

    @Override
    public List<Game> getNFLGames() throws IOException, JSONException {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://odds.p.rapidapi.com/v1/odds?sport=americanfootball_nfl&region=us&mkt=h2h&dateFormat=iso&oddsFormat=american")
                .get()
                .addHeader("x-rapidapi-host", "odds.p.rapidapi.com")
                .addHeader("x-rapidapi-key", "dc3da50a39msh592d0c0db2d6f20p167c1cjsnaffa15d4d332")
                .build();
        Response response = null;

        try{
            response = client.newCall(request).execute();
        }catch(IOException e){
            return null;
        }

        String gameData = response.body().string();
        JSONObject Jobject = new JSONObject(gameData);
        JSONArray Jarray = Jobject.getJSONArray("data");

        int limit = Jarray.length();
        List<Game> games = new ArrayList<>();
        String dkHome = null, dkAway = null, fdHome = null, fdAway = null, mgmHome = null, mgmAway = null, timestamp;

        for(int i = 0; i < limit; i++){
            JSONObject game = Jarray.getJSONObject(i);
            JSONArray teams = game.getJSONArray("teams");
            JSONArray sites = game.getJSONArray("sites");

            for(int a = 0; a < sites.length(); a++){
                JSONObject site = sites.getJSONObject(a);
                JSONArray odds = site.getJSONObject("odds").getJSONArray("h2h");
                if(site.getString("site_nice").equals("DraftKings")){
                    dkHome = odds.getString(0);
                    dkAway = odds.getString(1);
                }
                else if(site.getString("site_nice").equals("FanDuel")){
                    fdHome = odds.getString(0);
                    fdAway = odds.getString(1);
                }
                else if(site.getString("site_nice").equals("BetMGM")){
                    mgmHome = odds.getString(0);
                    mgmAway = odds.getString(1);
                }
            }

            timestamp = game.getString("commence_time");

            timestamp = StringUtils.substring(timestamp, 0, timestamp.length() - 1);

            if(StringUtils.countMatches(timestamp, ":") == 1){
                timestamp+= ":00";
            }

            Timestamp startTimestamp = Timestamp.valueOf(timestamp.replace("T", " "));

            games.add(i, new Game(game.getString("sport_nice"), teams.getString(0), teams.getString(1), startTimestamp, dkHome, dkAway, fdHome, fdAway, mgmHome, mgmAway));
        }
        return games;
    }
}
