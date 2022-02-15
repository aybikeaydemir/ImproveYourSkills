package Skills.SOLID.DependencyInversion;

public class SMS implements Message {

    @Override
    public void sendMessage() {
        sendSMS();
    }

    private void sendSMS() {
        //Send sms
    }
}