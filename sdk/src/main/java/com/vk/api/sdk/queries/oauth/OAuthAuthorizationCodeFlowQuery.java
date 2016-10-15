package com.vk.api.sdk.queries.oauth;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.objects.AuthResponse;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by tsivarev on 22.07.16.
 */
public class OAuthAuthorizationCodeFlowQuery extends AbstractQueryBuilder<OAuthAuthorizationCodeFlowQuery, AuthResponse> {

    public OAuthAuthorizationCodeFlowQuery(VkApiClient client, String endpoint, Integer clientId, String clientSecret, String redirectUri, String code) {
        super(client, endpoint, "access_token", AuthResponse.class);
        clientId(clientId);
        clientSecret(clientSecret);
        redirectUri(redirectUri);
        code(code);
    }

    public OAuthAuthorizationCodeFlowQuery clientId(Integer value) {
        return unsafeParam("client_id", value);
    }

    public OAuthAuthorizationCodeFlowQuery clientSecret(String value) {
        return unsafeParam("client_secret", value);
    }

    public OAuthAuthorizationCodeFlowQuery redirectUri(String value) {
        return unsafeParam("redirect_uri", value);
    }

    public OAuthAuthorizationCodeFlowQuery code(String value) {
        return unsafeParam("code", value);
    }

    @Override
    protected OAuthAuthorizationCodeFlowQuery getThis() {
        return this;
    }

    @Override
    protected Collection<String> essentialKeys() {
        return Arrays.asList("client_id", "client_secret", "redirect_uri", "code");
    }
}