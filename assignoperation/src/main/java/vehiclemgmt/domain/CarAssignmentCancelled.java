package vehiclemgmt.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import vehiclemgmt.domain.*;
import vehiclemgmt.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class CarAssignmentCancelled extends AbstractEvent {

    private Long id;
    private String cancellationReason;

    public CarAssignmentCancelled(CarAssignment aggregate) {
        super(aggregate);
    }

    public CarAssignmentCancelled() {
        super();
    }
}
//>>> DDD / Domain Event