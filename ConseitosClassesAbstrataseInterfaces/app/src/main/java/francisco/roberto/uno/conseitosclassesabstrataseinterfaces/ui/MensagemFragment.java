package francisco.roberto.uno.conseitosclassesabstrataseinterfaces.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import francisco.roberto.uno.conseitosclassesabstrataseinterfaces.R;

public class MensagemFragment extends Fragment {

    public MensagemFragment() {}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layoutFragment = inflater.inflate(R.layout.fragment_mensagem, container, false);


        return layoutFragment;
    }
}