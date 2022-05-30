package francisco.roberto.uno.conceitofragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.SharedElementCallback;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;


public class ToolbarFragment extends Fragment implements SeekBar.OnSeekBarChangeListener {

    private EditText editText;
    private SeekBar skbInformarTexto;
    private Button  btnAlterarTexto;
    private ToolbarListener toolbarListener;
    private static int TEXT_SIZE;

    public interface ToolbarListener {
        public void onButtonClick(int position, String texto);

    }

    public ToolbarFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View toolBaryoutInflated = inflater.inflate(R.layout.fragment_toolbar, container, false);

        editText            = toolBaryoutInflated.findViewById(R.id.edtTexto);
        skbInformarTexto    = toolBaryoutInflated.findViewById(R.id.skbFormatarTexto);
        btnAlterarTexto     = toolBaryoutInflated.findViewById(R.id.btnAlterarTexto);


        btnAlterarTexto.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view){
                buttonClicked(view);

            }

        });

        return toolBaryoutInflated;

    }


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        try{
            toolbarListener =  (ToolbarListener) context;
        }
        catch (ClassCastException e){
            throw new ClassCastException(context.toString()
            +"Obrigatorio implementar a interface ToolbarListaner");

        }
    }
    public void buttonClicked(View view){
        toolbarListener.onButtonClick(TEXT_SIZE, editText.getPrivateImeOptions());
    }


    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {



    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }


}