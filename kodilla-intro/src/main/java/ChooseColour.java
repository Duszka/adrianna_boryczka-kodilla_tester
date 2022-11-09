import java.util.Scanner;

public class ChooseColour {
    public static String getColour() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the first letter of the colour:");
            String firstLetter = scanner.nextLine().trim();
            switch (firstLetter) {
                case "w": return "white";
                case "p": return "pink";
                case "r": return "red";
                case "o": return "orange";
                case "y": return "yellow";
                case "s": return "silver";
                case "g": return "gold";
                case "b": return "black";
                default:
                    System.out.println("This colour is not found.");
            }
        }
    }

    public static void main(String[] args) {
        ChooseColour firstLetter = new ChooseColour();
        String result = firstLetter.getColour();
        System.out.println(result);
    }
}
