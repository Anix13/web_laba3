package lb3tareevamiroshnichencko;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MountainArray {
    private List<Elevation> mountains;

    public MountainArray() {
        this.mountains = new ArrayList<>();
    }

    // Метод для добавления новой горы
    public void addMountain(Elevation mountain) {
        mountains.add(mountain);
    }

    // Определение самой высокой вершины
    public Elevation getHighestMountain() {
        return mountains.stream()
            .max(Comparator.comparingInt(Elevation::getHeight))
            .orElse(null);
    }

    // Определение вершин с высотой более 1000 м
    public List<Elevation> getMountainsOver1000() {
        List<Elevation> result = new ArrayList<>();
        for (Elevation mountain : mountains) {
            if (mountain.isMoreThousandHeight()) {
                result.add(mountain);
            }
        }
        return result;
    }

    // Упорядочивание массива по возрастанию высот
    public void sortMountainsByHeight() {
        mountains.sort(Comparator.comparingInt(Elevation::getHeight));
    }

    // Поиск по названию вершины и изменение одного из полей
    public void updateMountainByName(String name, String newCountry) {
        for (Elevation mountain : mountains) {
            if (mountain.getName().equalsIgnoreCase(name)) {
                mountain.setCountry(newCountry);
                System.out.println("Обновленная информация о горе " + name + ":");
                mountain.printInfo(); // Используем метод printInfo
                return;
            }
        }
        System.out.println("Гора с именем " + name + " не найдена.");
    }

    // Вывод всей информации о вершинах
    public void printAllMountains() {
        for (Elevation mountain : mountains) {
            mountain.printInfo(); // Используем метод printInfo
        }
    }
}
