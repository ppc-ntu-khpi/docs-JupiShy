package domain;
/**
 * Клас робітника "Художник"
 * @see Employee
 * @author jupishy
 */
public class Artist extends Employee {
    
    /**
     * Визначає всі параметри робітника-художника
     * @param skiils навички
     * @param name ім'я
     * @param jobTitle назва роботи
     * @param level рівень
     * @param dept відділ
     */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }
    
    /**
     * Встановлення навичок 
     * @param skiils 
     */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }
    
    /**
     * Додавання навичок
     *
     */
    public Artist() {
        super();
        this.skiils = new String[10];
    }

    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    private String[] skiils;

    /**
     * Дізнатися навички
     * @return список навичок рядком
     */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановити навички
     * @param skills 
     */
    public void setSkills(String[] skills) {
        this.skiils=skills;
    }

    /**
     * Отримати навички
     * @return навички
     */
    public String[] getSkillsLSist() {
        return skiils;
    }
}