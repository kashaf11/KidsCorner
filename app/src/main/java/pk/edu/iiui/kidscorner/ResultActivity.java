package pk.edu.iiui.kidscorner;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RatingBar;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        //get rating bar object
        RatingBar bar=(RatingBar)findViewById(R.id.ratingBar1);
        bar.setNumStars(10);
        bar.setStepSize(0.5f);
        //get text view
        TextView t=(TextView)findViewById(R.id.textResult);
        //get score
        Bundle b = getIntent().getExtras();
        int score= b.getInt("score");
        //display score
        bar.setRating(score);
        switch (score)
        {
            case 1: t.setText("You have scored 10%,  " + "keep learning!");
                break;
            case 2: t.setText("You have scored 20%, Keep working Hard!");
                break;
            case 3: t.setText("You have scored 30%, Keep Reading! ");
                break;
            case 4:t.setText(" You have scored 40%, Not Bad!");
                break;
            case 5:t.setText(" You have scored 50%, Keep Up the effort");
                break;
            case 6:t.setText(" You have scored 60%, Good work");
                break;
            case 7:t.setText(" You have scored 70%,  Hmmmm.." +
                    " Maybe you have been reading a lot of Stories");
                break;
            case 8:t.setText(" Whao, you have scored 80%, Outstanding!");
                break;
            case 9:t.setText(" You have scored 90%, Wow brilliant!");
                break;
            case 10:t.setText(" Whao, you have scored 100%" +
                    "Who are you? A brilliant child!");
                break;
            default:t.setText( "Opsss you scored 0%" + "Better Luck Next time!");

        }
    }

}
