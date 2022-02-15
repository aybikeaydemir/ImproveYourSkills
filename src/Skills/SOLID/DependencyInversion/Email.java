package Skills.SOLID.DependencyInversion;

public class Email implements Message {

    @Override
    public void sendMessage() {
        sendEmail();
    }

    private void sendEmail() {
        //Send email
    }
}