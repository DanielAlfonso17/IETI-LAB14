package ieti.android.secureapp.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import ieti.android.secureapp.MainActivity;
import ieti.android.secureapp.R;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void signIn(View view){
        EditText username = findViewById(R.id.username);
        String correo = username.getText().toString();
        EditText password = findViewById(R.id.password);
        String pass = password.getText().toString();
        if(correo.isEmpty()){
            username.setError("El campo email es vacío");
        }else if(pass.isEmpty()){
            password.setError("El campo contraseña es vació");
        }else if(pass.isEmpty() && correo.isEmpty()){
            username.setError("El campo email es vacío");
            password.setError("El campo contraseña es vació");
        }else{
            Intent menuBar = new Intent(this, MainActivity.class);
            startActivity(menuBar);
        }

    }
}
