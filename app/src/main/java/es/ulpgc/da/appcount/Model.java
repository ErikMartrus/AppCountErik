package es.ulpgc.da.appcount;

public class Model {
    private Integer counter;

    public Model() {
        counter=0;
    }

    public Integer getCounter() {
        return counter;
    }

    public void increment() {
        this.counter++;
    }

    public void decrement() {
        this.counter--;
    }

}
