package com.jlemus.beeradviser;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindBeerActivity extends Activity {

    private BeerExpert expert = new BeerExpert();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    public void onClickFindBeer(View view){
        TextView brands = (TextView) findViewById(R.id.brands);
        Spinner color = (Spinner) findViewById(R.id.color);

        String beerType = String.valueOf(color.getSelectedItem());
        //brands.setText(beerType);

        List<String> beerTypeList = expert.getBrands(beerType);

        StringBuilder brandsFormatted = new StringBuilder();



        for(String x : beerTypeList){
            brandsFormatted.append(x + "\n");
            //brands.append(x + "\n");
            //brands.setText(x);
        }

        brands.setText(brandsFormatted);




    }
}
