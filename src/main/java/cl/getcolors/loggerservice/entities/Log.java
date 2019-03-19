package cl.getcolors.loggerservice.entities;

import org.hibernate.annotations.GenericGenerator;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import javax.persistence.*;

@Entity
public class Log {

    @Id
    @GeneratedValue( generator = "entityIdGenerator" )
    @GenericGenerator( name = "entityIdGenerator", strategy = "uuid2" )
    @Column( columnDefinition = "uuid", updatable = false )
    private UUID id;

    @Column(name = "service", nullable = false, updatable = false)
    private String service;

    @Column(name = "service_id", nullable = false, updatable = false)
    private UUID serviceId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "occurred_on", nullable = false, updatable = false)
    private Date occurredOn;

    @Column(name = "error", nullable = false, updatable = false)
    private String error;

    @Column(name = "errorCode", nullable = false, updatable = false)
    private int errorCode;

    @OneToMany(targetEntity=Trace.class, mappedBy="log", fetch=FetchType.EAGER)
    private List<Trace> trace;

    public Log(){}

    public Log(
            UUID id,
            String service,
            UUID serviceId,
            Date occurredOn,
            String error,
            int errorCode,
            List<Trace> trace
    ) {
        this.id = id;
        this.service = service;
        this.serviceId = serviceId;
        this.occurredOn = occurredOn;
        this.error = error;
        this.errorCode = errorCode;
        this.trace = trace;
    }

    public UUID getId() {
        return id;
    }

    public String getService() {
        return service;
    }

    public UUID getServiceId() {
        return serviceId;
    }

    public Date getOccurredOn() {
        return occurredOn;
    }

    public String getError() {
        return error;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public List<Trace> getTrace() {
        return trace;
    }
}
