package com.Section7_OOP_Part_2;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.duplex = duplex;
        this.pagesPrinted = 0;
        if(tonerLevel < 0 || tonerLevel > 100) {
            this.tonerLevel = -1;
        }else {
            this.tonerLevel = tonerLevel;
        }
    }

    public int getPagesPrinted() {
        return this.pagesPrinted;
    }

    public int addToner(int tonerAmount){
        if (tonerAmount > 0 && tonerAmount <= 100 ){
            if (this.tonerLevel + tonerAmount > 100){
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        }else {
            return -1;
        }
    }

    public int printPages(int pagesToPrint) {

        if (this.duplex) {
            pagesToPrint = (pagesToPrint / 2 + pagesToPrint % 2);
        }
        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }
}
