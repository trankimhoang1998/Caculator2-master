package com.example.pc.caculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText editNumber;
    private TextView tv_result;

    private Button btnNumber1;
    private Button btnNumber2;
    private Button btnNumber3;
    private Button btnNumber4;
    private Button btnNumber5;
    private Button btnNumber6;
    private Button btnNumber7;
    private Button btnNumber8;
    private Button btnNumber9;
    private Button btnNumber0;


    private Button btnCong;
    private Button btnTru;
    private Button btnNhan;
    private Button btnChia;


    private Button btnPonit;
    private Button btnResult;
    private Button btnClear;
    private Button btnClearALL;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidget();
        setEventClickViews();
    }
    public void initWidget(){
        editNumber= (EditText)findViewById(R.id.edit_input);
        tv_result= (TextView)findViewById(R.id.tv_result);




        btnNumber1 = (Button)findViewById(R.id.btnNumber1);
        btnNumber2 = (Button)findViewById(R.id.btnNumber2);
        btnNumber3 = (Button)findViewById(R.id.btnNumber3);
        btnNumber4 = (Button)findViewById(R.id.btnNumber4);
        btnNumber5 = (Button)findViewById(R.id.btnNumber5);
        btnNumber6 = (Button)findViewById(R.id.btnNumber6);
        btnNumber7 = (Button)findViewById(R.id.btnNumber7);
        btnNumber8 = (Button)findViewById(R.id.btnNumber8);
        btnNumber9 = (Button)findViewById(R.id.btnNumber9);
        btnNumber0 = (Button)findViewById(R.id.btnNumber0);

        btnCong=(Button)findViewById(R.id.btnCong);
        btnTru=(Button)findViewById(R.id.btnTru);
        btnNhan=(Button)findViewById(R.id.btnNhan);
        btnChia=(Button)findViewById(R.id.btnChia);

        btnPonit=(Button)findViewById(R.id.btnPonit);
        btnClear=(Button)findViewById(R.id.btnClear);
        btnClearALL=(Button)findViewById(R.id.btnClearALL);
        btnResult=(Button)findViewById(R.id.btnResult);


    }
    public void setEventClickViews(){
        btnNumber1.setOnClickListener(this);
        btnNumber2.setOnClickListener(this);
        btnNumber3.setOnClickListener(this);
        btnNumber4.setOnClickListener(this);
        btnNumber5.setOnClickListener(this);
        btnNumber6.setOnClickListener(this);
        btnNumber7.setOnClickListener(this);
        btnNumber8.setOnClickListener(this);
        btnNumber9.setOnClickListener(this);
        btnNumber0.setOnClickListener(this);

        btnCong.setOnClickListener(this);
        btnTru.setOnClickListener(this);
        btnNhan.setOnClickListener(this);
        btnChia.setOnClickListener(this);

        btnPonit.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        btnClearALL.setOnClickListener(this);
        btnResult.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnNumber0:
                // to do
                editNumber.append("0");
                break;
            case R.id.btnNumber1:
                // to do
                editNumber.append("1");
                break;
            case R.id.btnNumber2:
                // to do
                editNumber.append("2");
                break;
            case R.id.btnNumber3:
                // to do
                editNumber.append("3");
                break;
            case R.id.btnNumber4:
                // to do
                editNumber.append("4");
                break;
            case R.id.btnNumber5:
                // to do
                editNumber.append("5");
                break;
            case R.id.btnNumber6:
                // to do
                editNumber.append("6");
                break;
            case R.id.btnNumber7:
                // to do
                editNumber.append("7");
                break;
            case R.id.btnNumber8:
                // to do
                editNumber.append("8");
                break;
            case R.id.btnNumber9:
                // to do
                editNumber.append("9");
                break;
            case R.id.btnCong:
                // to do
                editNumber.append("+");
                break;
            case R.id.btnTru:
                // to do
                editNumber.append("-");
                break;
            case R.id.btnNhan:
                // to do
                editNumber.append("*");
                break;
            case R.id.btnChia:
                // to do
                editNumber.append("/");
                break;
            case R.id.btnPonit:
                // to do
                editNumber.append(".");
                break;
            case R.id.btnClear:
                // to do
                BaseInputConnection textFieldInputConnection = new BaseInputConnection(editNumber, true);
                textFieldInputConnection.sendKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN,KeyEvent.KEYCODE_DEL));
                break;
            case R.id.btnClearALL:
                // to do
                editNumber.setText("");
                break;
            case R.id.btnResult:
                // to do
                String numberA = String.valueOf(editNumber.getText());
                break;
            default:

                break;


        }

    }
}
