package com.example.tempconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText txtF, txtC, txtKm, txtMile, txtKg, txtLb, txtLiter, txtGallon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtF = findViewById(R.id.txtF);
        txtC = findViewById(R.id.txtC);
        txtKm = findViewById(R.id.txtKm);
        txtMile = findViewById(R.id.txtMile);
        txtKg = findViewById(R.id.txtkg);
        txtLb = findViewById(R.id.txtlb);
        txtLiter = findViewById(R.id.txtLiter);
        txtGallon = findViewById(R.id.txtGallon);


        txtF.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strF = s.toString();
                Log.i("UnitConverter", "Value in txtF = " + strF);

                if (!txtF.isFocused()) return;
                if (strF.length() == 0) return;


                try {
                    double valF = Double.parseDouble(strF);
                    double valC = (valF - 32.0)*5/9;
                    String strC = Double.toString(valC);
                    Log.i("UnitConverter", "Value in txtC = " + strC);

                    MainActivity.this.txtC.setText(strC);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtKm.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strKm = s.toString();
                Log.i("UnitConverter", "Value in txtKm = " + strKm);

                if (!txtKm.isFocused()) return;
                if (strKm.length() == 0) return;

                try {
                    double valKm = Double.parseDouble(strKm);
                    double valMile = 0.621371 * valKm;
                    String strMile = Double.toString(valMile);
                    Log.i("UnitConverter", "Value in txtMile = " + strMile);

                    MainActivity.this.txtMile.setText(strMile);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtC.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strC = s.toString();
                Log.i("UnitConverter", "Value in txtC = " + strC);

                if (!txtC.isFocused()) return;
                if (strC.length() == 0) return;

                try {
                    double valC = Double.parseDouble(strC);
                    double valF = valC*9/5 + 32;
                    String strF = Double.toString(valF);
                    Log.i("UnitConverter", "Value in txtF = " + strF);

                    MainActivity.this.txtF.setText(strF);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtMile.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strMile = s.toString();
                Log.i("UnitConverter", "Value in txtMile = " + strMile);

                if (!txtMile.isFocused()) return;
                if (strMile.length() == 0) return;

                try {
                    double valMile = Double.parseDouble(strMile);
                    double valKm = valMile / 0.621371;
                    String strKm = Double.toString(valKm);
                    Log.i("UnitConverter", "Value in txtKm = " + strKm);

                    MainActivity.this.txtKm.setText(strKm);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtKg.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strKg = s.toString();
                Log.i("UnitConverter", "Value in strKg = " + strKg);

                if (!txtKg.isFocused()) return;
                if (strKg.length() == 0) return;

                try {
                    double valKg = Double.parseDouble(strKg);
                    double valLb = valKg * 2.20462;
                    String strLb = Double.toString(valLb);
                    Log.i("UnitConverter", "Value in strLb = " + strLb);

                    MainActivity.this.txtLb.setText(strLb);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtLb.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strLb = s.toString();
                Log.i("UnitConverter", "Value in txtLb = " + strLb);

                if (!txtLb.isFocused()) return;
                if (strLb.length() == 0) return;

                try {
                    double valLb = Double.parseDouble(strLb);
                    double valKg = valLb / 2.20462;
                    String strKg = Double.toString(valKg);
                    Log.i("UnitConverter", "Value in txtKg = " + strKg);

                    MainActivity.this.txtKg.setText(strKg);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtLiter.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strLiter = s.toString();
                Log.i("UnitConverter", "Value in txtLiter = " + strLiter);

                if (!txtLiter.isFocused()) return;
                if (strLiter.length() == 0) return;

                try {
                    double valLiter = Double.parseDouble(strLiter);
                    double valGallon = 0.264172 * valLiter;
                    String strGallon = Double.toString(valGallon);
                    Log.i("UnitConverter", "Value in txtGallon = " + strGallon);

                    MainActivity.this.txtGallon.setText(strGallon);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtGallon.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strGallon = s.toString();
                Log.i("UnitConverter", "Value in txtGallon = " + strGallon);

                if (!txtGallon.isFocused()) return;
                if (strGallon.length() == 0) return;

                try {
                    double valGallon = Double.parseDouble(strGallon);
                    double valLiter = valGallon / 0.264172;
                    String strLiter = Double.toString(valLiter);
                    Log.i("UnitConverter", "Value in txtLiter = " + strLiter);

                    MainActivity.this.txtLiter.setText(strLiter);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );


    }
}
