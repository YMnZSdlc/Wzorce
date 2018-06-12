package pl.sda.factory;


public class DocFactory {


    public Document createDoc(String tekst, DocumentType docType) {
        switch (docType) {
            case TXT:
                return new TxtDocument(tekst, docType);
            case HTML:
                return new HtmlDocument(tekst, docType);
            default:
                return null;
        }
    }

}
