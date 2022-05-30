package francisco.roberto.uno.conceitofragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends FragmentActivity {

    private Bundle btnAlterartexto;
    private EditText edtInformartexto;
    private SeekBar  skbFormatarTexto;
    private TextView tvExibrirTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}