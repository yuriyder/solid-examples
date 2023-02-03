package principle.open.closed.good;

import principle.open.closed.Invoice;

public class FilePersistence implements InvoicePersistence {

    @Override
    public void save(Invoice invoice) {
        // Save to file
    }
}