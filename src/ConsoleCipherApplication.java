import static models.Validator.isFileExists;
import static models.Validator.validateKey;
import static utils.TextConsole.ENTER_INPUT_FILE;
import static utils.TextConsole.ENTER_KEY;
import static utils.TextConsole.ENTER_OUTPUT_FILE;
import static utils.TextConsole.MENU_TEXT_ERROR;
import static utils.TextConsole.SUCCESS_MESSAGE;
import static utils.TextConsole.makeChoice;
import static utils.TextConsole.printGreeting;

import java.util.Scanner;
import models.FileManager;

public class ConsoleCipherApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        printGreeting();
        while (isRunning) {
            makeChoice();
            try {
                int option = Integer.parseInt(scanner.nextLine());
                switch (option) {
                    case 0:
                        System.out.println("До свиданья!");
                        isRunning = false;
                        break;
                    case 1:
                    case 2:
                        executeCipherOperation(option, scanner);
                        break;
                    default:
                        System.out.println(MENU_TEXT_ERROR);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Что-то пошло не так, попробуйте еще раз");
                scanner.nextLine();
            }
        }
    }

    private static void executeCipherOperation(int option, Scanner scanner) {
        System.out.println(ENTER_KEY);
        int key = validateKey(scanner.nextLine());

        System.out.println(ENTER_INPUT_FILE);
        String inputFilePath = scanner.nextLine();

        System.out.println(ENTER_OUTPUT_FILE);
        String outputFilePath = scanner.nextLine();

        if (isFileExists(inputFilePath)) {
            FileManager.writeFile(FileManager.readFile(inputFilePath, key, option), outputFilePath);
            System.out.println(SUCCESS_MESSAGE);
        }
    }
}
