package m2.l3;

public class ClientClass {
    static void main() {
        try (final ExternalClient server = getServer()) {
            server.method4();
            server.method5();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static ExternalClient getServer() {
        return new Server();
    }
}
