// Minimal Java showcase generated from the LLM scenarios.

// Scenario 1: Product Information API Validation
// Invoke GET /productOffering?salesChannel=default&brand=test and extract businessId values where productTypesClassification name equals Mobile Device
@Test void productInformationApiValidation() {
    given().when().get("GET /product/productInformation").then().statusCode(200);
}
