package cl.getcolors.loggerservice.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document(collection = "logs")
public class Log {

    @Id
    private String id;

    private String service;

    private String serviceId;

    private String ocurredOn;

    private String error;

    private int errorCode;

    private ArrayList<String> trace;

    public Log(
            String id,
            String service,
            String serviceId,
            String ocurredOn,
            String error,
            int errorCode,
            ArrayList<String> trace
    ) {
        this.id = id;
        this.service = service;
        this.serviceId = serviceId;
        this.ocurredOn = ocurredOn;
        this.error = error;
        this.errorCode = errorCode;
        this.trace = trace;
    }

    public String getId() {
        return id;
    }

    public String getService() {
        return service;
    }

    public String getServiceId() {
        return serviceId;
    }

    public String getOcurredOn() {
        return ocurredOn;
    }

    public String getError() {
        return error;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public ArrayList<String> getTrace() {
        return trace;
    }
}
