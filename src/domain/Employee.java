package domain;
/**
 * Базовий клас "Робітник"
 * @author jupishy
 */
public class Employee {

    /**
     * Вивід інформації про робітника
     * @return Айді, ім'я, робота, рівень, відділ
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }

    private String name;
    private String jobTitle;
    private int ID;
    private int level;
    private String dept;

   // private static int employeesCount = 0;

    /**
     * Встановлення відомостей про робітника
     * @param name ім'я
     * @param jobTitle робота
     * @param level рівень
     * @param dept відділ
     */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }

    /**
     * Ініціалізація айді робітника
     */
    public Employee() {
        ID = (int)(Math.random()*1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
    }

    /**
     * Встановити роботу
     * @param job 
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }

    /**
     * Дізнатися роботу
     * @return робота
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Дізнатися ім'я
     * @return ім'я
     */
    public String getName() {
        return name;
    }

    /**
     * Встановити рівень
     * @param level рівень робітника
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }

    /**
     * Дізнатися рівень
     * @return рівень робітника
     */
    public int getLevel() {
        return level;
    }

    /**
     * Дізнатися відділ
     * @return відділ робітника
     */
    public String getDept() {
        return dept;
    }

    /**
     * Встановити відділ
     * @param dept відділ
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * Встановити ім'я
     * @param name ім'я робітника
     */
    public void setName(String name) {
//        boolean correctName = true;
//        for (int i = 0; i < name.length(); i++) {
//            char s = name.charAt(i);
//            if (Character.isDigit(s)) {
//                correctName = false;
//            }
//        }
//        if (correctName) {
//            this.name = name;
//        } else {
//            this.name = "John Doe";
//        }
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}
