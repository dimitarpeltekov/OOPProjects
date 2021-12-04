package InterfacesAndAbstraction.celebration;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Birthable> thingsWithBirthDate = new ArrayList<>();


        while(!input.equals("End")){
            String[] tokens = input.split("\\s+");
            String objectType = tokens[0];

            switch (objectType){
                case "Citizen":
                    String citizenName = tokens[1];
                    int citizenAge  = Integer.parseInt(tokens[2]);
                    String citizenId = tokens[3];
                    String citizenBirthDate = tokens[4];
                    Citizen citizen = new Citizen(citizenName,citizenAge,citizenId,citizenBirthDate);
                    thingsWithBirthDate.add(citizen);
                    break;
                case "Pet":
                    String petName = tokens[1];
                    String petBirthDate = tokens[2];
                    Pet pet = new Pet(petName,petBirthDate);
                    thingsWithBirthDate.add(pet);

                    break;
                case "Robot":
                    String robotId = tokens[1];
                    String robotModel = tokens[2];
                    Robot robot = new Robot(robotId, robotModel);
                    break;

            }
            input = scanner.nextLine();

        }
        String year = scanner.nextLine();
        boolean isFound = false;
        for(Birthable thingWithBirthDate:thingsWithBirthDate){
           if(thingWithBirthDate.getBirthDate().endsWith(year)){
               isFound = true;
               System.out.println(thingWithBirthDate.getBirthDate());
           }
        }

        if(!isFound){
            System.out.println("<no output>");
        }




    }
}
