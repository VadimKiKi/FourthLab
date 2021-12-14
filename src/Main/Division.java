package Main;
import java.util.*;

/**
 * Класс сущность подразделение
 * @author Vadim Taratonov
 * @version 1.0
 */
public class Division {
    /**
     * Переменная счетчик для созданных объектов
     */
    private static int count = 0;
    /**
     * Переменная имя подразделения
     */
    private String name;
    /**
     * Переменная ID подразделения
     */
    private int ID;
    /**
     * Хранилище множества уникальных объектов подразделения
     */
    private static Set<Division> divisionsSet = new HashSet<>();

    /**
     * Конструктор для подразделения
     * @param name имя подразделения
     */
    public Division(String name) {
        this.name = name;
        this.ID = count;
        count++;
    }

    /**
     * Функция добавления нового подразделения
     * @param name имя подразделения
     * @return возвраает подразделение
     */
    public static Division createNewDivision(String name) {
        for (Division div: divisionsSet) {
            if (name.equals(div.getName())) {
                return div;
            }
        }
        Division division = new Division(name);
        divisionsSet.add(division);
        return division;
    }

    /**
     * Функция получения имени подразделения
     * @return возвращает имя подразделения
     */
    public String getName() { return name; }

    /**
     * Функция присваивания имени подразделению
     * @param name имя подразделения
     */
    public void setName(String name) { this.name = name; }

    /**
     * Функция получения ID подразделения
     * @return возвращает ID подразделения
     */
    public int getID() { return ID; }

    /**
     * Функция присваивания ID подразделению
     * @param ID ID подразделения
     */
    public void setID(int ID) { this.ID = ID; }

    /**
     * Функция получения подразделений
     * @return возвращает подразделения
     */
    public static Set<Division> getDivisionsSet() { return divisionsSet; }

    /**
     * Функция вывода данных о подразделении
     * @return возвращает информацию о подразделение
     */
    @Override
    public String toString() {
        return "Division{" +
                "name='" + name + '\'' + " id "+ ID +
                '}';
    }
}
