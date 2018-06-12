package pl.sda.factory;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Document{
    private String txtToSave;
    private DocumentType docType;

    public Document(String txtToSave, DocumentType docType) {
        this.txtToSave = txtToSave;
        this.docType = docType;
    }

    public void saveFile(){
        String path = "plik" + docType.getDocType();
        System.out.println("Plik został zapisany w " + path);

        File file = new File(path);

        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(txtToSave);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
