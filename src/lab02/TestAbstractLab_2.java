package lab02;

public class TestAbstractLab_2 {
    public static void main(String[] args) throws Exception {

        LibraryItem[] libraryArray = new LibraryItem[3];

        LibraryItem[] libraryItem = {
            new Book("B001328", "Java OOP", 21),
            new AudioBook("A008661", "Good Programmer Mindset", 14),
            new DVD("D001167", "Mission Impossible: Black Mesa", 7)
        };

        for (int i = 0; i < libraryArray.length; i++) {
            libraryArray[i] = libraryItem[i];
        }

        for (LibraryItem item: libraryArray) {
            System.out.printf("Barcode: %s, Title: %s, Loan Period: %d\n", item.getBarcode(), item.getTitle(), item.getLoanPeriod());
        }

        libraryArray[0].checkout("Rapheephat");
        libraryArray[0].checkout("Samakom"); // Extra

    }
}
