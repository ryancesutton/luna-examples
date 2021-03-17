package movies;

import utils.Input;

public class MoviesApplication {

    public static void main(String[] args) {

        boolean running = true;

        while (running) {
            System.out.println(returnMenuDisplay());

            int userResponse = promptUserForChoice();
            running = executeUserChoice(userResponse);
        }

    }


    private static boolean executeUserChoice(int choice) {
        boolean continueRunning = true;

        switch (choice) {

            case 0:
                continueRunning = false;
                break;
            case 1:
                for (Movie movie : MoviesArray.findAll()) {
                    System.out.println("\n");
                    System.out.printf("%s -- %s", movie.getName(), movie.getCategory());
                    System.out.println("\n");
                }
                break;
            case 2:
                System.out.println("\n");
                viewMoviesByCategory("animated");
                System.out.println("\n");
                break;
            case 3:
                System.out.println("\n");
                viewMoviesByCategory("drama");
                System.out.println("\n");
                break;
            case 4:
                System.out.println("\n");
                viewMoviesByCategory("horror");
                System.out.println("\n");
                break;
            case 5:
                System.out.println("\n");
                viewMoviesByCategory("scifi");
                System.out.println("\n");
                break;

        }
        return continueRunning;
    }


    private static void viewMoviesByCategory(String category) {
        for (Movie movie : MoviesArray.findAll()) {
            if (movie.getCategory().equalsIgnoreCase(category)) {
                //Display the movie.
                System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
            }
        }
    }


    private static String returnMenuDisplay() {
        String choices = "What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category";

        return choices;
    }

    private static int promptUserForChoice() {
        Input input = new Input();
        System.out.println("Enter your choice: ");
        int response = input.getInt(0, 5);

        return response;
    }


}
