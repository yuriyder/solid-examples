package principle.dependency.inversion.better_code;

/*
 * Модули верхних уровней не должны зависеть от модулей нижних уровней. Оба типа модулей должны зависеть от абстракций.
 * Абстракции не должны зависеть от деталей. Детали должны зависеть от абстракций.
 * */
public class Main {
    public static void main(String[] args) {
        NormalMan normalMan = new NormalMan();
        normalMan.setWife(new FirstWife());
        System.out.println(normalMan.getFood());
        // Если человек захочет другую еду, то ему придется постоянно менять жену
        normalMan.setWife(new SecondWife());
        System.out.println(normalMan.getFood());
    }
}

class NormalMan {
    private Wife wife;
    public String getFood() {
        return wife.getFood();
    }

    public Wife getWife() {
        return wife;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }
}

interface Wife {
    String getFood();
}

class FirstWife implements Wife {

    @Override
    public String getFood() {
        return "Vegetarian food";
    }
}


class SecondWife implements Wife {

    @Override
    public String getFood() {
        return "Fast food";
    }
}