package task4;

public class ExpertDocumentWorker extends ProDocumentWorker  {

    @Override
    public void Document() {
        super.Document();
    }

    @Override
    public void editDocument() {
        super.editDocument();
    }

    @Override
    public void saveDocument() {
        System.out.println("Документ сохранен в новом формате");
    }
}
