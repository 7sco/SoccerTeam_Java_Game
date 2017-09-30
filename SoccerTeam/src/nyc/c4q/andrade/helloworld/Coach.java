package nyc.c4q.andrade.helloworld;

//Coach is a child class of Person
public class Coach extends Person{
    //Create local private variable that will not be able to used anywhere else
    //Only coach has an strategy
    private String strategy;

    //Player Constructor Method, uses declared variables and brings variables from its parent class
    public Coach(String name, String lastName, int age, String strategy) {
        //variables from parent class
        super(name, lastName, age);
        this.strategy = strategy;
    }

    //Variables Getters
    public String getStrategy() {
        return strategy;
    }

    //Parent Methods Override
    //Gives unique characteristics to shared method

    //Determines action of the Coach in a soccerGame method
    @Override
    public void soccerGame() {
        System.out.println("Coaches soccer Game");
    }

    //Determines action of the Coach in a practice method
    @Override
    public void practice() {
        System.out.println("Directs the Practice");
    }

    //Determines action of the Coach to the planPractice method
    public void planPractice (){
        System.out.println("Plans the Practice");
    }
}
