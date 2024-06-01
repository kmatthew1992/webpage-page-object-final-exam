package eu.michaelclement.page;

public enum CountryOption {
    HUNGARY("Hungary"),
    AUSTRIA("Austria"),
    SLOVAKIA("Slovakia"),
    CROATIA("Croatia");
    private final String value;

    CountryOption(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
