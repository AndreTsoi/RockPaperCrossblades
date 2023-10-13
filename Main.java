import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Human, let’s have an epic game of Rock, Paper, Crossblades!");

        String input = scanner.nextLine();

        if (input.length() >= 50) {
            String[] words = input.split(" ");
            String keyword = words[words.length - 1];
            keyword = keyword.toLowerCase();

            if (keyword.contains("paper")) {
                String move = randomMove();

                System.out.println("Me: Does he know my strategy? No, impossible... what are the chances? Did\n" +
                        "he steal my notes? Did he follow me into the archives? No, stay the course: " + move);

                if (move.equals("PAPER!")) {
                    printTie();
                } else if (move.equals("CROSSBLADES!")) {
                    printLose();
                } else if (move.equals("ROCK!")) {
                    printWin();
                }



            } else if (keyword.contains("crossblades")) {
                String move = randomMove();
                System.out.println("Me: Does he know my strategy? No, impossible... what are the chances? Did\n" +
                        "he steal my notes? Did he follow me into the archives? No, stay the course: " + move);

                if (move.equals("PAPER!")) {
                    printWin();
                } else if (move.equals("CROSSBLADES!")) {
                    printTie();
                } else if (move.equals("ROCK!")) {
                    printLose();
                }
            } else if (keyword.contains("rock")) {
                String move = randomMove();
                System.out.println("Me: Does he know my strategy? No, impossible... what are the chances? Did\n" +
                        "he steal my notes? Did he follow me into the archives? No, stay the course: " + move);
                if (move.equals("PAPER!")) {
                    printLose();
                } else if (move.equals("CROSSBLADES!")) {
                    printWin();
                } else if (move.equals("ROCK!")) {
                    printTie();
                }
            } else {
                String move = randomMove();
                System.out.println("Me: You have failed to adhere to the ancient traditions of Rock, Paper, Crossblades! You have lost by disqualification! Disgraceful! ");
                System.out.println();
                System.out.println("Result: As I predicted, I have won this battle. The kingdom is MINE!");
            }




        } else {
            System.out.println("Pathetic. You cannot hope to beat me without the passion of a thousand suns, without the dedication of a Pleistocene glacier! I choose " + randomMove());
            System.out.println();
            System.out.println("As I predicted, I have won this battle. The kingdom is MINE!");
        }






    }

    public static String randomMove() {

        int num = (int) (Math.random()*3) + 1;

        if (num == 1) {
            return "ROCK!";
        } else if (num == 2) {
            return "PAPER!";
        } else {
            return "CROSSBLADES!";
        }


    }

    public static void printTie() {
        System.out.println();
        System.out.println("Result: Unbelievable! We have tied! *Eye twitches*");
    }

    public static void printLose() {
        System.out.println();
        System.out.println("Result: As I predicted, I have won this battle. The kingdom is MINE!");
    }

    public static void printWin() {
        System.out.println();
        System.out.println("Result: Impossible, you have beaten me...");
    }

}