package Main;
import java.io.*;
import java.util.*;

/**
 * Класс база данных
 * @author Vadim Taratonov
 * @version 1.1
 */
public class DataBase {
    /**
     * Переменная путь к файлу
     */
    public String csvfilePath = "C:\\Users\\tarat\\IdeaProjects\\FourthLab\\src\\Main\\foreign_names.csv";
    /**
     * Лист объектов класса Human
     */
    List<Human> humanDb = new ArrayList<>();

    /**
     * Функция считывания всех даных изфайла csv
     * @throws FileNotFoundException ошибка, если файл не найден
     */
    public void test() throws FileNotFoundException {
        File file = new File(csvfilePath);
        Scanner scanner = new Scanner(file);


        while (scanner.hasNextLine()) {
            String[] humInfoArr = scanner.nextLine().split(";");

            int id = Integer.parseInt(humInfoArr[0]);
            String name = humInfoArr[1];
            String gender = humInfoArr[2];
            String date = humInfoArr[3];
            String divis = humInfoArr[4];
            int salary = Integer.parseInt(humInfoArr[5]);

            humanDb.add(new Human(id, name, gender, date, Division.createNewDivision(divis), salary));

        }
        scanner.close();

        for (Human human : humanDb) {
            System.out.println(human);
            System.out.println();
        }
    }


}
