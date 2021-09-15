package com.vk.api.sdk.objects.callback;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.client.InfoForBots;
import com.vk.api.sdk.objects.messages.Message;
import java.util.Objects;

/**
 * MessageObject object
 */
public class MessageObject implements Validable {
    @SerializedName("client_info")
    private InfoForBots clientInfo;

    @SerializedName("message")
    private Message message;

    public InfoForBots getClientInfo() {
        return clientInfo;
    }

    public MessageObject setClientInfo(InfoForBots clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }

    public Message getMessage() {
        return message;
    }

    public MessageObject setMessage(Message message) {
        this.message = message;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientInfo, message);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MessageObject messageObject = (MessageObject) o;
        return Objects.equals(clientInfo, messageObject.clientInfo) &&
                Objects.equals(message, messageObject.message);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("MessageObject{");
        sb.append("clientInfo=").append(clientInfo);
        sb.append(", message=").append(message);
        sb.append('}');
        return sb.toString();
    }
}