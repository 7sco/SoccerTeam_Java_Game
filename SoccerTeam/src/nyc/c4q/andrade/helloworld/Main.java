package nyc.c4q.andrade.helloworld;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //Create a ArrayList to store Person arguments inside
    static ArrayList<Person> person = new ArrayList<Person>();
    static Scanner input= new Scanner(System.in);

    //Give each variable content from Person class
    static Person player1= new Player("Isco", "Alarcon", 24, 22, "Midfield");
    static  Person player2= new Player("Sergio", "Ramos", 31, 4, "Defense");
    static Person coach = new Coach("Zinedine", "Zidan", 45, "Offensive");
    static Person doctor = new Medic("Alex","Marroni", 60, "Physiotherapists", 20 );


    public static void main(String[] args) {


        //Print Welcome Mesage
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\tHello, Welcome to C4Q Futbol Club.\n\n" +
                "\t\t\t\t\t\tWe are starting our season and have a different roles for each person in the Club. \n" +
                "\t\t\t\tWe need to know what role each person has, so please follow the Menu to know what role everybody has:\n");

        //
        System.out.println("\n\t\t\t\tOur staff is the following: ");
        //Gets names of staff members
        System.out.println("\n\t\t\t\tPlayer 1: "+player1.getName()+" "+ player1.getLastName());
        System.out.println("\n\t\t\t\tPlayer 2: "+player2.getName()+" "+ player2.getLastName());
        System.out.println("\n\t\t\t\tCoach: "+coach.getName()+" "+ coach.getLastName());
        System.out.println("\n\t\t\t\tDoctor: "+ coach.getName()+" "+ doctor.getLastName());

        //Add info of each person int ArrayList
        person.add(player1);
        person.add(player2);
        person.add(coach);
        person.add(doctor);

        //menu

        //We Run the menu to interact with user
        menu();
    }


    public static void menu(){
        int option;

        //Show Menu unless Exit(7) is choosen, Repeats it while the 7 is not pressed
        do{
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\u26BD.:MENU:.\u26BD\n");
            System.out.println("\t\t\t\t1. Team Trip");
            System.out.println("\t\t\t\t2. Practice");
            System.out.println("\t\t\t\t3. Game");
            System.out.println("\t\t\t\t4. Plan Practice");
            System.out.println("\t\t\t\t5. Interview");
            System.out.println("\t\t\t\t6. Treat Injury");
            System.out.println("\t\t\t\t7. EXIT");
            System.out.print("\t\t\t\tOption: ");

            option= input.nextInt();

            //Switch statement that acts depending on number entered
            switch(option){
                case 1:
                    System.out.println();
                    teamTrip();//Team Trip
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    practiceTeam();//Practice
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    soccerGame();//Game
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    practicaPlan();//Plan Practice
                    System.out.println();
                    break;
                case 5:
                    System.out.println();
                    interview();//Interview
                    System.out.println();
                    break;
                case 6:
                    System.out.println();
                    treatInjury();//Treat Injury
                    System.out.println();
                    break;
                case 7:
                    break;

                default:
                    System.out.println("\t\t\t\tError, wrong menu option");
                   System.out.println();
                    break;
            }

        }while (option != 7);
    }

    //When option 1 is choosen this method runs
    //Prints name of every Person and uses travel method to determine what each person is doing during the trip
    public static void teamTrip(){
        //Goes through each person and prints its name and travel action
        for(Person team: person){
            System.out.print("\t\t\t\t"+team.getName()+" "+ team.getLastName()+ " "+team.getAge() + " -> ");
            team.travel();
        }
    }

    //When option 2 is choosen this method runs
    //Prints name of every Person and uses Practice method to determine what each person is doing during the trip
    public static void practiceTeam(){
        //Goes through each person and prints its name and practice action
        for(Person team: person){
            System.out.print("\t\t\t\t"+team.getName()+" "+ team.getLastName()+" "+team.getAge()+" -> \uD83C\uDFC3");
            //System.out.println();
            team.practice();
        }
    }

    //When option 3 is choosen this method runs
    //Prints name of every Person and uses soccerGame method to determine what each person is doing during the trip
    public static void soccerGame(){
        //Goes through each person and prints its name and soccerGame action

        for(Person team: person){
            System.out.print("\t\t\t\t"+team.getName()+" "+ team.getLastName()+ " -> \uD83C\uDFC3");
            team.soccerGame();
        }
    }

    //When option 4 is choosen this method runs
    //Prints name of Coach and uses practice to show only hte coach
    public static void practicaPlan(){
        System.out.print("\t\t\t\t"+coach.getName()+" "+coach.getLastName()+" "+coach.getAge()+" "+((Coach)coach).getStrategy()+" -> ");
        ((Coach)coach).planPractice();
    }


    //When option 5 is choosen this method runs
    //Prints name of Players and uses interview to show only the players because only they do interviews
    public static void interview(){
        //Prints first player info
        System.out.print("\t\t\t\t"+player1.getName()+" "+player1.getLastName()+" "+((Player)player1).getPosition()+" "+((Player)player1).getPlayerNumber()+" -> \uD83C\uDFC3 ");
        ((Player)player1).interview();
        System.out.println();
    //Prints second player info
        System.out.print("\t\t\t\t"+player2.getName()+" "+player2.getLastName()+" "+((Player)player2).getPosition()+" "+((Player)player2).getPlayerNumber()+" -> \uD83C\uDFC3");
        ((Player)player2).interview();

    }

    //When option 6 is choosen this method runs
    //Prints name of Doctor and uses treatInjury to show only the doctor's info because only he do treats injuries
    public static void treatInjury(){
        System.out.print("\t\t\t\t"+doctor.getName()+" "+doctor.getLastName()+" "+((Medic)doctor).getDegree()+" "+((Medic)doctor).getExperienceTime()+" -> ");
        ((Medic)doctor).treatInjury();
    }


}
