package stack.overview;

import java.util.Scanner;

public class AskUser {
    public void askUser (){
        Scanner scnr = new Scanner(System.in);
        StackOverview languagesLearned = new StackOverview();

            System.out.print("Type '1' to view the languages, '2' to add, '3' to remove, '4' to exit: ");
            int userChoice = scnr.nextInt();
            scnr.nextLine();

            while (userChoice == 1 || userChoice == 2 || userChoice == 3 || userChoice == 4) {
                switch (userChoice) {
                    case 1:
                        System.out.println("Languages Learned: " + languagesLearned.getLanguages());
                        break;
                    case 2:
                        String nextLanguage = scnr.nextLine();
                        languagesLearned.setLanguages(nextLanguage);
                        break;
                    case 3:
                        languagesLearned.removeLanguage();
                        break;
                    case 4:
                        System.out.println("Exiting");
                        userChoice = 5;
                        break;
                }
            }

    }
}
