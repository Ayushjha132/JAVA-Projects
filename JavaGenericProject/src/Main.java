public class Main {
    public static void main(String[] args) {
        FootBallPlayer joe = new FootBallPlayer("Joe");
        BaseBallPlayer pat = new BaseBallPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("bekham");

        Team<FootBallPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
//        adelaideCrows.addPlayer(pat);
//        adelaideCrows.addPlayer(beckham);

        System.out.println("No of player: " +adelaideCrows.numPlayer());

        Team<BaseBallPlayer> baseBallPlayerTeam = new Team<>("Chicago club");
        baseBallPlayerTeam.addPlayer(pat);
        System.out.println("No of player: " +baseBallPlayerTeam.numPlayer());

        Team<SoccerPlayer> soccerPlayerTeam = new Team<>("Soccer Club");
        soccerPlayerTeam.addPlayer(beckham);
        System.out.println("No of player: " +soccerPlayerTeam.numPlayer());

        Team<FootBallPlayer> melbourne = new Team<>("Melbourne");
        FootBallPlayer bank = new FootBallPlayer("Gordon");
        melbourne.addPlayer(bank);

        Team<FootBallPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootBallPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(fremantle, 2, 1);
//        adelaideCrows.matchResult(baseBallPlayerTeam, 1,1); //this not work as
//         the matchResult's parameter has the team of Generic of 'T'.

        System.out.println("Ranking");
        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());

        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(adelaideCrows.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(adelaideCrows));
        System.out.println(melbourne.compareTo(fremantle));

    }
}