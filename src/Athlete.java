public class Athlete {
    private String name;
    private int age;
    private String sport;
    public Athlete(String name,int age, String sport){
        this.name=name;
        this.age=age;
        this.sport=sport;
    }
    public String name(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int age(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String sport(){
        return sport;
    }
    public void setSport(String sport){
        this.sport=sport;
    }
    public void print(){
        System.out.println("Name:" + name + ", Age:"+ age + ", Sport:" + sport);
    }
}
