package id.co.buniismail.buniismail_1611511138;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements View.OnClickListener {
    EditText vTxtA, vTxtB, vTxtC;

    protected Float yTxtA, yTxtB, yTxtC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Float();

        vTxtA = (EditText) findViewById(R.id.txtA);
        vTxtB = (EditText) findViewById(R.id.txtB);
        vTxtC = (EditText) findViewById(R.id.txtC);
    }

    private void Float() {
        Button vBtnTambah = (Button) findViewById(R.id.btnTambah);
        Button vBtnKurang = (Button) findViewById(R.id.btnKurang);
        Button vBtnKali = (Button) findViewById(R.id.btnKali);
        Button vBtnBagi = (Button) findViewById(R.id.btnBagi);
        Button vBtnExit = (Button) findViewById(R.id.btnExit);

        vBtnTambah.setOnClickListener(this);
        vBtnKurang.setOnClickListener(this);
        vBtnKali.setOnClickListener(this);
        vBtnBagi.setOnClickListener(this);
        vBtnExit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        yTxtA = Float.parseFloat(vTxtA.getText().toString());
        yTxtB = Float.parseFloat(vTxtB.getText().toString());

        switch (v.getId()) {
            //Tambah
            case R.id.btnTambah:
                yTxtC = yTxtA + yTxtB;

                vTxtC.setText(Float.toString(yTxtC));
                break;

            //Kurang
            case R.id.btnKurang:
                yTxtC = yTxtA - yTxtB;

                vTxtC.setText(Float.toString(yTxtC));
                break;

            //Kali
            case R.id.btnKali:
                yTxtC = yTxtA * yTxtB;

                vTxtC.setText(Float.toString(yTxtC));
                break;

            //Bagi
            case R.id.btnBagi:
                yTxtC = yTxtA / yTxtB;

                vTxtC.setText(Float.toString(yTxtC));
                break;

            //Exit
            case R.id.btnExit:
                finish();
                System.exit(0);
                break;
        }
    }

}