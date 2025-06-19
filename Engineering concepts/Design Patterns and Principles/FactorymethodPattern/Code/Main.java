

public class Main {
    interface Document {
        void open();
    }

    static class WordDocument implements Document {
        public void open() {
            System.out.println("Opening Word Document");
        }
    }

    static class PdfDocument implements Document {
        public void open() {
            System.out.println("Opening PDF Document");
        }
    }

    static class ExcelDocument implements Document {
        public void open() {
            System.out.println("Opening Excel Document");
        }
    }

    public static void main(String[] args) {
        Document doc1 = new WordDocument();
        Document doc2 = new PdfDocument();
        Document doc3 = new ExcelDocument();

        doc1.open();
        doc2.open();
        doc3.open();
    }
}
