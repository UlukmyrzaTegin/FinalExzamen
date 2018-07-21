package ulukmyrzategin.menu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
  private TextView mTextView;
  private EditText mEditText;
  private String testText;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    mTextView = findViewById(R.id.textView);
    mEditText = findViewById(R.id.etInput);
    if (savedInstanceState!= null){
      mEditText.setText(savedInstanceState.getString("text"));
    }
    mEditText.addTextChangedListener(mTextWatcher);

    Button btnShow = findViewById(R.id.btnShow);
    btnShow.setOnClickListener(this);
  }


  TextWatcher mTextWatcher = new TextWatcher() {
    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable editable) {
      if (editable != null){
        mTextView.setText(editable.toString());
        testText = editable.toString();
      }

    }
  };

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.main_menu, menu);
    return super.onCreateOptionsMenu(menu);
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    int id = item.getItemId();

    TextView heardView = (TextView) findViewById(R.id.header);
    switch (id) {
      case R.id.action_settings:
        heardView.setText("Настройки");
        break;
      case R.id.save_settings:
        heardView.setText("Последний список");
        break;
    }
    return super.onOptionsItemSelected(item);
  }

  @Override
  public void onClick(View view) {
    Intent intent = new Intent();
    //intent.putExtra();
  }
}
