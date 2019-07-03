package demo.darktheme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        // create Theme in onCreate
        Theme.createTheme(this);

        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_theme, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId()) {

                // set theme 
            case R.id.menu_theme:
                if (Theme.isThemeLight(this)) {
                    Theme.setTheme(this, false, 1);
                    recreate();
                } else {
                    Theme.setTheme(this, true, 0);
                    recreate();
                }
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}
