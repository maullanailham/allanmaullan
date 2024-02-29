public abstract class User {
    private final String identifier;

    public User(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    public abstract boolean authenticate();
}
