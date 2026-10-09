package m1.l20.menu;

public enum MenuItem {
    SETTINGS( "Settings", "Opening settings..."),
    START_GAME( "Start Game", "Starting a new game..."),
    LOAD_GAME( "Load Game", "Loading a saved game..."),
    CONNECT( "Connect", "Connecting to the server..."),
    EXIT( "Exit", "Exiting the game. Goodbye!");

    private final String description;
    private final String action;
    private String additional;

    MenuItem(String description, String action) {
        this.description = description;
        this.action = action;
    }

    public void setAdditional(final String additional) {
        this.additional = additional;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description + (additional != null ? " - " + additional : "");
    }

    public void executeAction() {
        System.out.println(action);
        if (this == EXIT) {
            System.exit(0);
        }
    }
}
