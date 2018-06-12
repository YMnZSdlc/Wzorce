package pl.sda.factory;

public class HtmlDocument extends Document{

    public HtmlDocument(String txtToSave, DocumentType docType) {
        super(preparHtml(txtToSave), docType);
    }

    private static String preparHtml(String txtToSave) {
        String result = txtToSave
                .replaceAll("\n", "<br>");
        return "<h1>" + result + "</h1>";
    }


}
