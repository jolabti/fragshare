package site.johannainggolan.fragshare.Utilize;

import android.content.Context;
import android.content.SharedPreferences;

public class PrefsConf {

    private static PrefsConf instance;
    private SharedPreferences prefs;

    private PrefsConf(Context context){

        prefs = context.getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE);

    }

    public static PrefsConf getInstance(Context context){

        if(instance==null) instance = new PrefsConf(context);

        return instance;
    }

    public void putString(String key, String value) {
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value);
        editor.apply();
    }

    public void putStringCommit(String key, String value) {
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value);
        editor.commit();
    }

    public void remove(String key) {
        SharedPreferences.Editor editor = prefs.edit();
        editor.remove(key);
        editor.apply();
    }

    public String getString(String key, String defaultValue){
        return prefs.getString(key,defaultValue);
    }
}
