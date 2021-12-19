package sportbettingdashboard.models;

import java.sql.Timestamp;

public class Game {
    private String sport;
    private String homeTeam;
    private String awayTeam;
    private Timestamp startTime;
    private String dkHomeOdds;
    private String dkAwayOdds;
    private String fdHomeOdds;
    private String fdAwayOdds;
    private String mgmHomeOdds;
    private String mgmAwayOdds;

    public Game(String sport, String homeTeam, String awayTeam, Timestamp startTime, String dkHomeOdds, String dkAwayOdds, String fdHomeOdds, String fdAwayOdds, String mgmHomeOdds, String mgmAwayOdds) {
        this.sport = sport;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.startTime = startTime;
        this.dkHomeOdds = dkHomeOdds;
        this.dkAwayOdds = dkAwayOdds;
        this.fdHomeOdds = fdHomeOdds;
        this.fdAwayOdds = fdAwayOdds;
        this.mgmHomeOdds = mgmHomeOdds;
        this.mgmAwayOdds = mgmAwayOdds;
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

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
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

    public String getMgmHomeOdds() {
        return mgmHomeOdds;
    }

    public void setMgmHomeOdds(String mgmHomeOdds) {
        this.mgmHomeOdds = mgmHomeOdds;
    }

    public String getMgmAwayOdds() {
        return mgmAwayOdds;
    }

    public void setMgmAwayOdds(String mgmAwayOdds) {
        this.mgmAwayOdds = mgmAwayOdds;
    }
}
