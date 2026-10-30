// Minimal Java showcase generated from the LLM scenarios.

// Scenario 1: Revoked Refresh Token Cannot Be Reused
// Attempt to use the revoked refresh token to call /token/refresh
@Test void revokedRefreshTokenCannotBeReused() {
    given().when().get("POST /token/refresh").then().statusCode(400);
}

// Scenario 2: Introspected Access Token Returns Valid Status
// Call /token/introspect with the captured accessToken
@Test void introspectedAccessTokenReturnsValidStatus() {
    given().when().get("POST /token/introspect").then().statusCode(200);
}
