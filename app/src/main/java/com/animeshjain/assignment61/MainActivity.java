package com.animeshjain.assignment61;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText pwdEdtTxt, loginEdtTxt;
    Button loginBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginEdtTxt= (EditText)findViewById(R.id.userNameEdtTxt);
        pwdEdtTxt= (EditText)findViewById(R.id.pwdEdtTxt);
        loginBtn= (Button)findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String loginid=loginEdtTxt.getText().toString();
                String pwd=pwdEdtTxt.getText().toString();

                if(loginid.equals("ani"))
                {
                    if(pwd.equals("123")){
                        Toast.makeText(MainActivity.this, "Credentials Match", Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(MainActivity.this, "Password Mismatch",Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(MainActivity.this, "User ID Not Found Please SignUp first", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
