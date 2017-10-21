package nyc.c4q.ramonaharrison;

import nyc.c4q.ramonaharrison.model.Channel;
import nyc.c4q.ramonaharrison.model.Message;
import nyc.c4q.ramonaharrison.network.*;
import nyc.c4q.ramonaharrison.network.response.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ramona Harrison
 * on 8/26/16
 *
 */

public class Bot {
    // TODO: implement your bot logic!

    public Bot() {

    }



    /**
     * Sample method: tests the Slack API. Prints a message indicating success or failure.
     */
    public void testApi() {
        Response apiTest = Slack.testApi();
        System.out.println("API OK: " +apiTest.isOk() + "\n");
    }

    /**
     * Sample method: prints all public AccessCode3-3 channel names and ids. Prints an error message on failure.
     */
    public void listChannels() {
        ListChannelsResponse listChannelsResponse = Slack.listChannels();

        if (listChannelsResponse.isOk()) {
            List<Channel> channels = listChannelsResponse.getChannels();

            System.out.println("\nChannels: ");
            for (Channel channel : channels) {
                System.out.println("name: " + channel.getName() + ", id:" + channel.getId());
            }
        } else {
            System.err.print("Error listing channels: " + listChannelsResponse.getError());
        }
    }

    /**
     * Sample method: prints up to the last 100 messages from a given channel. Prints an error message on failure.
     * or failure.
     *
     * @param channelId id of the given channel.
     */
    public void listMessages(String channelId) {
        ListMessagesResponse listMessagesResponse = Slack.listMessages(channelId);

        if (listMessagesResponse.isOk()) {
            List<Message> messages = listMessagesResponse.getMessages();

            for (Message message : messages) {

                if (message.getText().contains("Hi ")) {
                    sendMessageToBotsChannel("How are you ?");
                } else if (message.getText().contains("how are you")) {
                    int decider = (int) (Math.random() * 2 + 1);
                    if (decider == 1) {
                        sendMessageToBotsChannel("I'm doing well, thanks");
                    } else if (decider == 2) {
                        sendMessageToBotsChannel("Not too bad");
                    }
                    else if (message.getText().contains("fuck")){
                        int ranNumber = (int) (Math.random() * 3 + 1);
                        if (ranNumber == 1) {
                            sendMessageToBotsChannel("eveything will be okay! ");
                        } else if (ranNumber == 2) {
                            sendMessageToBotsChannel("No fuck you man !");
                        } else if (ranNumber == 3) {
                            sendMessageToBotsChannel(" I will try to be calm towards you !");
                        }

                    }
                    ArrayList<String> words=new ArrayList<>();


                } else if (message.getText().contains("sorry")){
                    int ranNumber = (int) (Math.random() * 3 + 1);
                    if (ranNumber == 1) {
                        sendMessageToBotsChannel("what are you trying to say ? ");
                    } else if (ranNumber == 2) {
                        sendMessageToBotsChannel("say it again!");
                    } else if (ranNumber == 3) {
                        sendMessageToBotsChannel("Huh ?????");
                    }
                }




            }
        } else {
            System.err.print("Error listing messages: " + listMessagesResponse.getError());
        }
    }

    /**
     * Sample method: sends a plain text message to the #bots channel. Prints a message indicating success or failure.
     *
     * @param text message text.
     */
    public void sendMessageToBotsChannel(String text) {
        SendMessageResponse sendMessageResponse = Slack.sendMessage(text);

        if (sendMessageResponse.isOk()) {
            System.out.println("Message sent successfully!");
        } else {
            System.err.print("Error sending message: " + sendMessageResponse.getError());
        }
    }

    /**
     * Sample method: deletes a message from the #bots channel. Prints a message indicating success or failure.
     *
     * @param messageTs unique timestamp of the message to be deleted.
     */
    public void deleteMessageInBotsChannel(String messageTs) {
        DeleteMessageResponse deleteMessageResponse = Slack.deleteMessage(messageTs);

        if (deleteMessageResponse.isOk()) {
            System.out.println("Message deleted successfully!");
        } else {
            System.err.print("Error sending message: " + deleteMessageResponse.getError());
        }
    }
}
