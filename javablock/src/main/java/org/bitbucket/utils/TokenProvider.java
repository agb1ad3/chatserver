package org.bitbucket.utils;

import org.bitbucket.payload.Token;

public class TokenProvider {

    public static String encode(Token token) {
        String jsonToken = JsonHelper.toFormat(token).orElse(null);
        //TODO - find encoding
        return jsonToken;
    }

    public static Token decoding(String string) {
        //TODO - find decoding
        return JsonHelper.fromFormat(string, Token.class).orElse(null);
    }

}
