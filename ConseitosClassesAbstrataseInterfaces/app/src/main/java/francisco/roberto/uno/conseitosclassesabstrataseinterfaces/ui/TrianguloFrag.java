package francisco.roberto.uno.conseitosclassesabstrataseinterfaces.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;


import francisco.roberto.uno.conseitosclassesabstrataseinterfaces.R;
import francisco.roberto.uno.conseitosclassesabstrataseinterfaces.forma.Triangulo;

public class TrianguloFrag extends Fragment {
    private EditText edtLado1, edtLado2, edtLado3;
    private TextView tvAreaTriangulo;
    private ImageButton imgbLimparTriangulo, imgbCalcularTriangulo;

    public TrianguloFrag() {}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layoutFragment = inflater.inflate(R.layout.fragment_triangulo, container, false);

        edtLado1              = layoutFragment.findViewById(R.id.edtLado1);
        edtLado2              = layoutFragment.findViewById(R.id.edtLado2);
        edtLado3              = layoutFragment.findViewById(R.id.edtLado3);
        tvAreaTriangulo       = layoutFragment.findViewById(R.id.tvAreaTriangulo);
        imgbLimparTriangulo   = layoutFragment.findViewById(R.id.imgbLimparTriangulo);
        imgbCalcularTriangulo = layoutFragment.findViewById(R.id.imgbCalcularTriangulo);

        imgbCalcularTriangulo.setOnClickListener(view -> {
            if(edtLado1.getText().toString().isEmpty()){
                Toast.makeText(getContext(), "Informe o lado 01 do triângulo!", Toast.LENGTH_SHORT).show();

            } else if(edtLado2.getText().toString().isEmpty()){
                Toast.makeText(getContext(), "Informe o lado 02 do triângulo!", Toast.LENGTH_SHORT).show();

            }
            else if(edtLado3.getText().toString().isEmpty()){
                Toast.makeText(getContext(), "Informe o lado 03 do triângulo!", Toast.LENGTH_SHORT).show();

            } else{
                Triangulo triangulo = new Triangulo(Double.valueOf(edtLado1.getText().toString())
                        , Double.valueOf(edtLado2.getText().toString())
                        , Double.valueOf(edtLado3.getText().toString()));

                String areaFormatada = new DecimalFormat("#,##0.00").format(triangulo.area());
                tvAreaTriangulo.setText(areaFormatada);
            }
        });

        imgbLimparTriangulo.setOnClickListener(view -> {
            edtLado1.setText("");
            edtLado2.setText("");
            edtLado3.setText("");
            tvAreaTriangulo.setText("");
        });

        return layoutFragment;
    }
}