package guilhermehvs.passin.domain.event.exceptions;

public class EventFullException extends RuntimeException {
    public EventFullException(String message) {
        super(message);
    }
}
