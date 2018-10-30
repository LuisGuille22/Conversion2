package facciluisvelez.conversion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    Button temperatura= null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e( "MainActivity","Velez Delgado Luis Guillermo");

        temperatura = (Button) findViewById(R.id.btn1);

        temperatura.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent cambiar=new Intent(getApplicationContext(),Temperatura.class);
                startActivity(cambiar);
            }
        });
    }
}