package ingressive.tutorial.com.hubmembersapp.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MemeberListDBHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "memberlist.db";
    private static final int DATABASE_VERSION = 1;

    public MemeberListDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        final String SQL_CREATE_MEMBERS_TABLE = "CREATE TABLE " + HubMemebersContract.MembersEntry.TABLE_NAME + " (" +
                HubMemebersContract.MembersEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                HubMemebersContract.MembersEntry.COLUMN_FULL_NAME + " TEXT NOT NULL, " +
                HubMemebersContract.MembersEntry.COLUMN_EMAIL + " TEXT NOT NULL, " +
                HubMemebersContract.MembersEntry.COLUMN_PHONE + " INTEGER NOT NULL," +
                HubMemebersContract.MembersEntry.COULUMN_DESCRIPTION + "TEXT NOT NULL," +
                HubMemebersContract.MembersEntry.COULUM_SEX + "TEXT NOT NULL" +
                "); ";

        // COMPLETED (7) Execute the query by calling execSQL on sqLiteDatabase and pass the string query SQL_CREATE_WAITLIST_TABLE
        sqLiteDatabase.execSQL(SQL_CREATE_MEMBERS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + HubMemebersContract.MembersEntry.TABLE_NAME);
    }
}
