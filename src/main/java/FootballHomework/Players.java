package FootballHomework;

public class Players {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()){
            System.out.println("Invalid name!");
        }
        else {
            this.name = name;
        }
    }

    public void Players (String name){
       setName(name);

   }
}
