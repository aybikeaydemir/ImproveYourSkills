package Skills.SOLID.DependencyInversion;

import java.util.List;

public class Notification {
/*
Sınıflar arası bağımlılıklar olabildiğince az
olmalıdır özellikle üst seviye sınıflar
alt seviye sınıflara bağımlı olmamalıdır.
 */
    private List<Message> messages;

    public Notification(List<Message> messages) {
        this.messages = messages;
    }

    public void sender() {
        for (Message message : messages) {
            message.sendMessage();
        }
    }
}