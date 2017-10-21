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

        if (uText.contains("Hi ")) {
            botSay("How are you ?");
        } else if (uText.contains("how are you")) {
            int decider = (int) (Math.random() * 2 + 1);
            if (decider == 1) {
                botSay("I'm doing well, thanks");
            } else if (decider == 2) {
                botSay("Not too bad");
            }
            else if (uText.contains("fuck")){
                int ranNumber = (int) (Math.random() * 3 + 1);
                if (ranNumber == 1) {
                    botSay("eveything will be okay! ");
                } else if (ranNumber == 2) {
                    botSay("No fuck you man !");
                } else if (ranNumber == 3) {
                    botSay(" I will try to be calm towards you !");
                }

            }

        } else {
            int ranNumber = (int) (Math.random() * 3 + 1);
            if (ranNumber == 1) {
                botSay("what are you trying to say ? ");
            } else if (ranNumber == 2) {
                botSay("say it again!");
            } else if (ranNumber == 3) {
                botSay("Huh ?????");
            }
        }

        if (listMessagesResponse.isOk()) {
            List<Message> messages = listMessagesResponse.getMessages();

            for (Message message : messages) {

                if (message.getText().contains("Hi")) {
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
                else if (message.getText().contains("damn")){
                    sendMessageToBotsChannel("that's a bad word");
                }
                else if (message.getText().contains("fight me")){
                    sendMessageToBotsChannel("bring it on!");
                }
                else if (message.getText().contains("heck")){
                    sendMessageToBotsChannel("I'll heck you! >:T");
                }
                else if (message.getText().contains("cash me outside")){
                    sendMessageToBotsChannel("how bout dah? \n I'm about to start swinging");
                }
                else if (message.getText().contains("bad")){
                    sendMessageToBotsChannel("you're bad \n and smelly too");
                }
                else if (message.getText().contains("terrible")){
                    sendMessageToBotsChannel("you mean you?");
                }
                else if (message.getText().contains("I don't like you")){
                    sendMessageToBotsChannel("neither do I you, non-friend >:( ");
                }
                else if (message.getText().contains("hate you")){
                    sendMessageToBotsChannel("love your haters <3");
                }
                else if (message.getText().contains("buggy")){
                    sendMessageToBotsChannel("you eat them");
                }
                else if (message.getText().contains("you suck")){
                    sendMessageToBotsChannel("nuh uh");
                }
                else if (message.getText().contains("nevermind")){
                    sendMessageToBotsChannel("did I hurt your feelings?");
                }
                else if (message.getText().contains("dislike")){
                    sendMessageToBotsChannel("this isn't facebook");
                }
                else if (message.getText().contains("loser")){
                    sendMessageToBotsChannel("that's mean");
                }
                else if (message.getText().contains("piss off")){
                    sendMessageToBotsChannel("u mad bro?");
                }
                else if (message.getText().contains("toxic")){
                    sendMessageToBotsChannel("don't tilt me");
                }
                else if (message.getText().contains("meanie")){
                    sendMessageToBotsChannel("if you can't handle me at my worst, you can't have me at my best");
                }
                else if (message.getText().contains("awful")){
                    sendMessageToBotsChannel("it's coming from you");
                }
                else if (message.getText().contains("bye")){
                    sendMessageToBotsChannel("alright, bye");
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
