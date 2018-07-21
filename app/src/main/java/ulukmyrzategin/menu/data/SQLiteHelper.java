package ulukmyrzategin.menu.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLiteHelper extends SQLiteOpenHelper {

  private final static String DB_NAME = "Exzamen";
  private final static int DB_VERSION = 2;

  private final static String ID = "_id";
  private final static String ID_SHOW = "ID_SHOW";
  private final static String TABLE_SHOW = "TABLE_SHOW";


  public SQLiteHelper(Context context, String name,
      CursorFactory factory, int version) {
    super(context, name, factory, version);
  }

  @Override
  public void onCreate(SQLiteDatabase sqLiteDatabase) {

  }

  @Override
  public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

  }
}
