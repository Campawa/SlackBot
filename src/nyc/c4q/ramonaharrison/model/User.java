package nyc.c4q.ramonaharrison.model;

import org.json.simple.JSONObject;
import sun.java2d.cmm.Profile;

/**
 * Created by Ramona Harrison
 * on 8/26/16
 *
 * A class representing a user.
 * See https://api.slack.com/types/user
 *
 */

public class User {


    private String id;
    // "id"
    private String name;
    // "name"
    private boolean deleted;
    // "deleted"
    private String color;
    // "color"
    private Profile profile;
    // "profile"
    private boolean is_admin;
    // "is_admin"
    private boolean is_owner;
    // "is_owner"
    private boolean is_primary_owner;
    // "is_primary_owner"
    private boolean is_resticated;
    // "is_restricted"
    private boolean is_ultra_restricated;
    // "is_ultra_restricted"
    private boolean has_2fa;
    // "has_2fa"
    private boolean has_factor_type;
    // "two_factor_type"
    private boolean has_files;
    // "has_files"

    public User(JSONObject json) {

        if (json.get("id") != null) {
            this.id = (String) json.get("id");
        }

    if (json.get("name") != null) {
        this.name = (String) json.get("name");
    }
    if (json.get("deleted") != null) {
            this.deleted= (Boolean) json.get("deleted");
        }

     if (json.get("color") != null) {
        this.id = (String) json.get("color");
    }

    if (json.get("profile") != null) {
        this.profile = (Profile) json.get("profile");
    }
    if (json.get("deleted") != null) {
        this.is_admin = (boolean) json.get("deleted");
    }
        if (json.get("is_owner") != null) {
            this.is_owner = (boolean) json.get("is_owner");
        }
        if (json.get("is_primary_owner") != null) {
            this.is_primary_owner = (boolean) json.get("is_primary_owner");
        }
        if (json.get("is_resticated") != null) {
            this.is_resticated= (boolean) json.get("is_resticated");
        }
        if (json.get("is_ultra_restricated") != null) {
            this.is_ultra_restricated= (boolean) json.get("is_ultra_restricated");
        }
        if (json.get("has_2fa") != null) {
            this.has_2fa= (boolean) json.get("has_2fa");
        }
        if (json.get("has_factor_type") != null) {
            this.has_factor_type= (boolean) json.get("has_factor_type");
        }
        if (json.get("has_files") != null) {
            this.has_files= (boolean) json.get("has_files");
        }

}


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isDeleted() {
        return deleted;
    }
    public String getColor() {
        return color;
    }
    public Profile profile() {
        return profile;
    }
    public boolean isIs_admin() {
        return is_admin;
    }
    public boolean isIs_owner() {
        return is_owner;
    }
    public boolean isIs_primary_owner() {
        return is_primary_owner;
    }
    public boolean isIs_resticated() {
        return is_resticated;
    }
    public boolean isIs_ultra_restricated() {
        return is_ultra_restricated;
    }
    public boolean getHas_2fa() {
        return has_2fa;
    }
    public boolean isHas_factor_type() {
        return has_factor_type;
    }
    public boolean isHas_files() {
        return has_files;
    }



}
