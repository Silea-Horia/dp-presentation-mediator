package good;

public interface Mediator {
    void notify(Colleague sender, Event event);
}
