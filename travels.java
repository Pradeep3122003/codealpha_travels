import java.util.Scanner;

public class travels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input destinations and dates
        System.out.println("Welcome to the Travel Itinerary Planner!");
        System.out.print("Enter the number of destinations: ");
        int numDestinations = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[] destinations = new String[numDestinations];
        String[] dates = new String[numDestinations];

        for (int i = 0; i < numDestinations; i++) {
            System.out.print("Enter destination #" + (i + 1) + ": ");
            destinations[i] = scanner.nextLine();
            System.out.print("Enter date of visit (MM/DD/YYYY): ");
            dates[i] = scanner.nextLine();
        }

        // Generate travel plan
        System.out.println("\nGenerating travel plan...\n");

        for (int i = 0; i < numDestinations; i++) {
            System.out.println("Destination: " + destinations[i]);
            System.out.println("Date of visit: " + dates[i]);
            // Fetch and display maps
            System.out.println("Map: https://www.travelplan.com/" + destinations[i]);
            // Fetch and display weather information
            System.out.println("Weather: 31deg (estimated)");

            // Calculate and display estimated expenses
            double expenses = calculateExpenses(destinations[i], dates[i]);
            System.out.println("Estimated expenses: " + expenses);
            System.out.println();
        }

        System.out.println("Enjoy your trip!");
    }
    //expense calculation

    private static double calculateExpenses(String destination, String date) {
        int food = 300;
        int room = 700;
        int travel = 500;
        return food+room+travel; // Placeholder value
    }
}
 