package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.queries.widgets.WidgetsGetCommentsQuery;
import com.vk.api.sdk.queries.widgets.WidgetsGetPagesQuery;

/**
 * List of Widgets methods
 */
public class Widgets extends AbstractAction {

    /**
     * Constructor
     *
     * @param client vk api client
     * @return query
     */
    public Widgets(VkApiClient client) {
        super(client);
    }

    /**
     * Gets a list of comments for the page added through the Comments widget.
     *
     * @return query
     */
    public WidgetsGetCommentsQuery getComments() {
        return new WidgetsGetCommentsQuery(getClient());
    }

    /**
     * Gets a list of comments for the page added through the Comments widget.
     *
     * @param actor vk actor
     * @return query
     */
    public WidgetsGetCommentsQuery getComments(Actor actor) {
        return new WidgetsGetCommentsQuery(getClient(), actor);
    }

    /**
     * Gets a list of application/site pages where the Like widget is installed.
     *
     * @return query
     */
    public WidgetsGetPagesQuery getPages() {
        return new WidgetsGetPagesQuery(getClient());
    }

    /**
     * Gets a list of application/site pages where the Like widget is installed.
     *
     * @param actor vk actor
     * @return query
     */
    public WidgetsGetPagesQuery getPages(Actor actor) {
        return new WidgetsGetPagesQuery(getClient(), actor);
    }
}
