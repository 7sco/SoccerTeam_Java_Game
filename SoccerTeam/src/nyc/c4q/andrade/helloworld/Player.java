package nyc.c4q.andrade.helloworld;


//Player is a child class of Person
public class Player extends Person {
    //Create local private variables that will not be able to used anywhere else
    //Only Players have a number and position private variable
    private int playerNumber;
    private String position;

    //Player Constructor Method, uses declared variables and brings variables from its parent class
    public Player(String name, String lastName, int age, int playerNumber, String position) {
        //variables from parent class
        super(name, lastName, age);
        this.playerNumber = playerNumber;
        this.position = position;
    }

    //Variables Getters
    public int getPlayerNumber() {
        return playerNumber;
    }

    public String getPosition() {
        return position;
    }


    //Methods Override
    //Gives unique characteristics to shared method

    //Determines action of player in a soccerGame method
    @Override
    public void soccerGame() {
        System.out.println("Plays soccer Game");
    }

    //Determines action of player in practice method
    @Override
    public void practice() {
        System.out.println("Player Practices");
    }

    //Determines action of player in an interiew method
    public void interview(){
        System.out.println("Gives an interview");
    }

}
