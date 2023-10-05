package com.example.fragment_ornek;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class AnasayfaFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup viewGroup= (ViewGroup) inflater.inflate(R.layout.fragment_anasayfa,container,false);
        //yukarıdakini yazarak ilgili xmldeki textviewleri fln findbyid ile erişenilmemizi sağlıyor
        TextView textView=viewGroup.findViewById(R.id.textView2);
        textView.setText("Ana Sayfa");





        return inflater.inflate(R.layout.fragment_anasayfa,container,false);
    }
}
