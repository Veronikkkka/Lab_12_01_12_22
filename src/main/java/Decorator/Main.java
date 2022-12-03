package Decorator;

public class Main {
    public static void main(String[] args) {
        Document document = new SmartDocument("gs://mybucket_27/1.png");
        document = new TimedDocument(document);
        document = new CachedDocument(document);
        System.out.println(document.parse());
    }
}