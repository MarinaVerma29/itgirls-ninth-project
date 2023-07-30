package in.verma.app9.stream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("суслик", 1));
        animals.add(new Animal("коза", 2));
        animals.add(new Animal("шиншилла", 3));
        animals.add(new Animal("жираф", 4));
        animals.add(new Animal("морская свинка", 5));
        animals.add(new Animal("заяц", 6));
        animals.add(new Animal("капибара", 7));
        animals.add(new Animal("конь", 8));
        animals.add(new Animal("выхухоль", 9));
        animals.add(new Animal("овца", 10));

        boolean lionFound = false;

        for (Animal animal : animals) {
            if (animal.getName().equals("лев")) {
                System.out.println("Возраст льва: " + animal.getAge());
                lionFound = true;
                break;
            }
        }

        if (!lionFound) {
            throw new IllegalArgumentException("Лев не обнаружен");
        }
    }
}
