package com.vk.api.sdk.objects.users;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.base.Sex;
import java.net.URL;
import java.util.Objects;

/**
 * User object
 */
public class User extends UserMin {
    /**
     * User sex
     */
    @SerializedName("sex")
    private Sex sex;

    /**
     * Domain name of the user's page
     */
    @SerializedName("screen_name")
    private String screenName;

    /**
     * URL of square photo of the user with 50 pixels in width
     */
    @SerializedName("photo_50")
    private URL photo50;

    /**
     * URL of square photo of the user with 100 pixels in width
     */
    @SerializedName("photo_100")
    private URL photo100;

    /**
     * Information whether the user is online
     */
    @SerializedName("online")
    private BoolInt online;

    /**
     * Information whether the user is online in mobile site or application
     */
    @SerializedName("online_mobile")
    private BoolInt onlineMobile;

    /**
     * Application ID
     */
    @SerializedName("online_app")
    private Integer onlineApp;

    public Sex getSex() {
        return sex;
    }

    public User setSex(Sex sex) {
        this.sex = sex;
        return this;
    }

    public String getScreenName() {
        return screenName;
    }

    public User setScreenName(String screenName) {
        this.screenName = screenName;
        return this;
    }

    public URL getPhoto50() {
        return photo50;
    }

    public User setPhoto50(URL photo50) {
        this.photo50 = photo50;
        return this;
    }

    public URL getPhoto100() {
        return photo100;
    }

    public User setPhoto100(URL photo100) {
        this.photo100 = photo100;
        return this;
    }

    public boolean isOnline() {
        return online == BoolInt.YES;
    }

    public BoolInt getOnline() {
        return online;
    }

    public boolean isOnlineMobile() {
        return onlineMobile == BoolInt.YES;
    }

    public BoolInt getOnlineMobile() {
        return onlineMobile;
    }

    public Integer getOnlineApp() {
        return onlineApp;
    }

    public User setOnlineApp(Integer onlineApp) {
        this.onlineApp = onlineApp;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(photo100, onlineApp, sex, photo50, online, screenName, onlineMobile);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(photo50, user.photo50) &&
                Objects.equals(screenName, user.screenName) &&
                Objects.equals(onlineMobile, user.onlineMobile) &&
                Objects.equals(sex, user.sex) &&
                Objects.equals(onlineApp, user.onlineApp) &&
                Objects.equals(online, user.online) &&
                Objects.equals(photo100, user.photo100);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("photo50=").append(photo50);
        sb.append(", screenName='").append(screenName).append("'");
        sb.append(", onlineMobile=").append(onlineMobile);
        sb.append(", sex=").append(sex);
        sb.append(", onlineApp=").append(onlineApp);
        sb.append(", online=").append(online);
        sb.append(", photo100=").append(photo100);
        sb.append('}');
        return sb.toString();
    }
}
