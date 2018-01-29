package br.com.access.security;

public class AuthenticationConstants {
	
	// EXPIRATION_TIME = 10 dias
	static final long EXPIRATION_TIME = 860_000_000;
	static final String SECRET = "MySecret";
	static final String TOKEN_PREFIX = "Bearer";
	static final String SIGN_UP_URL = "/users";
	static final String HEADER_STRING = "Authorization";
	
}