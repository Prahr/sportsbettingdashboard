package sportbettingdashboard.models;

import java.time.ZonedDateTime;

public class Game {
    private String id;
    private String sport;
    private String homeTeam;
    private String awayTeam;
    private ZonedDateTime startTime;
    private String dkHomeOdds;
    private String dkAwayOdds;
    private String fdHomeOdds;
    private String fdAwayOdds;
    private String riverHomeOdds;
    private String riverAwayOdds;
    private String startTimeString;
    private boolean isFavorite;

    public Game() {
    }

    public Game(String id, String sport, String homeTeam, String awayTeam, ZonedDateTime startTime, String dkHomeOdds, String dkAwayOdds, String fdHomeOdds, String fdAwayOdds, String mgmHomeOdds, String mgmAwayOdds) {
        this.id = id;
        this.sport = sport;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.startTime = startTime;
        this.dkHomeOdds = dkHomeOdds;
        this.dkAwayOdds = dkAwayOdds;
        this.fdHomeOdds = fdHomeOdds;
        this.fdAwayOdds = fdAwayOdds;
        this.riverHomeOdds = mgmHomeOdds;
        this.riverAwayOdds = mgmAwayOdds;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public ZonedDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(ZonedDateTime startTime) {
        this.startTime = startTime;
    }

    public String getDkHomeOdds() {
        return dkHomeOdds;
    }

    public void setDkHomeOdds(String dkHomeOdds) {
        this.dkHomeOdds = dkHomeOdds;
    }

    public String getDkAwayOdds() {
        return dkAwayOdds;
    }

    public void setDkAwayOdds(String dkAwayOdds) {
        this.dkAwayOdds = dkAwayOdds;
    }

    public String getFdHomeOdds() {
        return fdHomeOdds;
    }

    public void setFdHomeOdds(String fdHomeOdds) {
        this.fdHomeOdds = fdHomeOdds;
    }

    public String getFdAwayOdds() {
        return fdAwayOdds;
    }

    public void setFdAwayOdds(String fdAwayOdds) {
        this.fdAwayOdds = fdAwayOdds;
    }

    public String getRiverHomeOdds() {
        return riverHomeOdds;
    }

    public void setRiverHomeOdds(String mgmHomeOdds) {
        this.riverHomeOdds = mgmHomeOdds;
    }

    public String getRiverAwayOdds() {
        return riverAwayOdds;
    }

    public void setRiverAwayOdds(String mgmAwayOdds) {
        this.riverAwayOdds = mgmAwayOdds;
    }

    public String getStartTimeString() {
        return startTimeString;
    }

    public void setStartTimeString(String startTimeString) {
        this.startTimeString = startTimeString;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }
}
