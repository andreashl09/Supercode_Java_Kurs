import java.util.*;

public class EventManagementSystem {

    private List<Event> events = new ArrayList<>();
    private List<Participant> participants = new ArrayList<>();

    public void addEvent(String name, Date date, String location, int maxParticipants) {
        Event event = new Event(name, date, location, maxParticipants);
        events.add(event);
    }

    public void removeEvent(String name) {
        for (Event event : events) {
            if (event.getName().equals(name)) {
                events.remove(event);
                break;
            }
        }
    }

    public void registerParticipantToEvent(String eventName, String participantEmail) {
        Event event = null;
        for (Event e : events) {
            if (e.getName().equals(eventName)) {
                event = e;
                break;
            }
        }
        
        Participant participant = null;
        for (Participant p : participants) {
            if (p.getEmail().equals(participantEmail)) {
                participant = p;
                break;
            }
        }

        if (event != null && participant != null) {
            if (event.getParticipants().size() < event.getMaxParticipants()) {
                event.getParticipants().add(participant);
            } else {
                System.out.println("Maximale Teilnehmerzahl erreicht");
            }
        }
    }

    public void addParticipant(String firstName, String lastName, String email) {
        this.participants.add(new Participant(firstName, lastName, email));
    }

    public void unregisterParticipantFromEvent(String eventName, String participantEmail) {
        Event event = null;
        for (Event e : events) {
            if (e.getName().equals(eventName)) {
                event = e;
                break;
            }
        }

        if (event != null) {
            for (Participant p : event.getParticipants()) {
                if (p.getEmail().equals(participantEmail)) {
                    event.getParticipants().remove(p);
                    break;
                }
            }
        }
    }

    public void displayEvents() {
        for (Event event : events) {
            System.out.println(event);
            event.displayParticipants();
        }
    }

    public static void main(String[] args) {
        EventManagementSystem system = new EventManagementSystem();
        system.addEvent("Java-Konferenz", new Date(), "Berlin", 100);
        system.addParticipant("Max", "Mustermann", "max@example.com");
        system.registerParticipantToEvent("Java-Konferenz", "max@example.com");
        system.displayEvents();
    }
}
