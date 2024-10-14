package lb3tareevamiroshnichencko;

public class Elevation {
    private String _name;
    private int _age;
    private String _country;
    private double _latitude;
    private double _longitude;
    private int _height;
    
    // Геттер для _name
    public String getName() {
        return _name;
    }
    
    // Геттер для _age
    public int getAge() {
        return _age;
    }
    
    // Геттер для _country
    public String getCountry() {
        return _country;
    }
    
    // Геттер для _latitude
    public double getLatitude() {
        return _latitude;
    }
    
    // Геттер для _longitude
    public double getLongitude() {
        return _longitude;
    }
    
    // Геттер для _height
    public int getHeight() {
        return _height;
    }
    
    // Сеттер для _name
    public void setName(String value) {
        this._name = value;
    }
    
    // Сеттер для _age
    public void setAge(int value) {
        this._age = value;
    }
    
        // Сеттер для _country
    public void setCountry(String value) {
        this._country = value;
    }
    
        // Сеттер для _latitude
    public void setLatitude(double value) {
        this._latitude = value;
    }
    
            // Сеттер для _longitude
    public void setLongitude(double value) {
        this._longitude = value;
    }
    
        // Сеттер для _height
    public void setHeight(int value) {
        this._height = value;
    }
    
    //Метод про проверки высота больше 1000(1000 изменить на константу или перерменкой из функций для массива   )
    public boolean isMoreThousandHeight(){
        if(_height>1000){
            return true;
        }
        return false;     
    }
    
    public void printInfo() {
        System.out.println("Имя: " + _name +
                           ", Высота: " + _height +
                           ", Возраст: " + _age +
                           ", Страна: " + _country +
                           ", Широта: " + _latitude +
                           ", Долгота: " + _longitude);
    }

     
}
