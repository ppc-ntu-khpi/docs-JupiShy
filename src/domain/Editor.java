package domain;
/**
 * Клас робітника "Редактор"
 * @see Artist
 * @author jupishy
 */
public class Editor extends Artist {

    /**
     * Встановлення параметрів редактора
     * @param electronicEditing електронне редагування
     * @param skiils навички
     * @param name ім'я
     * @param jobTitle назва роботи
     * @param level рівень
     * @param dept відділ
     */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Встановлення параметрів
     * @param electronicEditing
     * @param skiils 
     */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Встановлення параметра
     * @param electronicEditing 
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    
    /**
     * Встановлення electronicEditing на позитивне значення
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }

    private boolean electronicEditing;

    /**
     * Отримати значення чи займається електронним редагування
     * @return значення так/ні
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

    /*
    Встановити значення чи займається ел.редагуванням
    */
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}