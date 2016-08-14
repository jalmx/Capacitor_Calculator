/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;

/**
 *
 * @author JOSEF
 */
public class CapacitorValue extends CapCeramic implements ValueSc {

    /**
     * Esta la lista de los capacitores almacenadas en el arratlist
     */
    private SeekValueCapArray valueCapArray;
    /**
     * retorno el valor del capacitor, numero comercial
     */
    private int valueCap;

    /**
     * contructor vacio
     */
    public CapacitorValue() {
    }

    /**
     * inicializo el constructor con el valor comercial para calcular sus
     * valores en faradios
     *
     * @param valueCap valor impreso en el cuerpo del capacitor
     */
    public CapacitorValue(int valueCap) {
        super(valueCap);
        valueCapArray = new SeekValueCapArray(valueCap);
        this.valueCap = valueCapArray.getValueCap();
    }

    /**
     * @return el valor del capacitor, numero comercial
     */
    @Override
    public int getValueCap() {
        return this.valueCap;
    }

    /**
     * @param valueCap asigno el valor comercial del capacitor
     */
    @Override
    public void setValueCap(int valueCap) {
        valueCapArray = new SeekValueCapArray(valueCap);
        this.valueCap = valueCapArray.getValueCap();
    }

    /**
     * @return el valor en picoFaradios
     */
    @Override
    public long getpF() {
        return vpF();
    }

    /**
     *
     * @return el valor en microfaradios
     */
    @Override
    public double getuF() {
        if (this.getpF() != -1) {
            return this.getpF() * UICRO;
        } else {
            return -1;
        }
    }

    /**
     * @return el valor en nano faradios
     */
    @Override
    public double getnF() {
        if (this.getpF() != -1) {

            return (this.getpF() / NANO) * PICO;
        } else {
            return -1;
        }
    }

    /**
     * retorno el valor base, el cual esta en pico faradios
     */
    private Integer vpF() {
        int g = this.getValueCap();

        if (g == 1 || g == 10 || g == 47) {
            switch (g) {
                case 1:
                    g = 1;
                    break;
                case 10:
                    g = 10;
                    break;
                case 47:
                    g = 47;
                    break;
            }
        } else {
            try {
                g = Integer.parseInt(String.valueOf(g).substring(0, 2));
                char[] v = String.valueOf(getValueCap()).toCharArray();

                switch (v[2]) {//jalo el tercer valor o token de referencia para el multiplo
                    case '0':
                        g *= 10;
                        break;
                    case '2':
                        g *= 100;
                        break;
                    case '3':
                        g *= KILO;
                        break;
                    case '4':
                        g *= 10000;
                        break;
                    case '5':
                        g *= 100000.0;
                        break;
                    default:
                        g = -1;
                }
            } catch (Exception e) {
                g = -1;
            }
        }
        return g;
    }

    public Integer getMultiplicador() {
        int g = this.getValueCap();

        if (g == 1 || g == 10 || g == 47) {
            switch (g) {
                case 1:
                    g = 1;
                    break;
            }
        } else {
            try {
                char[] v = String.valueOf(getValueCap()).toCharArray();

                switch (v[2]) {//jalo el tercer valor o token de referencia para el multiplo
                    case '0':
                        g = 0;
                        break;
                    case '2':
                        g = 2;
                        break;
                    case '3':
                        g = 3;
                        break;
                    case '4':
                        g = 4;
                        break;
                    case '5':
                        g = 5;
                        break;
                    default:
                        g = -1;
                }
            } catch (Exception e) {
                g = -1;
            }
        }
        return g;
    }

    @Override
    public String toString() {
        return "CapacitorValue{" + "valueCapArray=" + valueCapArray + ", valueCap=" + valueCap + '}';
    }

}
