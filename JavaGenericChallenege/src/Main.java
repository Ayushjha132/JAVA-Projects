import java.awt.*;

public class Main {
    public static void main(String[] args) {
        League<Team<FootBallPlayer>> footBallLeague  = new League<>("ALF");
        Team<FootBallPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootBallPlayer> melbourne = new Team<>("Melbourne");
        Team<FootBallPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootBallPlayer> fremantle = new Team<>("Fremantle");
//        Team<BaseBallPlayer> baseBallPlayerTeam = new Team<>("Chicago club");
        // this is not allowed as the generic is football

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);
        adelaideCrows.matchResult(fremantle, 2, 1);

        footBallLeague.add(adelaideCrows);
        footBallLeague.add(melbourne);
        footBallLeague.add(hawthorn);
        footBallLeague.add(fremantle);

//        footBallLeague.add(baseBallPlayerTeam);   // similar reason as above
        footBallLeague.showLeagueTable();

    }
}