package principle.open.closed.good;

import principle.open.closed.Invoice;

public class DatabasePersistence implements InvoicePersistence {

    @Override
    public void save(Invoice invoice) {
        // Save to DB
    }
}