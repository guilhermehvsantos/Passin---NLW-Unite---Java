package guilhermehvs.passin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import guilhermehvs.passin.domain.event.Event;

public interface EventRepository extends JpaRepository<Event, String> {

}
