import java.util.Scanner;

public class LabAssignment6_Julian_Spindola {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Total number of steps will be: ");
        possibleSteps(input.nextInt(), "");
    }
    public static void possibleSteps(int stepsLeft, String currentCombination){
        if (stepsLeft == 0) { //base case, print out combination to user once steps left == 0.
            System.out.println(currentCombination.substring(0, currentCombination.length() - 2));
            return;
        }

        possibleSteps(stepsLeft - 1, currentCombination + "1, "); //first recursive case, takes one step and adds it to the string currentCombination.

        if (stepsLeft >= 2){
            possibleSteps(stepsLeft - 2, currentCombination + "2, "); //second recursive case, takes two steps and adds it to the string currentCombination.
        }
    }
}