package pk.edu.iiui.kidscorner;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static pk.edu.iiui.kidscorner.DbContract.MovieEntry.KEY_ANSWER;
import static pk.edu.iiui.kidscorner.DbContract.MovieEntry.KEY_ID;
import static pk.edu.iiui.kidscorner.DbContract.MovieEntry.KEY_OPTA;
import static pk.edu.iiui.kidscorner.DbContract.MovieEntry.KEY_OPTB;
import static pk.edu.iiui.kidscorner.DbContract.MovieEntry.KEY_OPTC;
import static pk.edu.iiui.kidscorner.DbContract.MovieEntry.KEY_QUES;
import static pk.edu.iiui.kidscorner.DbContract.MovieEntry.TABLE_QUEST;

public class DbHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "Kids_Quiz";
    // tasks table name

    private SQLiteDatabase dbase;
    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        dbase=db;
        String sql = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
                + " TEXT, " + KEY_ANSWER+ " TEXT, "+KEY_OPTA +" TEXT, "
                +KEY_OPTB +" TEXT, "+KEY_OPTC+" TEXT)";
        db.execSQL(sql);
        addQuestions();
        //db.close();
    }
    private void addQuestions() {
        Question q1 = new Question("Which country is home to the kangaroo?", "Australia", "Korea ", "South Africa", "Australia");
        this.addQuestion(q1);
        Question q2 = new Question("What is the top colour in a rainbow?", "voilet", "Red", "Pink", "Red");
        this.addQuestion(q2);
        Question q3 = new Question("What sweet food made by bees using nectar from flowers?", "Sugar", "Caramel" , "Honey" , "Honey");
        this.addQuestion(q3);
        Question q4 = new Question("Name the school that Harry Potter attended?", "Oxford", "Hogwards", "Cambridge", "Hogwards");
        this.addQuestion(q4);
        Question q5 = new Question("What is the name of the fairy in Peter Pan?", "Tinkerbell", "Alice", "Rapunzel", "Tinkerbell");
        this.addQuestion(q5);
        Question q6 = new Question("What is the nickname for the bell in London?", "Small Ben ", "Large Ben", "Big Ben", "Big Ben");
        this.addQuestion(q6);
        Question q7 = new Question("What is the capital of England?", "London", "Woking", "Bermigum", "London");
        this.addQuestion(q7);
        Question q8 = new Question("How many days are there in June?", "30 days", "31 days", "28 days", "30 days");
        this.addQuestion(q8);
        Question q9 = new Question("Scarlet is a bright red color?", "False", "True", "Both", "True");
        this.addQuestion(q9);
        Question q10 = new Question("What was Mickey Mouse’s original name?", "Tom", "Kitty", "Mortimer Mouse", "Mortimer Mouse");
        this.addQuestion(q10);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldV, int newV) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUEST);
        // Create tables again
        onCreate(db);
    }
    // Adding new question
    public void addQuestion(Question quest) {
        //SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_QUES, quest.getQUESTION());
        values.put(KEY_ANSWER, quest.getANSWER());
        values.put(KEY_OPTA, quest.getOPTA());
        values.put(KEY_OPTB, quest.getOPTB());
        values.put(KEY_OPTC, quest.getOPTC());
        // Inserting Row
        dbase.insert(TABLE_QUEST, null, values);
    }
    public List<Question> getAllQuestions() {
        List<Question> quesList = new ArrayList<Question>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_QUEST + " ORDER BY "+ "RANDOM()";
        dbase=this.getReadableDatabase();
        Cursor cursor = dbase.rawQuery(selectQuery, null);
        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Question quest = new Question();
                quest.setID(cursor.getInt(0));
                quest.setQUESTION(cursor.getString(1));
                quest.setANSWER(cursor.getString(2));
                quest.setOPTA(cursor.getString(3));
                quest.setOPTB(cursor.getString(4));
                quest.setOPTC(cursor.getString(5));
                quesList.add(quest);
            }
            while (cursor.moveToNext());
            Collections.shuffle(quesList);
        }
        // return quest list
        return quesList;
    }
    public int rowcount()
    {
        int row=0;
        String selectQuery = "SELECT  * FROM " + TABLE_QUEST;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        row=cursor.getCount();
        return row;
    }
}

