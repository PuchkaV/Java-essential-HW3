package task4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key");
        String in = sc.nextLine();

        if(in.equals("pro") ){
            DocumentWorker pro = new ProDocumentWorker();
            pro.Document();
            pro.editDocument();
            pro.saveDocument();
            return;
        }
        if(in.equals("exp")){
            DocumentWorker exp = new ExpertDocumentWorker();
            exp.Document();
            exp.editDocument();
            exp.saveDocument();
        }
        else {
            DocumentWorker trial = new DocumentWorker();
            trial.Document();
            trial.editDocument();
            trial.saveDocument();
        }
    }
}
