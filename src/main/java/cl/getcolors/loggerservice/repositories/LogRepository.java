package cl.getcolors.loggerservice.repositories;

import cl.getcolors.loggerservice.entities.Log;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LogRepository extends MongoRepository<Log, String> {

    Log findByServiceId(String serviceId);
}
