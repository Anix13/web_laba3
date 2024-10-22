
package lb3tareevamiroshnichencko;

import java.time.Year;


public class Volcano extends Mountain{
    private int _lastErmulationYear;
    private boolean _isActive;
    
    // Конструктор по умолчанию
    public Volcano() {
        super(); // Вызов конструктора по умолчанию родительского класса
        this._lastErmulationYear = 0; // Устанавливаем значение по умолчанию
        this._isActive = false;
    }

    // Параметризованный конструктор
    public Volcano(String name, int age, String country, double latitude, double longitude, int height, boolean isClimbed, int lastErmulationYear, boolean isActive) {
        super(name, age, country, latitude, longitude, height, isClimbed ); // Передаем параметры родительскому классу
        this._lastErmulationYear = lastErmulationYear;
        this._isActive = isActive;
    }
    
    // Геттер для _isActive
    public boolean getIsActive() {
        return _isActive;
    }
    
    // Геттер для _lastErmulationYear
    public int getLastErmulationYear() {
        return _lastErmulationYear;
    }
    
    // Сеттер для _isActive
    public void setIsActive(boolean value) {
        this._isActive = value;
    }
    
    // Сеттер для _lastErmulationYear
    public void setLastErmulationYear(int value) {
        this._lastErmulationYear = value;
    }
    
    private boolean isActive(){
        int currentYear = Year.now().getValue();
        if (currentYear-_lastErmulationYear<1000000){
            return true;
        }
        return false;
    }
    
    @Override
    public void printInfo() {
        super.printInfo(); // Выводим информацию из родительского класса
        System.out.println("Год последнего извержения: " + _lastErmulationYear);
        System.out.println("Активен: " + (_isActive?"Да":"Нет"));
        
    }
}
