package io.github.hingeapp.canteenautomation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    private EditText edname,edemail,edpassword,edrpassword;

    private TextView  tvname,tvemail,tvpassword,tvrpassword;
    private  Button btncont ;

    private  String name,email,password,rpassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    edemail  = (EditText)findViewById(R.id.editText2);
    edname  = (EditText)findViewById(R.id.editText1);
    edpassword  = (EditText)findViewById(R.id.editText3);
    edrpassword  = (EditText)findViewById(R.id.editText4);

    btncont = (Button)findViewById(R.id.button1);

        btncont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               name = edname.getText().toString();
               email = edemail.getText().toString();
               password = edpassword.getText().toString();
               rpassword = edrpassword.getText().toString();


                if(TextUtils.isEmpty(name) || TextUtils.isEmpty(email)|| TextUtils.isEmpty(password)||TextUtils.isEmpty(rpassword) )
                {

                    Toast.makeText(getApplicationContext(),"please enter all the details",Toast.LENGTH_SHORT).show();


                }else{

                        if (password.equals(rpassword)){




                        }


                }











            }
        });




    }
}
