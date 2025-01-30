package lab02;

public abstract class LibraryItem {
    abstract public String getBarcode();
    abstract public String getTitle();
    abstract public int getLoanPeriod();
    abstract public void checkout(String borrowerName);
}

class Book extends LibraryItem {
    private String barcode = null;
    private String title = null;
    private int loanPeriod = 21;
    private String borrowerName = null;

    protected Book(String bc, String tt, int lp) {
        this.barcode = bc;
        this.title = tt;
        this.loanPeriod = lp;
    }

    @Override
    public String getBarcode() {
        return barcode;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public int getLoanPeriod() {
        return loanPeriod;
    }

    @Override
    public void checkout(String borrowerName) {
        if (this.borrowerName == null) {
            this.borrowerName = borrowerName;
            System.out.println(this.title + " has been checked out by " + borrowerName + ".");
        } else {
            System.out.println(this.title + " is already checked out by " + this.borrowerName + ".");
        }
    }
}

class AudioBook extends LibraryItem {
    private String barcode = null;
    private String title = null;
    private int loanPeriod = 14;
    private String borrowerName = null;

    protected AudioBook(String bc, String tt, int lp) {
        this.barcode = bc;
        this.title = tt;
        this.loanPeriod = lp;
    }

    @Override
    public String getBarcode() {
        return barcode;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public int getLoanPeriod() {
        return loanPeriod;
    }

    @Override
    public void checkout(String borrowerName) {
        if (this.borrowerName == null) {
            this.borrowerName = borrowerName;
            System.out.println(this.title + " has been checked out by " + borrowerName + ".");
        } else {
            System.out.println(this.title + " is already checked out by " + this.borrowerName + ".");
        }
    }
}

class DVD extends LibraryItem {
    private String barcode = null;
    private String title = null;
    private int loanPeriod = 7;
    private String borrowerName = null;

    protected DVD(String bc, String tt, int lp) {
        this.barcode = bc;
        this.title = tt;
        this.loanPeriod = lp;
    }

    @Override
    public String getBarcode() {
        return barcode;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public int getLoanPeriod() {
        return loanPeriod;
    }

    @Override
    public void checkout(String borrowerName) {
        if (this.borrowerName == null) {
            this.borrowerName = borrowerName;
            System.out.println(this.title + " has been checked out by " + borrowerName + ".");
        } else {
            System.out.println(this.title + " is already checked out by " + this.borrowerName + ".");
        }
    }
}