public class EventPost extends Post {
    private String eventType;

    public EventPost(String author, String eventType) {
        super(author);
        this.eventType = eventType;
    }

    public String getEventType() {
        return eventType;
    }

    public void display()
    {
        System.out.println(eventType);
    }
}