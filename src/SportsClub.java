public class SportsClub {
    private String clubName;
    private String location;
    private int memberCount;
    public SportsClub(String clubName, String location, int memberCount){
        this.clubName=clubName;
        this.location=location;
        this.memberCount=memberCount;
    }
    public String getClubName() {
        return clubName;
    }
    public void setClubName(String clubName){
        this.clubName=clubName;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location){
        this.location=location;
    }
    public int getMemberCount() {
        return memberCount;
    }
    public void setMemberCount(int memberCount){
        this.memberCount=memberCount;
    }
    public void print(){
        System.out.println("Club Name: "+clubName+ ", Location: "+ location + ", Member Count:" + memberCount);
    }
}
