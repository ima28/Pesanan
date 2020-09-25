package com.example.pesan.Activity;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferencesLogin { public static final String PENILAIAN_MAHASISWA="penilaian_mahasiswa";
    public  static final String Sudah_Login= "sudahLogin";
    public static final String Email="email_user";
    public static final String Pass="password_user";

    SharedPreferences sp;
    SharedPreferences.Editor spEditor;

    public SharedPreferencesLogin(Context context){
        sp = context.getSharedPreferences(PENILAIAN_MAHASISWA, Context.MODE_PRIVATE);
        spEditor = sp.edit();
    }
    public boolean getsudahLogin() {
        return sp.getBoolean(Sudah_Login,false);
    }

    public void setsudahLogin(String keySP, boolean b) {
        spEditor.putBoolean(keySP,b);
        spEditor.commit();
    }
    public void setemail(String keySP, String email) {
        spEditor.putString(keySP,email);
        spEditor.commit();
    }
    public void setpasswod(String keySP, String password) {
        spEditor.putString(keySP,password);
        spEditor.commit();
    }

    public String getemail() {
        return sp.getString(Email,"");
    }
    public String getpassword() {
        return sp.getString(Pass,"");
    }
}

