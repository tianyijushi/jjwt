package io.jsonwebtoken.lang;

/**
 * @since 0.6
 */
public abstract class Arrays {

    public static int length(byte[] bytes) {
        return bytes != null ? bytes.length : 0;
    }
}
