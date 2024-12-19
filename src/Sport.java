public class Sport {
    private String name;
    private String type;
    private int playerCount;

    public Sport(String name, String type, int playerCount) {
        this.name = name;
        this.type = type;
        this.playerCount = playerCount;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }
    public int getPlayerCount(){
        return playerCount;
    }
    public void setPlayerCount(int playerCount){
        this.playerCount = playerCount;
    }
    public void print(){
        System.out.println("Name:"+ name + ", Type:"+ type + ", Players:"+ playerCount);
    }
}
