package principle.interface_.segregation.incorrect;

/*
 * Лучше делать много интерфейсов, чем один большой.
 * Клиенты-классы не должны предоставлять методы(имплементировать), которые не относятся к ним.
 * */
public class IncorrectMain {
    public static void main(String[] args) {
//        Developer iOsDeveloper = new IOsDeveloper(true, true, false, false, false, false);
//        Developer frontEndDeveloper = new FrontEndDeveloper(false, false, true, true, false, false);
//        Developer backEndDeveloper = new BackEndDeveloper(false, false, false, false, true, true);
    }
}

/*
* Неправильно использовать один интерфейс
* */
interface ProgrammingSkills {
    boolean swift();
    boolean objectC();
    boolean html();
    boolean css();
    boolean java();
    boolean c();
}

class IOsDeveloper implements ProgrammingSkills {

    @Override
    public boolean swift() {
        return true;
    }

    @Override
    public boolean objectC() {
        return true;
    }

    @Override
    public boolean html() {
        return false;
    }

    @Override
    public boolean css() {
        return false;
    }

    @Override
    public boolean java() {
        return false;
    }

    @Override
    public boolean c() {
        return false;
    }
}

class FrontEndDeveloper implements ProgrammingSkills {

    @Override
    public boolean swift() {
        return false;
    }

    @Override
    public boolean objectC() {
        return false;
    }

    @Override
    public boolean html() {
        return true;
    }

    @Override
    public boolean css() {
        return true;
    }

    @Override
    public boolean java() {
        return false;
    }

    @Override
    public boolean c() {
        return false;
    }
}

class BackEndDeveloper implements ProgrammingSkills {

    @Override
    public boolean swift() {
        return false;
    }

    @Override
    public boolean objectC() {
        return false;
    }

    @Override
    public boolean html() {
        return false;
    }

    @Override
    public boolean css() {
        return false;
    }

    @Override
    public boolean java() {
        return true;
    }

    @Override
    public boolean c() {
        return true;
    }
}
