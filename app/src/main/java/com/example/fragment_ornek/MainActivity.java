package com.example.fragment_ornek;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void anaSayfaClicked(View view){

        //FragmentManager fragmentManager= getSupportFragmentManager();
        //FragmentTransaction transaction=fragmentManager.beginTransaction();


        AnasayfaFragment anasayfaFragment= new AnasayfaFragment();

        //transaction.add(R.id.frameLayout,anasayfaFragment).commit();

        getSupportFragmentManager().beginTransaction()
                .setReorderingAllowed(true)
                .replace(R.id.frameLayout, anasayfaFragment, null)
                .commit();
    }

    public void iletisimClicked(View view){
        FragmentManager fragmentManager= getSupportFragmentManager();
        FragmentTransaction transaction=fragmentManager.beginTransaction();

        IletisimFragment iletisimFragment= new IletisimFragment();
        transaction.replace(R.id.frameLayout,iletisimFragment).commit();
    }

}