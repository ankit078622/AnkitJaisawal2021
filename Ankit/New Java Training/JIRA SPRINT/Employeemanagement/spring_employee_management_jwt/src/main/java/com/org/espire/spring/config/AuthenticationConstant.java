package com.org.espire.spring.config;

public class AuthenticationConstant {

	public static final String SECRET = "key";
    public static final long EXPIRATION_TIME = 864000000; // 10 days
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final String SIGN_UP_URL = "/api/user";
    public static final String SIGN_UP_TEST_URL = "/api/user/test";
}
