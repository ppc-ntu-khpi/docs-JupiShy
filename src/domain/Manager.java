package domain;
/**
 * Клас робітника "Менеджер"
 * @see Employee
 * @author jupishy
 */
public class Manager extends Employee {

    /**
     * Встановлює параметри робітника-менеджера
     * @param employees робітники якими керує
     * @param name ім'я
     * @param jobTitle посада
     * @param level рівень
     * @param dept відділ
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }

    /**
     * Встановлює робітників, якими керує
     * @param employees масив робітників
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    
    /**
     * Додає масив з 10 робітників
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    private Employee[] employees;

    /**
     * Показує робітників якими керує менеджер
     * @return рядок з іменами робітників
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює робітників
     * @param employees масив робітників
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }

    /**
     * Отримує робітників
     * @return робітники
     */
    public Employee[] getEmployeesList() {
        return employees;
    }

    
}
