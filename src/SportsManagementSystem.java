public class SportsManagementSystem {
    public static void main(String[] args) {
        Sport football= new Sport( "Football", "Team", 11);
        Sport tennis = new Sport( "Tennis", "Individual", 2);

        Athlete athlete1 = new Athlete("Cristiano Ronaldo", 39, "Football" );
        Athlete athlete2 = new Athlete("Novak Djokovic", 38, "Tennis" );

        SportsClub club1= new SportsClub("Chealsea FC", "London", 40);
        SportsClub club2 = new SportsClub("Miami Heat", "Miami", 15);

        football.print();
        tennis.print();
        athlete1.print();
        athlete2.print();
        club1.print();
        club2.print();
        System.out.println("\nComparing two sports clubs:");
        if (club1.getMemberCount() > club2.getMemberCount()) {
            System.out.println(club1.getClubName() + " has more members than " + club2.getClubName());
        } else if (club1.getMemberCount() < club2.getMemberCount()) {
            System.out.println(club2.getClubName() + " has more members than " + club1.getClubName());
        } else {
            System.out.println(club1.getClubName() + " and " + club2.getClubName() + " have the same number of members.");
        }
    }
}
