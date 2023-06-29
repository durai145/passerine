package com.heaerie.passerine.service;

import java.time.LocalDate;

public class Search {
    static volatile private int i=0;
    static volatile private int j=0;
    static volatile private int k=0;
    static volatile private int l=0;

     private static synchronized void getNext() throws ExceedIPRange {
        if (l==255) {
            l=0;
            k++;
        }
        if (k == 255) {
            k=0;
            j++;
        }
        if (j == 255) {
            j=0;
            j++;
        }
        if (i == 255) {
            throw new ExceedIPRange(i +"." + j +"." + k + "." + l);
        }
        l++;
    }
    public static void main(String argv []) {
        LocalDate startTime = LocalDate.now();
        for (int c =0; c < 255*255*255*255; c++) {
            try {
                getNext();
                String ip4 = i +"." + j +"." + k + "." + l;
                System.out.println(ip4);
            } catch (ExceedIPRange e) {
                LocalDate endTime = LocalDate.now();
                System.out.println("start=" + startTime + ", endTime=" + endTime );
                e.printStackTrace();
                System.exit(1);
            }
        }

    }
}
