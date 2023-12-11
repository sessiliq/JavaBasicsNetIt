package FootballTeamHomework;

public class MainMethod {
    public static void main(String[] args) {

        Team test1 = new Team("Test team");

        Players player1 = new Players("Test Player", 1,2,3,4,5);
        Players player2 = new Players("Test Player 2", 1,2,3,4,5);
        Players player3 = new Players("Test Player 3", 3,4,5,4,4);
        Players player4 = new Players("Test Player 4", 10,3,3,4,5);
        Players player5 = new Players("Test Player 5", 10,3,10.1,4.2,5.9);


        test1.addPlayerToTeam(player1);
        test1.printTeamCountOfPlayers();
        test1.printTeamRating();
        test1.printEachPlayersSkills();
        System.out.println("------------------------------");


        test1.addPlayerToTeam(player2);
        test1.printTeamCountOfPlayers();
        test1.printTeamRating();
        test1.printEachPlayersSkills();
        System.out.println("------------------------------");

        test1.addPlayerToTeam(player3);
        test1.printTeamCountOfPlayers();
        test1.printTeamRating();
        test1.printEachPlayersSkills();
        System.out.println("------------------------------");

        test1.addPlayerToTeam(player4);
        test1.printTeamCountOfPlayers();
        test1.printTeamRating();
        test1.printEachPlayersSkills();
        System.out.println("------------------------------");

        test1.addPlayerToTeam(player5);
        test1.printTeamCountOfPlayers();
        test1.printTeamRating();
        test1.printEachPlayersSkills();
        System.out.println("------------------------------");

        test1.removePlayerFromTeam(player4);
        test1.printTeamCountOfPlayers();
        test1.printTeamRating();
        test1.printEachPlayersSkills();
        System.out.println("------------------------------");

        test1.removePlayerFromTeam(player1);
        test1.printTeamCountOfPlayers();
        test1.printTeamRating();
        test1.printEachPlayersSkills();
        System.out.println("------------------------------");
    }
}
