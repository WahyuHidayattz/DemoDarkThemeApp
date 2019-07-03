package demo.darktheme;

import android.content.*;
import android.preference.*;

public class Theme
{
    private static SharedPreferences pref;
    private static SharedPreferences.Editor editor;

    public static void createTheme(Context context)
    {
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        int theme = pref.getInt("theme_app", 0);
        switch (theme) {
            case 0:
                context.setTheme(R.style.ThemeLight);
                break;

            case 1:
                context.setTheme(R.style.ThemeDark);
                break;
        }
    }

    public static boolean isThemeLight(Context context)
    {
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        return pref.getBoolean("is_theme_light", true);
    }

    public static void setTheme(Context context, boolean isLight, int theme)
    {
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        editor = pref.edit();
        editor.putBoolean("is_theme_light", isLight);
        editor.putInt("theme_app", theme);
        editor.commit();
    }
}
