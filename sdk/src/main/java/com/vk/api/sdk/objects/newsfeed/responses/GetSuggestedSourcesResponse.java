package com.vk.api.sdk.objects.newsfeed.responses;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Objects;

/**
 * GetSuggestedSourcesResponse object
 */
public class GetSuggestedSourcesResponse {
    /**
     * Total number
     */
    @SerializedName("count")
    private Integer count;

    @SerializedName("items")
    private List<JsonObject> items;

    public Integer getCount() {
        return count;
    }

    public GetSuggestedSourcesResponse setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<JsonObject> getItems() {
        return items;
    }

    public GetSuggestedSourcesResponse setItems(List<JsonObject> items) {
        this.items = items;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetSuggestedSourcesResponse getSuggestedSourcesResponse = (GetSuggestedSourcesResponse) o;
        return Objects.equals(count, getSuggestedSourcesResponse.count) &&
                Objects.equals(items, getSuggestedSourcesResponse.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetSuggestedSourcesResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
