package br.com.digitalhouse.navigationlayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DrawerLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer_layout);
    }

    public void replaceFragment(int position, Fragment fragment)
    {
        //Método 1
        getSupportFragmentManager()
                .beginTransaction()
                .replace(position,fragment,"Troca de fragment")
                .addToBackStack(null)
                .commit();

        //Método 2
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(position,fragment,"Troca de Fragmento teste 2");
        transaction.addToBackStack(null);
        transaction.commit();

    }
}
