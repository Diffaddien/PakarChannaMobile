package id.tam.pakarchanna;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import id.tam.pakarchanna.isichanna.*;


public class fragmentDaftar extends Fragment implements View.OnClickListener{
    Button bAndrao, bAsiatica, bAuranti, bBleheri, bMaru, bPulchra;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle saveInstanceState){
        View tampil = inflater.inflate(R.layout.fragment_daftar, container, false);
        bAndrao = (Button) tampil.findViewById(R.id.tombol_andrao);
        bAndrao.setOnClickListener(this);
        bAsiatica = (Button) tampil.findViewById(R.id.tombol_asiatica);
        bAsiatica.setOnClickListener(this);
        bAuranti = (Button) tampil.findViewById(R.id.tombol_auranti);
        bAuranti.setOnClickListener(this);
        bBleheri = (Button) tampil.findViewById(R.id.tombol_bleheri);
        bBleheri.setOnClickListener(this);
        bMaru = (Button) tampil.findViewById(R.id.tombol_maru);
        bMaru.setOnClickListener(this);
        bPulchra = (Button) tampil.findViewById(R.id.tombol_pulchra);
        bPulchra.setOnClickListener(this);

        return tampil;
    }


    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.tombol_andrao:
                Intent intent = new Intent(getContext(), Andrao.class);
                startActivity(intent);
                break;

            case R.id.tombol_asiatica:
                Intent intent2 = new Intent(getContext(), Asiatica.class);
                startActivity(intent2);
                break;

            case R.id.tombol_auranti:
                Intent intent3 = new Intent(getContext(), Auranti.class);
                startActivity(intent3);
                break;
            case R.id.tombol_bleheri:
                Intent intent4 = new Intent(getContext(), Bleheri.class);
                startActivity(intent4);
                break;

            case R.id.tombol_maru:
                Intent intent5 = new Intent(getContext(), Maru.class);
                startActivity(intent5);
                break;

            case R.id.tombol_pulchra:
                Intent intent6 = new Intent(getContext(), Pulchra.class);
                startActivity(intent6);
                break;
        }
    }
}
