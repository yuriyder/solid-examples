package principle.dependency.inversion.worst_code;

/*
* Модули верхних уровней не должны зависеть от модулей нижних уровней. Оба типа модулей должны зависеть от абстракций.
* Абстракции не должны зависеть от деталей. Детали должны зависеть от абстракций.
* */
public class Main {
    public static void main(String[] args) {
        UnhappyMan unhappyMan = new UnhappyMan();
        System.out.println(unhappyMan.getFood());
    }
}

class UnhappyMan {
    private FirstWife firstWife = new FirstWife(); // Если человек захочет другую еду, то ему придется жениться на другой жене
    public String getFood() {
        return firstWife.getFood();
    }
}

class FirstWife {
    public String getFood() {
        return "Vegetarian food";
    }
}