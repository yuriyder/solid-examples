package principle.dependency.inversion.best_code;

/*
 * Модули верхних уровней не должны зависеть от модулей нижних уровней. Оба типа модулей должны зависеть от абстракций.
 * Абстракции не должны зависеть от деталей. Детали должны зависеть от абстракций.
 * */
public class Main {
    public static void main(String[] args) {
        HappyMan happyMan = new HappyMan();
        happyMan.setFoodProvoder(new FirstWife());
        System.out.println(happyMan.getFood());
        // Теперь человеку может готовить еду не только жена, но и все люди, которые умеют готовить.
        happyMan.setFoodProvoder(new SecondWife());
        System.out.println(happyMan.getFood());

        happyMan.setFoodProvoder(new Sister());
        System.out.println(happyMan.getFood());

        happyMan.setFoodProvoder(new Mother());
        System.out.println(happyMan.getFood());
    }
}

class HappyMan {
    private FoodProvoder foodProvoder;
    public String getFood() {
        return foodProvoder.getFood();
    }

    public FoodProvoder getFoodProvoder() {
        return foodProvoder;
    }

    public void setFoodProvoder(FoodProvoder foodProvoder) {
        this.foodProvoder = foodProvoder;
    }
}

interface FoodProvoder {
    String getFood();
}

class FirstWife implements FoodProvoder {

    @Override
    public String getFood() {
        return "Vegetarian food";
    }
}


class SecondWife implements FoodProvoder {

    @Override
    public String getFood() {
        return "Fast food";
    }
}

class Sister implements FoodProvoder {

    @Override
    public String getFood() {
        return "Classic food";
    }
}

class Mother implements FoodProvoder {

    @Override
    public String getFood() {
        return "Tasty food";
    }
}