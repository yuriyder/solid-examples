package principle.interface_.segregation.correct;

/*
 * Лучше делать много интерфейсов, чем один большой.
 * Клиенты-классы не должны предоставлять методы(имплементировать), которые не относятся к ним.
 * */
public class CorrectMain {
    public static void main(String[] args) {
    }
}

interface IOsProgrammingSkills {
    boolean swift ();
    boolean objectC ();
}

interface FronEndProgrammingSkills {
    boolean html ();
    boolean css ();
}

interface BackEndProgrammingSkills {
    boolean java ();
    boolean c ();
}

class IOsDeveloper implements IOsProgrammingSkills {
    @Override
    public boolean swift() {
        return true;
    }

    @Override
    public boolean objectC() {
        return true;
    }
}

class FrontEndDeveloper implements FronEndProgrammingSkills {

    @Override
    public boolean html() {
        return true;
    }

    @Override
    public boolean css() {
        return true;
    }
}

class BackEndDeveloper implements BackEndProgrammingSkills {

    @Override
    public boolean java() {
        return true;
    }

    @Override
    public boolean c() {
        return true;
    }
}
