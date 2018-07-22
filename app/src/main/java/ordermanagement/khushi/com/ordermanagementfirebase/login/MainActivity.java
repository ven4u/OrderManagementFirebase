package ordermanagement.khushi.com.ordermanagementfirebase.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ordermanagement.khushi.com.ordermanagementfirebase.LaunchActivity;
import ordermanagement.khushi.com.ordermanagementfirebase.R;
import ordermanagement.khushi.com.ordermanagementfirebase.login.LoginActivity;
import ordermanagement.khushi.com.ordermanagementfirebase.utility.SavedPreference;

public class MainActivity extends AppCompatActivity {
    String LOGIN = "LOGIN";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SavedPreference savedPreference = new SavedPreference(this);

        if(!savedPreference.getBool(SavedPreference.LOGIN))
        {
            Intent intent = new Intent(this,LoginActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            finish();
            startActivity(intent);
        }else
        {
            Intent intent = new Intent(this,LaunchActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            finish();
            startActivity(intent);
        }
    }
}
