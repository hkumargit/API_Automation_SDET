// Minimal Java showcase generated from the LLM scenarios.

// Scenario 1: Generate and Refresh Access Token
// Generate OTP via POST /generateOTP
@Test void generateAndRefreshAccessToken() {
    given().when().get("POST /token/refresh").then(); // Add assertion from: New access token returned successfully
}

// Scenario 2: Revoke Refresh Token
// Revoke refresh token via POST /token/revoke
@Test void revokeRefreshToken() {
    given().when().get("POST /token/revoke").then().statusCode(400);
}
