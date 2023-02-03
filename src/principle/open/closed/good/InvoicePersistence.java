package principle.open.closed.good;

import principle.open.closed.Invoice;

interface InvoicePersistence {

    public void save(Invoice invoice);
}