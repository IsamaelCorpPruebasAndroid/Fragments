package midoriya.fragments;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import midoriya.fragments.fragments.DataFragment;
import midoriya.fragments.fragments.DetailsFragment;

public class MainActivity extends FragmentActivity implements DataFragment.DataListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void sendData(String text) {
        //Llamar al metodo renderizarTexto del detailsFragment pasandole
        // el texto que recibio el parametro en este mismo metodo

        DetailsFragment detailsFragment = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.detailsFragment);
        detailsFragment.renderText(text);

    }
}
