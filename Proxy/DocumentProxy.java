class DocumentProxy implements Document {
    private RealDocument realDocument;
    private AuthorizationService authorizationService;

    public DocumentProxy(RealDocument realDocument, AuthorizationService authorizationService) {
        this.realDocument = realDocument;
        this.authorizationService = authorizationService;
    }
    
    

    @Override
    public String getContent() {
        if (authorizationService.isAuthorized()) {
            return realDocument.getContent();
        } else {
            logUnauthorizedAccess();
            return "Access denied.";
        }
    }

    private void logUnauthorizedAccess() {
        System.out.println("Unauthorized access attempt.");
    }
}