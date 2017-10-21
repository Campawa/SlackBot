package nyc.c4q.ramonaharrison.model;

import org.json.simple.JSONObject;

/**
 * Created by Ramona Harrison
 * on 8/26/16
 *
 * A class representing a message attachment.
 * See https://api.slack.com/docs/message-attachments
 *
 */

public class Attachment {



    private String fallback;
    private String color;
    private String pretext;
    private String author_name;
    private String author_link;
    private String author_icon;
    private String title;
    private String title_link;
    private String text;
    private String fields;
    private String image_url;
    private String thumb_url;
    private String footer;
    private String footer_icon;
    private String ts;


    public Attachment(JSONObject json) {


        if (json.get("fallback") != null) {
            this.fallback = (String) json.get("fallback");
        }

        if (json.get("color") != null) {
            this.fallback = (String) json.get("color");
        }

        if (json.get("pretext") != null) {
            this.fallback = (String) json.get("pretext");
        }

        if (json.get("author_name") != null) {
            this.fallback = (String) json.get("author_name");
        }

        if (json.get("author_link") != null) {
            this.fallback = (String) json.get("author_link");
        }

        if (json.get("author_icon") != null) {
            this.fallback = (String) json.get("author_icon");
        }

        if (json.get("title") != null) {
            this.fallback = (String) json.get("title");
        }

        if (json.get("title_link") != null) {
            this.fallback = (String) json.get("title_link");
        }

        if (json.get("text") != null) {
            this.fallback = (String) json.get("text");
        }

        if (json.get("fields") != null) {
            this.fallback = (String) json.get("fields");
        }

        if (json.get("image_url") != null) {
            this.fallback = (String) json.get("image_url");
        }

        if (json.get("thumb_url") != null) {
            this.fallback = (String) json.get("thumb_url");
        }

        if (json.get("footer") != null) {
            this.fallback = (String) json.get("footer");
        }

        if (json.get("footer_icon") != null) {
            this.fallback = (String) json.get("footer_icon");
        }

        if (json.get("ts") != null) {
            this.fallback = (String) json.get("ts");
        }

    }

    private String getFallback(){
        return this.fallback;
    }

    private String getColor(){
        return this.color;
    }

    private String getPretext(){
        return this.pretext;
    }

    private String getAuthor_name(){
        return this.author_name;
    }

    private String getAuthor_link(){
        return this.author_link;
    }

    private String getAuthor_icon(){
        return this.author_icon;
    }

    private String getTitle(){
        return this.title;
    }

    private String getTitle_link(){
        return this.title_link;
    }

    private String getText(){
        return this.text;
    }

    private String getFields(){
        return this.fields;
    }

    private String getImage_url(){
        return this.image_url;
    }

    private String getThumb_url(){
        return this.thumb_url;
    }

    private String getFooter(){
        return this.footer;
    }

    private String getFooter_icon(){
        return this.footer_icon;
    }

    private String getTs(){
        return this.ts;
    }
}
