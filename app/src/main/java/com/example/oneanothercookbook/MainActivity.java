package com.example.oneanothercookbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.gson.Gson;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<ReceptBluda> spisokReceptov;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO: переделать под загрузку из Интернета

        spisokReceptov = new ArrayList<ReceptBluda>();

        ReceptBluda recept = new ReceptBluda("Омлет","Описание","Описание");
        recept.setFoto("omlet.png");

        ArrayList<IngredientRecepta> ingredients = new ArrayList<IngredientRecepta>();

        IngredientRecepta ingredient = new IngredientRecepta("Яйцо куриное",6.0,"шт.");
        ingredients.add(ingredient);
        ingredient = new IngredientRecepta("Молоко",200.0,"мл");
        ingredients.add(ingredient);
        ingredient = new IngredientRecepta("Соль повареная");
        ingredients.add(ingredient);

        recept.setIngredienty(ingredients);

        spisokReceptov.add(recept);


        //ArrayList<String> nazvaniia = new ArrayList<String>();

        //for (ReceptBluda rb: spisokReceptov){
          //  nazvaniia.add(rb.getNazvanie());
       // }

        //Gson gson = new Gson();
        //MyClass myClass = gson.fromJson(jsonString, MyClass.class);

        // находим список
        ListView spisokView = (ListView) findViewById(R.id.spisok);
        // создаем адаптер
        ArrayAdapter<ReceptBluda> adapter = new ArrayAdapter<ReceptBluda>(this,android.R.layout.simple_list_item_1, spisokReceptov);
        // присваиваем адаптер списку
        spisokView.setAdapter(adapter);

        spisokView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Gson gson = new Gson();
                ReceptBluda recept = (ReceptBluda) ( (ListView) findViewById(R.id.spisok)).getSelectedItem();

                String receptJson = gson.toJson(recept);
                Intent i = new Intent(MainActivity.this,ReceptInfo.class);

                i.putExtra("receptJson", receptJson);

                startActivity(i);
                //Log.d(LOG_TAG, "itemClick: position = " + position + ", id = "+ id);
            }
        });

    }
}
