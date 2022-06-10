package francisco.roberto.uno.calcular;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private static final String DIVISAO = "Dividir";
    private static final String MULTIPLICACAO = "Multiplicar";
    private static final String SOMA = "Soma";
    private static final String SUBTRACAO = "Subtrair";
    private TextView tvResultado;
    private Spinner spiOpcoes;
    private EditText edtOperando1, edtOperando2;
    private Button btnCalcular;
    private ImageView imgOperacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResultado  = findViewById(R.id.tvResultado);
        spiOpcoes    = findViewById(R.id.spiOpcoes);
        edtOperando1 = findViewById(R.id.edtOperando1);
        edtOperando2 = findViewById(R.id.edtOperando2);
        btnCalcular  = findViewById(R.id.btnCalcular);
        imgOperacao  = findViewById(R.id.imgOperacao);

        imgOperacao.setVisibility(View.INVISIBLE);

        ArrayAdapter<String> adapterOpcoesMatematicas = new ArrayAdapter<String>(this
        , android.R.layout.simple_spinner_item
        , getResources().getStringArray(R.array.operacoes_matematica));
        adapterOpcoesMatematicas.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spiOpcoes.setAdapter(adapterOpcoesMatematicas);
        spiOpcoes.setOnItemSelectedListener(this);

        String opcaoselecionada = spiOpcoes.getSelectedItem().toString();

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (opcaoselecionada == DIVISAO){

                }
                if (opcaoselecionada == MULTIPLICACAO){

                }
                if (opcaoselecionada == SOMA){

                }
                if (opcaoselecionada == SUBTRACAO){

                }

                int edtOperador1 = Integer.parseInt(String.valueOf(edtOperando1.getText()));
                int edtOperador2 = Integer.parseInt(String.valueOf(edtOperando2.getText()));
                int soma = edtOperador1 + edtOperador2;


                tvResultado.setText("Resultado: " + soma);

                tvResultado.setText("Resultado" + soma);


            }


        });


    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        Toast.makeText(MainActivity.this, adapterView.getItemAtPosition(i).toString()
        , Toast.LENGTH_SHORT).show();

        if (adapterView.getItemAtPosition(i).toString() == DIVISAO){

        }else if (adapterView.getItemAtPosition(i).toString().equals(MULTIPLICACAO)){

        }else if (adapterView.getItemAtPosition(i).toString().equals(SOMA)){
            imgOperacao.setVisibility(View.VISIBLE);
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}