/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;

import java.util.ArrayList;

/**
 *
 * @author JOSEF
 */
public class SeekValueCapArray implements ValueCap {

    private ArrayList<Integer> arrValueCap;
    private int valueCap;

    public SeekValueCapArray() {
    }

    public SeekValueCapArray(int valueCap) {
        this.valueCap = seekCap(valueCap);
    }

    public int getValueCap() {
        return valueCap;
    }

    public void setValueCap(int valueCap) {
        this.valueCap = seekCap(valueCap);
    }

    public ArrayList<Integer> getListCap() {
        arrValueCap = new ArrayList<>();

        arrValueCap.add(C1);
        arrValueCap.add(C10);
        arrValueCap.add(C47);
        arrValueCap.add(C100);
        arrValueCap.add(C470);
        arrValueCap.add(C102);
        arrValueCap.add(C152);
        arrValueCap.add(C182);
        arrValueCap.add(C222);
        arrValueCap.add(C272);
        arrValueCap.add(C332);
        arrValueCap.add(C362);
        arrValueCap.add(C392);
        arrValueCap.add(C432);
        arrValueCap.add(C472);
        arrValueCap.add(C562);
        arrValueCap.add(C682);
        arrValueCap.add(C822);
        arrValueCap.add(C103);
        arrValueCap.add(C153);
        arrValueCap.add(C223);
        arrValueCap.add(C333);
        arrValueCap.add(C393);
        arrValueCap.add(C473);
        arrValueCap.add(C563);
        arrValueCap.add(C583);
        arrValueCap.add(C823);
        arrValueCap.add(C104);
        arrValueCap.add(C154);
        arrValueCap.add(C224);
        arrValueCap.add(C334);
        arrValueCap.add(C474);
        arrValueCap.add(C564);
        arrValueCap.add(C684);
        arrValueCap.add(C824);
        arrValueCap.add(C105);
        arrValueCap.add(C225);

        return arrValueCap;
    }

    private int seekCap(int valueCap) {
        int cap = -1;

        if (getListCap().contains(valueCap)) {
            for (Integer c : getListCap()) {
                cap = c;
                if (cap == valueCap) {
                    break;
                }
            }
        }
        return cap;
    }
}
