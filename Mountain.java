
package lb3tareevamiroshnichencko;


public class Mountain extends Elevation{
    private boolean _isClimbed;
    
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
