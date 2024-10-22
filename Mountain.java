
package lb3tareevamiroshnichencko;


public class Mountain extends Elevation{
    private boolean _isClimbed;
    
    // Конструктор по умолчанию
    public Mountain() {
        super(); // Вызов конструктора по умолчанию родительского класса
        this._isClimbed = false; // Устанавливаем значение по умолчанию
    }

    // Параметризованный конструктор
    public Mountain(String name, int age, String country, double latitude, double longitude, int height, boolean isClimbed) {
        super(name, age, country, latitude, longitude, height); // Передаем параметры родительскому классу
        this._isClimbed = isClimbed;
    }
    
        // Геттер для _isClimbed
    public boolean getClimbed() {
        return _isClimbed;
    }
    
    // Сеттер для _isClimbed
    public void setIsClimbed(boolean value) {
        this._isClimbed = value;
    }
    
    @Override
    public void printInfo() {
        super.printInfo(); // Выводим информацию из родительского класса
        System.out.println("На нее взбирались: " + (_isClimbed ? "Да" : "Нет"));
    }
}
