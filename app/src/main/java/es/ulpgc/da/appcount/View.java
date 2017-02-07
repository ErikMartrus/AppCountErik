package es.ulpgc.da.appcount;

import android.app.Activity;
import android.os.Bundle;

import android.widget.Button;
import android.widget.TextView;

public class View extends Activity {
    private Presenter myPresenter;
    private TextView display;
    private Button buttonPlus;
    private Button buttonMinus;

    public void setDisplay(String text) {
        display.setText(text);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitymain2);

        //  Inicializo los componentes de mi vista
        buttonPlus = (Button) findViewById(R.id.button1);
        buttonMinus = (Button) findViewById(R.id.button2);
        display = (TextView) findViewById(R.id.display);


//  Inicializo el presentador
        myPresenter=new Presenter(this);
        //  Registro los listeners de mis botones
        buttonPlus.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                myPresenter.buttonPlusPressed();
            }
        });

        buttonMinus.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                myPresenter.buttonMinusPressed();
            }
        });

    }
}
