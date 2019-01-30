/**
 * The Student class has all the grades stored in it as variables.
 * Each time a new row is made, a new student class is instantiated
 * Finally, the class needs to use SimpleIntegerProperty so that it is sensible to the changes
 * that can be done on the table
 */
package GUI;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Student {

    private SimpleStringProperty name;

    private SimpleIntegerProperty hw1;
    private SimpleIntegerProperty hw2;
    private SimpleIntegerProperty hw3;
    private SimpleIntegerProperty hw4;
    private SimpleIntegerProperty hwavg;

    private SimpleIntegerProperty pr1;
    private SimpleIntegerProperty pr2;
    private SimpleIntegerProperty pravg;

    private SimpleIntegerProperty fpr;
    private SimpleIntegerProperty fex;
    private SimpleIntegerProperty favg;

    public Student(String name, Integer hw1, Integer hw2, Integer hw3, Integer hw4, Integer hwavg, Integer pr1, Integer pr2, Integer pravg, Integer fpr, Integer fex, Integer favg) {
        this.name = new SimpleStringProperty(name);
        this.hw1 = new SimpleIntegerProperty(hw1);
        this.hw2 = new SimpleIntegerProperty(hw2);
        this.hw3 = new SimpleIntegerProperty(hw3);
        this.hw4 = new SimpleIntegerProperty(hw4);
        this.hwavg = new SimpleIntegerProperty(hwavg);
        this.pr1 = new SimpleIntegerProperty(pr1);
        this.pr2 = new SimpleIntegerProperty(pr2);
        this.pravg = new SimpleIntegerProperty(pravg);
        this.fpr = new SimpleIntegerProperty(fpr);
        this.fex = new SimpleIntegerProperty(fex);
        this.favg = new SimpleIntegerProperty(favg);
    }


    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name = new SimpleStringProperty(name);
    }

    public int getHw1() {
        return hw1.get();
    }

    public void setHw1(int hw1) {
        this.hw1 = new SimpleIntegerProperty(hw1);
    }

    public int getHw2() {
        return hw2.get();
    }

    public void setHw2(int hw2) {
        this.hw2 = new SimpleIntegerProperty(hw2);
    }

    public int getHw3() {
        return hw3.get();
    }

    public void setHw3(int hw3) {
        this.hw3 = new SimpleIntegerProperty(hw3);
    }

    public int getHw4() {
        return hw4.get();
    }

    public void setHw4(int hw4) {
        this.hw4 = new SimpleIntegerProperty(hw4);
    }

    public int getHwavg() {
        return hwavg.get();
    }

    public void setHwavg(int hwavg) {
        this.hwavg = new SimpleIntegerProperty(hwavg);
    }

    public int getPr1() {
        return pr1.get();
    }

    public void setPr1(int pr1) {
        this.pr1 = new SimpleIntegerProperty(pr1);
    }

    public int getPr2() {
        return pr2.get();
    }

    public void setPr2(int pr2) {
        this.pr2 = new SimpleIntegerProperty(pr2);
    }

    public int getPravg() {
        return pravg.get();
    }

    public void setPravg(int pravg) {
        this.pravg = new SimpleIntegerProperty(pravg);
    }

    public int getFpr() {
        return fpr.get();
    }

    public void setFpr(int fpr) {
        this.fpr = new SimpleIntegerProperty(fpr);
    }

    public int getFex() {
        return fex.get();
    }

    public void setFex(int fex) {
        this.fex = new SimpleIntegerProperty(fex);
    }

    public int getFavg() {
        return favg.get();
    }

    public void setFavg(int favg) {
        this.favg = new SimpleIntegerProperty(favg);
    }
}

