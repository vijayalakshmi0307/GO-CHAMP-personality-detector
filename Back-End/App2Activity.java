/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.os.Bundle
 *  android.util.DisplayMetrics
 *  android.util.SparseBooleanArray
 *  android.util.TypedValue
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.Button
 *  android.widget.CheckBox
 *  android.widget.LinearLayout
 *  android.widget.ListView
 *  android.widget.TextView
 *  android.widget.Toast
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Deprecated
 *  java.lang.Double
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Random
 */
package com.my.newproject;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.my.newproject.App3Activity;
import com.my.newproject.R;
import java.util.ArrayList;
import java.util.Random;

public class App2Activity
extends Activity {
    private Button button1;
    private CheckBox checkbox1;
    private CheckBox checkbox2;
    private CheckBox checkbox3;
    private CheckBox checkbox4;
    private CheckBox checkbox5;
    private CheckBox checkbox6;
    private CheckBox checkbox7;
    private CheckBox checkbox8;
    private CheckBox checkbox9;
    private LinearLayout linear2;
    private LinearLayout linear3;
    private LinearLayout linear4;
    private LinearLayout linear5;
    private LinearLayout linear6;
    private LinearLayout linear7;
    private LinearLayout linear8;
    private Intent t = new Intent();
    private TextView textview1;
    private TextView textview2;
    private TextView textview3;
    private TextView textview4;

    private void initialize(Bundle bundle) {
        this.linear2 = (LinearLayout)this.findViewById(R.id.linear2);
        this.linear3 = (LinearLayout)this.findViewById(R.id.linear3);
        this.linear4 = (LinearLayout)this.findViewById(R.id.linear4);
        this.linear5 = (LinearLayout)this.findViewById(R.id.linear5);
        this.linear6 = (LinearLayout)this.findViewById(R.id.linear6);
        this.linear7 = (LinearLayout)this.findViewById(R.id.linear7);
        this.linear8 = (LinearLayout)this.findViewById(R.id.linear8);
        this.button1 = (Button)this.findViewById(R.id.button1);
        this.textview1 = (TextView)this.findViewById(R.id.textview1);
        this.textview2 = (TextView)this.findViewById(R.id.textview2);
        this.checkbox1 = (CheckBox)this.findViewById(R.id.checkbox1);
        this.checkbox2 = (CheckBox)this.findViewById(R.id.checkbox2);
        this.checkbox3 = (CheckBox)this.findViewById(R.id.checkbox3);
        this.textview3 = (TextView)this.findViewById(R.id.textview3);
        this.checkbox4 = (CheckBox)this.findViewById(R.id.checkbox4);
        this.checkbox5 = (CheckBox)this.findViewById(R.id.checkbox5);
        this.checkbox6 = (CheckBox)this.findViewById(R.id.checkbox6);
        this.textview4 = (TextView)this.findViewById(R.id.textview4);
        this.checkbox7 = (CheckBox)this.findViewById(R.id.checkbox7);
        this.checkbox8 = (CheckBox)this.findViewById(R.id.checkbox8);
        this.checkbox9 = (CheckBox)this.findViewById(R.id.checkbox9);
        this.button1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                App2Activity.this.t.setClass(App2Activity.this.getApplicationContext(), App3Activity.class);
                App2Activity.this.startActivity(App2Activity.this.t);
            }
        });
    }

    private void initializeLogic() {
    }

    @Deprecated
    public ArrayList<Double> getCheckedItemPositionsToArray(ListView listView) {
        ArrayList arrayList = new ArrayList();
        SparseBooleanArray sparseBooleanArray = listView.getCheckedItemPositions();
        int n = 0;
        while (n < sparseBooleanArray.size()) {
            if (sparseBooleanArray.valueAt(n)) {
                arrayList.add((Object)sparseBooleanArray.keyAt(n));
            }
            ++n;
        }
        return arrayList;
    }

    @Deprecated
    public float getDip(int n) {
        return TypedValue.applyDimension((int)1, (float)n, (DisplayMetrics)this.getResources().getDisplayMetrics());
    }

    @Deprecated
    public int getDisplayHeightPixels() {
        return this.getResources().getDisplayMetrics().heightPixels;
    }

    @Deprecated
    public int getDisplayWidthPixels() {
        return this.getResources().getDisplayMetrics().widthPixels;
    }

    @Deprecated
    public int getLocationX(View view) {
        int[] arrn = new int[2];
        view.getLocationInWindow(arrn);
        return arrn[0];
    }

    @Deprecated
    public int getLocationY(View view) {
        int[] arrn = new int[2];
        view.getLocationInWindow(arrn);
        return arrn[1];
    }

    @Deprecated
    public int getRandom(int n, int n2) {
        return n + new Random().nextInt(1 + (n2 - n));
    }

    protected void onActivityResult(int n, int n2, Intent intent) {
        super.onActivityResult(n, n2, intent);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(R.layout.app2);
        this.initialize(bundle);
        this.initializeLogic();
    }

    @Deprecated
    public void showMessage(String string2) {
        Toast.makeText((Context)this.getApplicationContext(), (CharSequence)string2, (int)0).show();
    }

}

