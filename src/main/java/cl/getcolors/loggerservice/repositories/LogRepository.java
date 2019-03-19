package cl.getcolors.loggerservice.repositories;

import cl.getcolors.loggerservice.entities.Log;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface LogRepository extends JpaRepository<Log, String> {

    List<Log> findAllByServiceId(String serviceId);
}
