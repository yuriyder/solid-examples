package principle.liskov.substitution;

import java.util.Arrays;
import java.util.List;

/*
* Дочерние классы не должны ломать логику, которую требует/предоставляет родительский класс
* */

public class Main {
    public static void main(String[] args) {
        List<Bird> birds = Arrays.asList(
                new Bird(),
                new Duck(),
                new Penguin() // Пингвин бросает исключение, потому что не умеет летать
        );

        birds.forEach(bird -> System.out.println(bird.getFlySpeed()));
    }
}


/*
* Реальный класс, который используется в коде
* */
class Bird {
    public int getFlySpeed() {
        return 10;
    }
}

/*
* Расширяет класс Bird
* Переопределяет метода getFlySpeed() и не ломает логику, предоставленную родительским классом
* Добавляет новый метот getSweemSpeed()
* */
class Duck extends Bird {

    @Override
    public int getFlySpeed() {
        return 8;
    }

    public int getSweemSpeed() {
        return 2;
    }
}

/*
* Расширяет класс Bird;
* Переопределяет метода getFlySpeed() и ломает логику, предоставленную родительским классом, т.к пингвины не умеют летать
* getFlySpeed() выбрасывает исклбючение
* */
class Penguin extends Bird {
    @Override
    public int getFlySpeed() { // Пингвины не умеют летать
        throw new IllegalStateException("Пингвины не умеют летать ");
    }
}