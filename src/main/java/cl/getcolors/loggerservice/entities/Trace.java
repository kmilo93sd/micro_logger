package cl.getcolors.loggerservice.entities;

import javax.persistence.*;

@Entity
public class Trace {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "error")
    private String error;

    @ManyToOne
    @JoinColumn(name="log_id")
    private Log log;

    public Trace(String error, Log log) {
        this.error = error;
        this.log = log;
    }

    public int getId() {
        return id;
    }

    public String getError() {
        return error;
    }

    public Log getLogId() {
        return log;
    }
}
