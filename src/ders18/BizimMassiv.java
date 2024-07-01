package ders18;

import java.util.Arrays;

public class BizimMassiv<T> {

    private Object[] elements;
    private int index = 0;

    public BizimMassiv(int count){
        elements = new Object[count];
    }





    public void elaveEt(T element){
        if (index == elements.length) {
            Object[] newMassiv = new Object[elements.length+1];//4 elementli massiv
            for (int i = 0; i < elements.length ; i++) {//4cusu nulldu
                newMassiv[i] = elements[i];
                //obyekt heapdedi referensler elaqelenecek
            }

            elements = newMassiv;
            //aracidi menimsedilmelidi referesnler burda elaqelenir yrdeyisme falan olmur
        }

        elements[index++] = element;

        }

    @Override
    public String toString() {
        String result = "[";
        for (int i = 0; i < index - 1 ; i++) {//4cusu nulldu
            result+=elements[i]+ ", ";
            //obyekt heapdedi referensler elaqelenecek
        }
        result+=elements[index - 1] + "]";
        return result;
    }
}


