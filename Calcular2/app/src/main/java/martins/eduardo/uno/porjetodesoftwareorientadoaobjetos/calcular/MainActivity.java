package martins.eduardo.uno.porjetodesoftwareorientadoaobjetos.calcular;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    public static final String DIVIDIR = "Dividir";
    public static final String MULTIPLICAR = "Multiplicar";
    public static final String SOMAR = "Somar";
    public static final String SUBTRAIR = "Subtrair";
    public static final String POTENCIA = "Potecia de 10";
    public static final String RAIZQUADRADA = "Raiz quadrada";
    public static final String POTENCIACAO = "Potenciação";
    public static final String LOGARITMO = "Logaritmo";
    private Spinner spiOpcoes;
    private EditText edtNumero1, edtNumero2;
    private ImageView imgOperacao;
    private TextView tvResultado;
    private Button btnCalcular;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spiOpcoes   = findViewById(R.id.spiOpcoes);
        edtNumero1  = findViewById(R.id.edtNumero1);
        edtNumero2  = findViewById(R.id.edtNumero2);
        imgOperacao = findViewById(R.id.imgOperacao);
        btnCalcular = findViewById(R.id.btnCalcular);
        tvResultado = findViewById(R.id.tvResultado);

        imgOperacao.setVisibility(View.INVISIBLE);


        ArrayAdapter<String> adapterOperacoes = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item // aparecer um em baixo do outro
                , getResources().getStringArray(R.array.operacoes_matematica)); // conteudo que vai aparecer
        adapterOperacoes.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spiOpcoes.setAdapter(adapterOperacoes);
        spiOpcoes.setOnItemSelectedListener(this);//this usada como argumento de metodo



       btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //PEGA A OPCAO SELECIONADA DO SPINNER
                String operacaoSelecionada = spiOpcoes.getSelectedItem().toString();

                if(operacaoSelecionada.equals(DIVIDIR)){
                    tvResultado.setText(dividir());

                } else if(operacaoSelecionada.equals(MULTIPLICAR)){
                    tvResultado.setText(multiplicar());

                } else if(operacaoSelecionada.equals(SOMAR)){
                    tvResultado.setText(somar());

                } else if (operacaoSelecionada.equals(SUBTRAIR)){
                    tvResultado.setText(sutrair());

                } else{

                }

                //tvResultado.setText(operacaoSelecionada);
            }

       });

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        //Toast.makeText(MainActivity.this, adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();


        if(adapterView.getItemAtPosition(i).toString().equals(DIVIDIR)){
            imgOperacao.setImageDrawable(getResources().getDrawable(R.drawable.divisao, getTheme()));
            imgOperacao.setVisibility(View.VISIBLE);
            edtNumero1.setHint("Dividendo");
            edtNumero2.setHint("Divisor");


        } else if (adapterView.getItemAtPosition(i).toString().equals(MULTIPLICAR)){
            imgOperacao.setImageDrawable(getResources().getDrawable(R.drawable.multiplica, getTheme()));
            imgOperacao.setVisibility(View.VISIBLE);
            edtNumero1.setHint("Mutipicando");
            edtNumero2.setHint("Mutipicador");


        } else if(adapterView.getItemAtPosition(i).toString().equals(SOMAR)){
            imgOperacao.setImageDrawable(getResources().getDrawable(R.drawable.soma, getTheme()));
            imgOperacao.setVisibility(View.VISIBLE);
            edtNumero1.setHint("Pacela");
            edtNumero2.setHint("Pacela");

        } else if(adapterView.getItemAtPosition(i).toString().equals(SUBTRAIR)){
            imgOperacao.setImageDrawable(getResources().getDrawable(R.drawable.subtracao, getTheme()));
            imgOperacao.setVisibility(View.VISIBLE);
            edtNumero1.setHint("Minuendo");
            edtNumero2.setHint("Subtraendo");

        } else if(adapterView.getItemAtPosition(i).toString().equals(POTENCIA)){
            imgOperacao.setImageDrawable(getResources().getDrawable(R.drawable.potencia));
            imgOperacao.setVisibility(View.VISIBLE);
            edtNumero1.setHint('Potencia');
            edtNumero2.setHint("Potencia2");
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    private String dividir() {
        String resultado = "";

        int dividendo = Integer.valueOf(edtNumero1.getText().toString());
        int divisor   = Integer.valueOf(edtNumero2.getText().toString());

        resultado = "O valor divisão é " + String.valueOf(dividendo / divisor);


        return resultado;
    }

    private String multiplicar() {
        String resultado = "";

        int multiplicando = Integer.valueOf(edtNumero1.getText().toString());
        int multiplicador = Integer.valueOf(edtNumero2.getText().toString());

        resultado = "O valor multiplicacão " + String.valueOf(multiplicando * multiplicador );


        return  resultado;
    }

    private String somar() {
        String resultado = "";

       int parcela  = Integer.valueOf(edtNumero1.getText().toString());
       int parcela2 = Integer.valueOf(edtNumero2.getText().toString());


        resultado = "O valor soma é " + String.valueOf(parcela + parcela );

        return resultado;

    }

    private String sutrair() {
        String resultado = "";

        int minuendo    = Integer.valueOf(edtNumero1.getText().toString());
        int subtraendo  = Integer.valueOf(edtNumero2.getText().toString());

        resultado = "O valor sutrair é " + String.valueOf(minuendo - subtraendo);

        return resultado;

    }

    private String potencia() {
        String resultado = "";

        int potencia  = Integer.valueOf(edtNumero1.getText().toString());
        int potencia2 = Integer.valueOf(edtNumero2.getText().toString());
    }



}