public class Client {
    public static void main(String[] args) {
        RealDocument realDocument = new RealDocument("Sensitive document content");
        AuthorizationService authorizationService = new AuthorizationService();
        DocumentProxy proxy = new DocumentProxy(realDocument, authorizationService);

        String content = proxy.getContent();
        System.out.println(content);
    }
}