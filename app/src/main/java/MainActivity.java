package scott.marvin.sportinlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText Name;
    private EditText Password;
    private Button Login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name = (EditText)findViewById(R.id.EnterName);
        Password = (EditText)findViewById(R.id.EnterPassword);
        Login = (Button)findViewById(R.id.buttonLogin);



    }
}
    private void validate (String userName, String userPassword){
        if((userName == "Admin") && (userPassword == "1234")){
            Intent Intent = (new Intent(MainActivity.this, SecondActivity.class);
            startActivity(Intent);
        }

    }