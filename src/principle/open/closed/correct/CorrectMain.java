/* *
* "Entities should be open for extension, but closed for modification."
* */
package principle.open.closed.correct;

public class CorrectMain {
    public static void main(String[] args) {
        workInTaxi(new Toyota());
        workInTaxi(new Celica());
    }

    // Метод класса никогда не будет менять свою логику
    static void workInTaxi(Toyota toyota) {
        toyota.workInTaxi();
    }
}

interface Taxi {
    void workInTaxi();
}

class Toyota implements Taxi {
    // 4 пассажира
    private void getPassengers() {
        System.out.println("Take 4 passengers");
    }

    @Override
    public void workInTaxi() {
        getPassengers();
    }
}


class Celica extends Toyota {
    // 1 пассажир
    private void getPassenger() {
        System.out.println("Take 1 passenger");
    }

    @Override
    public void workInTaxi() {
        getPassenger();
    }
}
