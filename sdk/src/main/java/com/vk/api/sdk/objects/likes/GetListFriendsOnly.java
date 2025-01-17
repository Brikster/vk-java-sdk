// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.likes;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Specifies which users are returned: '1' — to return only the current user's friends, '0' — to return all users (default)
 */
public enum GetListFriendsOnly implements EnumParam {
    @SerializedName("0")
    _0(0),

    @SerializedName("1")
    _1(1),

    @SerializedName("2")
    _2(2),

    @SerializedName("3")
    _3(3);

    private final Integer value;

    GetListFriendsOnly(Integer value) {
        this.value = value;
    }

    public String getValue() {
        return value.toString();
    }

    @Override
    public String toString() {
        return value.toString().toLowerCase();
    }
}
