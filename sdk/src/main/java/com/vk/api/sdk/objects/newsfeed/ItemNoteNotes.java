package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Objects;

/**
 * ItemNoteNotes object
 */
public class ItemNoteNotes {
    /**
     * Notes number
     */
    @SerializedName("count")
    private Integer count;

    @SerializedName("items")
    private List<NewsfeedNote> items;

    public Integer getCount() {
        return count;
    }

    public ItemNoteNotes setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<NewsfeedNote> getItems() {
        return items;
    }

    public ItemNoteNotes setItems(List<NewsfeedNote> items) {
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
        ItemNoteNotes itemNoteNotes = (ItemNoteNotes) o;
        return Objects.equals(count, itemNoteNotes.count) &&
                Objects.equals(items, itemNoteNotes.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ItemNoteNotes{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
