package es.ulpgc.da.appcount;

public class Presenter {
    Model myModel;
    View myView;

       public Presenter(View view) {
        myModel = new Model();
        myView = view;
    }

    public void buttonPlusPressed() {
        myModel.increment();
        myView.setDisplay (myModel.getCounter().toString());
    }

    public void buttonMinusPressed() {
        myModel.decrement();
        myView.setDisplay (myModel.getCounter().toString());
    }

}
