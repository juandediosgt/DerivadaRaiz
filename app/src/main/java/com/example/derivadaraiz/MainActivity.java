package com.example.derivadaraiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.security.PrivateKey;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView lblOp;
    private TextView lblExponente;
    private TextView lblExponente2;
    private String contenido;
    private int signos = 0; //Determina que operacion se esta usando
    private int espacio = 0;
    private int llenaEspacio = 0;
    private int xraiz = 0;
    private boolean exp = false;
    private Button btnborrartodo;
    private Button btnborrar;
    private Button btndiv;
    private Button btnparentesis1;
    private Button btnparentesis2;
    private Button btnmenos;
    private Button btnmas;
    private Button btnigual;
    private Button btnexponente;
    private Button btnraiz;

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //________CONVERTIMOS EN VARIABLES__________________
        lblOp = (TextView) findViewById(R.id.lblOperacion);
        lblExponente = (TextView) findViewById(R.id.lblExponente);
        lblExponente2 = (TextView) findViewById(R.id.lblExponente2);
        btnborrartodo = (Button) findViewById(R.id.btnborrartodo);
        btnborrar = (Button) findViewById(R.id.btnborrar);
        btndiv = (Button) findViewById(R.id.btndiv);
        btnparentesis1 = (Button) findViewById(R.id.btnparentesis1);
        btnparentesis2 = (Button) findViewById(R.id.btnparentesis2);
        btnmenos = (Button) findViewById(R.id.btnmenos);
        btnmas = (Button) findViewById(R.id.btnmas);
        btnigual = (Button) findViewById(R.id.btnigual);
        btnexponente = (Button) findViewById(R.id.btnexponente);
        btnraiz = (Button) findViewById(R.id.btnraiz);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn0 = (Button) findViewById(R.id.btn0);


        //________Definiendoles action listener, accion al tocarlas_______
        btnborrartodo.setOnClickListener(this);
        btnborrar.setOnClickListener(this);
        btndiv.setOnClickListener(this);
        btnparentesis1.setOnClickListener(this);
        btnparentesis2.setOnClickListener(this);
        btnmenos.setOnClickListener(this);
        btnmas.setOnClickListener(this);
        btnigual.setOnClickListener(this);
        btnexponente.setOnClickListener(this);
        btnraiz.setOnClickListener(this);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn0.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.btnmas) {
            signos++;
            espacio += 3;
            lblOp.setText(lblOp.getText() + "+");
        }

        if (id == R.id.btnmenos) {
            signos++;
            espacio += 3;
            lblOp.setText(lblOp.getText() + "-");
        }

        if (id == R.id.btnraiz) {
            signos++;
            espacio += 3;
            lblOp.setText(lblOp.getText() + "√");
        }
        if (id == R.id.btnexponente) {
            signos++;
            espacio += 3;
            lblOp.setText(lblOp.getText() + "^");

        }
        if (id == R.id.btndiv) {
            signos++;
            espacio += 3;
            lblOp.setText(lblOp.getText() + "/");

        }

        if (id == R.id.btnborrartodo) {
            lblOp.setText("");
            lblExponente.setText("");
            lblExponente2.setText("");
            espacio = 0;
            signos = 0;
        }

        //es para escribir los numeros y el punto
        if (id == R.id.btn1) {
            if (exp) operacion(1);
            else {
                lblOp.setText(lblOp.getText() + "1");
                espacio += 3;
            }
        }
        if (id == R.id.btn2) {
            if (exp) operacion(2);
            else {
                lblOp.setText(lblOp.getText() + "2");
                espacio += 3;
            }
        }
        if (id == R.id.btn3) {
            if (exp) operacion(3);
            else {
                lblOp.setText(lblOp.getText() + "3");
                espacio += 3;
            }
        }
        if (id == R.id.btn4) {
            if (exp) operacion(4);
            else {
                lblOp.setText(lblOp.getText() + "4");
                espacio += 3;
            }
        }
        if (id == R.id.btn5) {
            if (exp) operacion(5);
            else {
                lblOp.setText(lblOp.getText() + "5");
                espacio += 3;
            }
        }
        if (id == R.id.btn6) {
            if (exp) operacion(6);
            else {
                lblOp.setText(lblOp.getText() + "6");
                espacio += 3;
            }
        }
        if (id == R.id.btn7) {
            if (exp) operacion(7);
            else {
                lblOp.setText(lblOp.getText() + "7");
                espacio += 3;
            }
        }
        if (id == R.id.btn8) {
            if (exp) operacion(8);
            else {
                lblOp.setText(lblOp.getText() + "8");
                espacio += 3;
            }
        }
        if (id == R.id.btn9) {
            if (exp) operacion(9);
            else {
                lblOp.setText(lblOp.getText() + "9");
                espacio += 3;
            }
        }
        if (id == R.id.btn0) {
            if (exp) operacion(0);
            else {
                lblOp.setText(lblOp.getText() + "0");
                espacio += 3;
            }
        }

        if (id == R.id.btnparentesis1) {
            lblOp.setText(lblOp.getText() + "(");
        }

        if (id == R.id.btnparentesis2) {
            lblOp.setText(lblOp.getText() + ")");
        }


        if (id == R.id.btnigual) {
            lblOp.setText("NO HAY PERRO, LA TIENES QUE PROGRAMAR");
            Toast msjError = Toast.makeText(getApplicationContext(), "PROGRAMA HUEVON :v", Toast.LENGTH_SHORT);
        }
    }

    void operacion(int num) {
        lblOp.setText(lblOp.getText() + " ");
        llenaEspacio += 2;
    }

    void truefalse (int vf){
        if (vf==1){
            btnmenos.setEnabled(true);
            btnmas.setEnabled(true);
            btnparentesis1.setEnabled(true);

        }
        else{
            btnmenos.setEnabled(false);
            btnmas.setEnabled(false);
            btnexponente.setEnabled(false);
            btnparentesis1.setEnabled(false);
        }

    }


}