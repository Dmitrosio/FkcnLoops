import java.util.Random;   

public class Main {
    
    public static void main(String[] args) {
        Random random = new Random();

        displayTitle();

        displayBlankLines();

        displayOverview();

        displayBlankLines();

        String[] crewMembersList = {"Dmitrii", "Marcos", "Ben", "Anthony", "Hunter", "Sam", "Zack", "Jeff", "Mike", "Tony"};

        Integer[] roomNumbersList = {101, 202, 303, 404, 505, 606, 707, 808, 909, 111};

        // CrewMember[] crewMembers = new CrewMember[10];

        // //creating a loop 
        System.out.println("Members of the Crew: \n");
        for(int i = 0; i < crewMembersList.length; i++){
            System.out.println(crewMembersList[i]);
        }

        displayBlankLines();

        System.out.println("Rooms assigned to the Crew: \n");
        for(int i = 0; i < roomNumbersList.length; i++){
            System.out.println(roomNumbersList[i]);
        }

        System.out.println("Random Number Generator: \n");
        for(int y : roomNumbersList){
            int randNum = random.nextInt(roomNumbersList.length);
            System.out.println(roomNumbersList[randNum]);
            roomNumbersList[randNum];
        }
            

       
    }
    //method that displays a title to the user
    public static void displayTitle(){
        System.out.println(">>>>>>>> Mars Base Crew Assignment <<<<<<<");
    }

    //method that displays blank lines for a nice seperation
    public static void displayBlankLines(){
        System.out.println("\n\n\n");
    }

    //method that display overview of the mission to the user
    public static void displayOverview(){
        System.out.println("<<<<<<< Overview >>>>>>>");
        System.out.println("This application will assign each crew member a role randomly to a room on the Mars base.");
    }
}
