package pk.edu.iiui.kidscorner;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class ShowData extends AppCompatActivity {
    TextView textView1;
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data);
        Intent in = getIntent();
        textView1=findViewById(R.id.tvv1);
        textView2=findViewById(R.id.tvv2);
        String name= in.getStringExtra("v1");
        int val=in.getExtras().getInt("row");
        if(val==0)
        {
            textView1.setText(name);
            textView2.setText(R.string.poem1);

        }
        else if(val==1)
        {
            textView1.setText(name);
            textView2.setText(R.string.poem2);

        }
        else if(val==2)
        {
            textView1.setText(name);
            textView2.setText(R.string.poem3);

        }
        else if(val==3)
        {
            textView1.setText(name);
            textView2.setText(R.string.poem4);

        }
        else if(val==4)
        {
            textView1.setText(name);
            textView2.setText(R.string.poem5);

        }
        else if(val==5)
        {
            textView1.setText(name);
            textView2.setText(R.string.poem6);

        }
        else if(val==6)
        {
            textView1.setText(name);
            textView2.setText(R.string.poem7);

        }
        else if(val==7)
        {
            textView1.setText(name);
            textView2.setText(R.string.poem8);

        }
        else if(val==8)
        {
            textView1.setText(name);
            textView2.setText(R.string.poem9);

        }

        if(val==10)
        {
            textView1.setText(name);
            textView2.setText(R.string.story1);

        }
        else if(val==11)
        {
            textView1.setText(name);
            textView2.setText(R.string.story2);

        }
        else if(val==12)
        {
            textView1.setText(name);
            textView2.setText(R.string.story3);

        }
        else if(val==13)
        {
            textView1.setText(name);
            textView2.setText(R.string.story4);

        }
        else if(val==14)
        {
            textView1.setText(name);
            textView2.setText(R.string.story5);

        }
        else if(val==15)
        {
            textView1.setText(name);
            textView2.setText(R.string.story6);

        }
        else if(val==16)
        {
            textView1.setText(name);
            textView2.setText(R.string.story7);

        }
        else if(val==17)
        {
            textView1.setText(name);
            textView2.setText(R.string.story8);

        }
    }
}

