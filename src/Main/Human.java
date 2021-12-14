package Main;

/**
 *  Класс сущность человек
 *  @author Vadim Taratonov
 *  @version 1.0
 */
public class Human {
    /**
     *  Переменная ID человека
     */
    private int ID;
    /**
     * Переменная имя человека
     */
    private String name;
    /**
     * Переменная пол человека
     */
    private String gender;
    /**
     * Переменная подразделение(сущность подразделение)
     */
    private Division division;
    /**
     * Переменная зарплата
     */
    private int salary;
    /**
     * Переменная дата рождения
     */
    private String bornDate;

    /**
     * Конструктор создания человека
     * @param ID ID
     * @param name имя
     * @param gender пол
     * @param bornDate дата рождения
     * @param division подразделение
     * @param salary зарплата
     */
    public Human(int ID, String name, String gender, String bornDate, Division division, int salary) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.division = division;
        this.salary = salary;
        this.bornDate = bornDate;
    }

    /**
     * Функция получения имени человека
     * @return возвращает имя человека
     */
    public String getName() {
        return name;
    }

    /**
     * Функция присваивания имени человеку
     * @param name имя человека
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Функция получения ID человека
     * @return возвращает ID человека
     */
    public int getID() {
        return ID;
    }

    /**
     * Функция присваивания ID человеку
     * @param ID ID человека
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * Функция получения пола человека
     * @return возвращает пол человека
     */
    public String getGender() {
        return gender;
    }

    /**
     * Функция присваивания пола человека
     * @param gender пол человека
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Функция получения даты рождения человека
     * @return возвращает дату рождения человека
     */
    public String getBornDate() {
        return bornDate;
    }

    /**
     * Функция присваивания даты рождения человеку
     * @param bornDate дата рождения
     */
    public void setBornDate(String bornDate) { this.bornDate = bornDate; }

    /**
     * Функция получения подраделения человека
     * @return возвращает подразделение человека
     */
    public Division getDivision() {
        return division;
    }

    /**
     * Функция присваивания подразделения человеку
     * @param division подразделение человека
     */
    public void setDivision(Division division) {
        this.division = division;
    }

    /**
     * Функция получения значения зарплаты человека
     * @return возвращает значение зарплаты человека
     */
    public int getSalary() { return salary; }

    /**
     * Функия присваивания значения зарплаты человеку
     * @param salary значение зарплаты человека
     */
    public void setSalary(int salary) { this.salary = salary; }

    /**
     * Функция вывода данных о человеке
     * @return возвращает информацию о человеке
     */
    @Override
    public String toString() {
        return "Human{" +
                "id=" + ID +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\''  +
                ", bornDate='" + bornDate + "' " +", division=" + division +
                ", salary=" + salary +
                '}';
    }
}
