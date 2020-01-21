package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.StrictMode;
import android.widget.Button;
import android.widget.EditText;

import java.sql.Connection;

public class MainActivity extends AppCompatActivity {

    EditText editUser, editPass;
    Button buttonLogin;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editUser = (EditText)findViewById(R.id.editUsuario);
        editPass = (EditText)findViewById(R.id.editPass);
        buttonLogin = (Button)findViewById(R.id.buttonLogin);

    }

    public Connection ConexionBD(){

        Connection Conexion = null;
        try {
            StrictMode.ThreadPolicy policy= new StrictMode.ThreadPolicy.Builder().permitAll().build();//Validate change for permit Network!
            StrictMode.setThreadPolicy(policy);
        }catch (Exception e){

        }
        return Conexion;
    }


}
