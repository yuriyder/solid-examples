/* *
 * "A class should have only one reason to change."
 *  У каждого класса должна быть своя зона ответственности - класс должен иметь интуитивно понятную для себя логику.
 * */
package principle.single.responsibility.v1;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.drive();

        Cook cook = new Cook();
        cook.cook();

        Footballer footballer = new Footballer();
        footballer.playFootball();

        EmployeeFacade employeeFacade = new EmployeeFacade();
        employeeFacade.drive();
        employeeFacade.cook();
        employeeFacade.playFootball();
    }
}

// !!!Так делать нельзя.
/*class Employee {
    int getSalary() { return 10; }
    void cook() {}
    void drive() {}
    void playFootball() {};
}*/

// У каждого рабочего своя зарплата
interface Employee {
    int getSalary();
}

class Cook implements Employee {
    void cook() {}

    @Override
    public int getSalary() { return 0; }
}

class Driver implements Employee {
    void drive() {}

    @Override
    public int getSalary() { return 0; }
}

class Footballer implements Employee {
    void playFootball() {}

    @Override
    public int getSalary() { return 0; }
}

//Если нужно, чтобы рабочий умел делать все, то делаем фасад
class EmployeeFacade implements Employee {
    private Driver driver = new Driver();
    private Cook cook = new Cook();
    private Footballer footballer = new Footballer();

    void playFootball() {
        footballer.playFootball();
    }

    void drive() {
        driver.drive();
    }

    void cook() {
        cook.cook();
    }

    @Override
    public int getSalary() {
        return 0;
    }
}