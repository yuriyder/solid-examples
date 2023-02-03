/* *
 * "Entities should be open for extension, but closed for modification."
 * */
package principle.open.closed.v1.incorrect;

public class IncorrectMain {
    public static void main(String[] args) {
        workInTaxi(new Toyota());
        workInTaxi(new Celica());
    }

    // так делать нельзя - нужно будет каждый раз изменять логику метода
    static void workInTaxi(Toyota toyota) {
        if (toyota instanceof Celica) {
            ((Celica) toyota).getPassenger();
        } else {
            toyota.getPassengers();
        }
    }
}

class Toyota {
    // 4 пассажира
    void getPassengers() {
        System.out.println("Take 4 passengers");
    }
}


class Celica extends Toyota {
    // 1 пассажир
    void getPassenger() {
        System.out.println("Take 1 passenger");
    }
}
