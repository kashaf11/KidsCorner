package pk.edu.iiui.kidscorner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class PoemActivity extends AppCompatActivity {
    ListView lv1;
    String[] poemArray;
    ArrayAdapter<String> itemsAdapter;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poem);
        Intent i = getIntent();
        lv1 = findViewById(R.id.listview1);
        poemArray = getResources().getStringArray(R.array.Poem_List);

        itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, poemArray);
        lv1.setAdapter(itemsAdapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                intent = new Intent(PoemActivity.this, ShowData.class);

                if (position == 0) {

                    intent.putExtra("row", 0);
                    intent.putExtra("v1", "Mary’s Lamb");
                    startActivity(intent);


                } else if (position == 1) {

                    intent.putExtra("row", 1);
                    intent.putExtra("v1", "Twinkle, Twinkle Little Star");
                    startActivity(intent);


                } else if (position == 2) {

                    intent.putExtra("row", 2);
                    intent.putExtra("v1", "Jack And Jill");
                    startActivity(intent);


                } else if (position == 3) {

                    intent.putExtra("row", 3);
                    intent.putExtra("v1", "Baa, Baa Black Sheep");
                    startActivity(intent);


                } else if (position == 4) {

                    intent.putExtra("row", 4);
                    intent.putExtra("v1", "Wee Willie Winkle");
                    startActivity(intent);


                } else if (position == 5) {

                    intent.putExtra("row", 5);
                    intent.putExtra("v1", "My Cat Is Fat");
                    startActivity(intent);


                } else if (position == 6) {

                    intent.putExtra("row", 6);
                    intent.putExtra("v1", "Topsy-Turvey-World");
                    startActivity(intent);


                } else if (position == 7) {

                    intent.putExtra("row", 7);
                    intent.putExtra("v1", "A Mouse In The Room");
                    startActivity(intent);


                } else if (position == 8) {

                    intent.putExtra("row", 8);
                    intent.putExtra("v1", "McGallimagoo");
                    startActivity(intent);


                }


            }


        });


    }


}




