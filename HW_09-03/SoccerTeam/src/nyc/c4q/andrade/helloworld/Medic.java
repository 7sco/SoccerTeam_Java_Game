package nyc.c4q.andrade.helloworld;

//Coach is a child class of Person
public class Medic extends Person{

    //Create local private variables that will not be able to used anywhere else
    //Only Doctor has a degree and experience Time
    private String degree;
    private int experienceTime;

    //Player Constructor Method, uses declared variables and brings variables from its parent class
    public Medic(String name, String lastName, int age, String degree, int experienceTime) {
        //variables from parent class
        super(name, lastName, age);
        this.degree = degree;
        this.experienceTime = experienceTime;
    }

    //Variables Getters
    public String getDegree() {
        return degree;
    }

    public int getExperienceTime() {
        return experienceTime;
    }

    //Parent Methods Override
    //Gives unique characteristics to shared method

    //Determines action of the Doctor in a soccerGame method

    @Override
    public void soccerGame() {
        System.out.println("Medical assistance in a Game");
    }
    //Determines action of Doctor in practice method
    @Override
    public void practice() {
        System.out.println("Medical assistance during practice");
    }


    public void treatInjury(){
        System.out.println("Treats players injuries");
    }

}
