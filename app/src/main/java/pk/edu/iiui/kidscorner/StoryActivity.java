package pk.edu.iiui.kidscorner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class StoryActivity extends AppCompatActivity {
    MyAdapter myAdapter;
    GridView gridView1;
    String[] story_name_list;
    int[] story_image_list= {R.drawable.s1,R.drawable.s2,R.drawable.s3,R.drawable.s4,R.drawable.s5,R.drawable.s6,R.drawable.s7,R.drawable.s8};;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        gridView1 =  findViewById(R.id.simpleGridView);
        story_name_list=getResources().getStringArray(R.array.Story_List);

        myAdapter=new MyAdapter(this,story_name_list,story_image_list);
        gridView1.setAdapter(myAdapter);

        gridView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                intent=new Intent(StoryActivity.this,ShowData.class);
                if(position==0)
                {
                    intent.putExtra("row",10);
                    intent.putExtra("v1","17 Camels and 3 Sons");
                    startActivity(intent);
                }


                else if(position==1)
                {
                    intent.putExtra("row",11);
                    intent.putExtra("v1","Cocoon and the Butterfly");
                    startActivity(intent);
                }

                else if(position==2)
                {

                    intent.putExtra("row",12);
                    intent.putExtra("v1","Strong or Weak");
                    startActivity(intent);


                }
                else if(position==3)
                {

                    intent.putExtra("row",13);
                    intent.putExtra("v1","The Lion and the Mouse");
                    startActivity(intent);


                }
                else if(position==4)
                {

                    intent.putExtra("row",14);
                    intent.putExtra("v1","The Goose with the Golden Eggs");
                    startActivity(intent);


                }
                else if(position==5)
                {

                    intent.putExtra("row",15);
                    intent.putExtra("v1","The Cunning Fox and the Clever Stork");
                    startActivity(intent);


                }
                else if(position==6)
                {

                    intent.putExtra("row",16);
                    intent.putExtra("v1","The Hare and the Tortoise");
                    startActivity(intent);


                }
                else if(position==7)
                {

                    intent.putExtra("row",17);
                    intent.putExtra("v1","A Hole in the Fence");
                    startActivity(intent);


                }

            }
        });

    }

    }

