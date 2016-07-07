package com.fasttracktit.curs5ui1;

import android.app.Application;
import android.util.Log;
import com.fasttracktit.curs5ui1.interfaces.DataProvider;

/**
 * @author mihai.mecea
 */
public class UI1Application extends Application implements DataProvider{

  private static final String TAG = "UI1Application";

  @Override
  public void onCreate() {
    super.onCreate();

    Log.d(TAG, "onCreate() called - aplication created");
  }

  @Override
  public String getStringData() {
    return "some date but it could be even our WeatherData refference";
  }

}
