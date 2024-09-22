package utils;

public class TextConsole {
    private TextConsole() {
    }

    public static final String ENTER_INPUT_FILE = "Введите путь к входному файлу (например, input.txt):";
    public static final String ENTER_OUTPUT_FILE = "Введите путь к выходному файлу (например, input.txt):";
    public static final String ENTER_KEY = "Введите ключ для шифрования (целое число):";
    public static final String SUCCESS_MESSAGE = "Операция успешно выполнена.";
    public static final String SUCCESS_WRITE = "Запись успешно завершена.";
    public static final String SUCCESS_READ = "Файл успешно прочитан.";
    public static final String READ_FILE_ERROR = "Что-то пошло не так при чтении файла...Попробуйте еще раз.";
    public static final String MENU_TEXT_ERROR = "Такого варианта ответа нет! Пожалуйста, введите целое число от 0 до 2.";
    public static final String KEY_ERROR = "Ключ должен быть целым числом, желательно не 0 :)";
    public static final String WRITE_FILE_ERROR = " Не удалось записать файл. Попробуйте еще раз";
    public static final String FILE_FOUND = "Файл %s найден!\n";
    public static final String FILE_NOT_FOUND = "Файл %s не найден!\n";

    public static void printGreeting() {
        System.out.println("+---------------------------------------+");
        System.out.println("|  Вас приветствует криптоанализатор!   |");
        System.out.println("+---------------------------------------+\n");
    }

    public static void makeChoice() {
        System.out.println("     Выберите один из вариантов ниже :");
        System.out.println("1 <- Засшифруйте сообщение, используя метод Цезаря.");
        System.out.println("2 <- Расшифруйте сообщение, используя метод Цезаря.");
        System.out.println("0 <- Выход из прогоаммы");
    }

    public static void repeatMenu() {
        System.out.println("Хотите повторить?... ");
        System.out.println("*********************************************");
    }

}
