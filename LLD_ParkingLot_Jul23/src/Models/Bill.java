package Models;

import java.util.Date;
import java.util.List;

public class Bill extends BaseEntity {
    private Ticket ticket;
    private Date exitTime;
    private int amount;
    private Operator operator;
    private Gate gate;
    private List<Payment> payments;
    private BillStatus billStatus;
}
