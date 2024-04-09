import java.io.IOException;
import java.util.Scanner;


public class InputProcessor {
    public void dataInputProcess() {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите данные через пробел в формате: Фамилия Имя Отчество дата_рождения номер_телефона пол");
            String input = scanner.nextLine();

            String[] userData = UserInputParser.parseUserDataInput(input);
            DataValidator.validate(userData);

            String surname = userData[0];
            FileManager.writeToTextFile(surname + ".txt", input);

            System.out.println("Данные успешно записаны в файл " + surname + ".txt");
        } catch (DataFormatException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

