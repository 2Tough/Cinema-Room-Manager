import java.util.Scanner;

public class Main {

// Continue developing project.
    public static void main(String[] args) {
        /* System.out.println("Cinema: ");
        System.out.println(" " + "1 2 3 4 5 6 7 8");
        System.out.println("1 S S S S S S S S");
        System.out.println("2 S S S S S S S S");
        System.out.println("3 S S S S S S S S");
        System.out.println("4 S S S S S S S S");
        System.out.println("5 S S S S S S S S");
        System.out.println("6 S S S S S S S S");
        System.out.println("7 S S S S S S S S"); */

        Scanner scanner = new Scanner(System.in);

        int rows = 0;
        int seats = 0;

        int total = 0;
        int frontRows = 0;
        int backRows = 0;

        int row = 0;
        int seat = 0;

        System.out.println("Enter the number of rows:");
        rows = scanner.nextInt();

        System.out.println("Enter the number of seats in each row:");
        seats = scanner.nextInt();


        while (true) {
            String[][] cinema = new String[rows][seats];
            System.out.println("Cinema:");
            // Top numbers to show columns
            System.out.print(" ");
            for (int num = 1; num <= seats; num++) {
                System.out.print(" " + num);
            }
            System.out.println("");

            // Cinema space
            for (int i = 0; i < rows; i++) {
                // Left numbers (number of rows) => 9 rows
                System.out.print((i + 1) + " ");
                for (int j = 0; j <= seats - 1; j++) {

                    // Print S on empty seats
                    cinema[i][j] = "S ";
                    System.out.print(cinema[i][j]);

                }
                System.out.println("");
            }

            System.out.println("Enter a row number:");
            row = scanner.nextInt();

            System.out.println("Enter a seat number in that row:");
            seat = scanner.nextInt();

            total = rows * seats;
            int X = row;
            int Y = seat;

            //Calculate prices
            if (total < 60) {
                total = 10;
                System.out.println("Ticket price:");
                System.out.println("$" + total);
            } else {
                // first half: price $10
                // back half: price $8
                if (rows % 2 != 0) {
                    //frontRows = (rows/2) * 10;
                    //backRows = ((rows/2) + 1) * 8;
                    //total = (frontRows + backRows) * seats;

                    System.out.println("Ticket price:");
                    if (row <= rows/2 ) {
                        total = 10;
                    } else {
                        total = 8;
                    }
                    System.out.println("$" + total);
                } else {
                    //frontRows = (rows/2) * 10;
                    //backRows = (rows/2) * 8;
                    //total = (frontRows + backRows) * seats;

                    if (row < rows/2) {
                        total = 10;
                    } else {
                        total = 8;
                    }

                    System.out.println("Ticket price:");
                    System.out.println("$" + total);
                }


            }

            //
            System.out.println("Cinema:");
            // Top numbers to show columns
            System.out.print(" ");
            for (int num = 1; num <= seats; num++) {
                System.out.print(" " + num);
            }
            System.out.println("");

            // Cinema space
            for (int i = 0; i < rows; i++) {
                // Left numbers (number of rows) => 9 rows
                System.out.print((i + 1) + " ");
                for (int j = 0; j <= seats - 1; j++) {


                    // Print S on empty seats
                    cinema[i][j] = "S ";
                    cinema[X-1][Y-1] = "B ";
                    System.out.print(cinema[i][j]);

                }
                System.out.println("");
            }

            //cinema[X+1][Y+1] = "B";

            //

            if(!scanner.hasNextInt()) {
                break;
            }



        }



    }
}