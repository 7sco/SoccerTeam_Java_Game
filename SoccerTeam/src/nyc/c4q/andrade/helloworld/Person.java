package nyc.c4q.andrade.helloworld;

//Person is a super class with usual data like name which can be used by child classes
public abstract class Person {
    //Global variables
    //Can be reused on child classes
    protected String name;
    protected String lastName;
    protected int age;


    //Person's Constructor to set variables data
    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    //Variables Getters

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void travel (){
        System.out.println("Traveling");
    }

    //Abstract Methods that will required to be used by all subclasses
    //all subclasses use this methods differently
    public abstract void soccerGame();
    public abstract void practice();

}
