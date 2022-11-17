package com.example.infomanga2_0;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {

    EditText username, password;
    Button btnlogin;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.username1);
        password = (EditText) findViewById(R.id.password1);
        btnlogin = (Button) findViewById(R.id.btnsingin1);
        DB = new DBHelper(this);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String pass = password.getText().toString();
                try {
                    if(user.equals("")||pass.equals(""))
                        Toast.makeText(LoginActivity.this, "No hay datos ingresados", Toast.LENGTH_LONG).show();
                    else{
                        Boolean checkuserpass = DB.checkusernamepassword(user, pass);
                        if (checkuserpass==true){
                            Toast.makeText(LoginActivity.this, "Sing in Existoso", Toast.LENGTH_LONG).show();
                            Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                            startActivity(intent);
                        }else {
                            Toast.makeText(LoginActivity.this, "Credenciales Invalidas", Toast.LENGTH_LONG).show();
                        }
                    }
                }
                catch (Exception e){
                    username.setText(e.toString());
                }
            }
        });
    }
}