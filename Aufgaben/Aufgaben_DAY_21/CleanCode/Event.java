import java.util.*;

public class Event {
    private String name;
    private Date date;
    private String location;
    private int maxParticipants;
    private ArrayList<Participant> participants = new ArrayList<>();

    public Event(String name, Date date, String location, int maxParticipants) {
        this.name = name;
        this.date = date;
        this.location = location;
        this.maxParticipants = maxParticipants;
    }

    public ArrayList<Participant> getParticipants() {
        return participants;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getMaxParticipants() {
        return maxParticipants;
    }

    public Date getDate() {
        return date;
    }

    public void removeParticipant(String email) {
        for (Participant participant : participants) {
            if (participant.getEmail().equals(email)) {
                participants.remove(participant);
                break;
            }
        }
    }

    public void displayParticipants() {
        for (Participant participant : participants) {
            System.out.println(participant);
        }
    }

    @Override
    public String toString() {
        return "Event: " + this.name + ", Ort: " + this.location;
    }

}