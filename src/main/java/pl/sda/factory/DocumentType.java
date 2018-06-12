package pl.sda.factory;

public enum DocumentType {
    TXT(".txt"),
    XML(".xml"),
    HTML(".html");

    private String docType;

    public String getDocType() {
        return docType;
    }

    DocumentType(String docType) {
        this.docType = docType;
    }
}
