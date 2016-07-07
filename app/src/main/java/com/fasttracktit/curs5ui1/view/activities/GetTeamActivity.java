package com.fasttracktit.curs5ui1.view.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import com.fasttracktit.curs5ui1.R;

/**
 * @author mihai.mecea
 */
public class GetTeamActivity extends AppCompatActivity {

  private static final String TAG = "GetTeamActivity";
  public static final String STRING_EXTRA_KEY = "STRING_EXTRA_KEY";

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    setContentView(R.layout.get_team_activity);

    findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        EditText editText = (EditText) findViewById(R.id.editText);

        String teamName = editText.getText().toString();

        if (!teamName.isEmpty()) {
          Intent intent = new Intent();
          intent.putExtra(STRING_EXTRA_KEY, teamName);

          setResult(RESULT_OK, intent);

          finish();
        } else {
          setResult(RESULT_CANCELED);

          finish();
        }
      }
    });
  }

}
