package com.example.matrice_ui;

import android.content.res.Resources;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Gravity;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int convertDpToPixel(float dp) {
        DisplayMetrics metrics = Resources.getSystem().getDisplayMetrics();
        float px = dp * (metrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT);
        return (int) px;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout lMainLayout = (LinearLayout) this.findViewById(R.id.mainLinearLayout);

        //new TextView
        TextView welcome = new TextView(this);
        welcome.setText(R.string.welcom);
        welcome.setTextColor(Color.parseColor("#6e1b37"));
        welcome.setBackgroundColor(Color.parseColor("#ff4081"));
        welcome.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
        welcome.setPadding(convertDpToPixel(10),convertDpToPixel(5),convertDpToPixel(10),convertDpToPixel(5));

        LinearLayout.LayoutParams welcomeLayout =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT);
        welcomeLayout.setMargins(0, convertDpToPixel(10), 0, convertDpToPixel(10));

        welcome.setLayoutParams(welcomeLayout);

        lMainLayout.addView(welcome);

        //new checkbox
        CheckBox wilder = new CheckBox(this);
        wilder.setText(R.string.wilder);


        LinearLayout.LayoutParams wilderLayout =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.WRAP_CONTENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT);
        wilderLayout.gravity= Gravity.CENTER_HORIZONTAL;
        wilder.setLayoutParams(wilderLayout);
        lMainLayout.addView(wilder);

        //New layout in lMainLayout
        LinearLayout Layout2 = new LinearLayout(this);
        Layout2.setLayoutParams( new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        Layout2.setWeightSum(2);
        Layout2.setOrientation(LinearLayout.HORIZONTAL);
        lMainLayout.addView(Layout2);

        //new EditText
        EditText firstName = new EditText(this);
        firstName.setText(R.string.fname);

        LinearLayout.LayoutParams firstNameLayout =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT);
        firstNameLayout.weight = 1;
        firstName.setInputType(InputType.TYPE_TEXT_VARIATION_PERSON_NAME);
        firstName.setHint(R.string.fname);

        firstName.setLayoutParams(firstNameLayout); // ne pas oublier de mettre à jour les paramètres
        Layout2.addView(firstName); // puis de lui assigner son parent

        //space
        Space firstSpace = new Space(this);

        LinearLayout.LayoutParams firstSpaceLayout =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        0,
                        1
                );
        firstSpace.setLayoutParams(firstSpaceLayout);
        Layout2.addView(firstSpace);

        //nouveau layout
        LinearLayout Layout3 = new LinearLayout(this);
        Layout3.setLayoutParams( new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        Layout3.setWeightSum(2);
        Layout3.setOrientation(LinearLayout.HORIZONTAL);
        lMainLayout.addView(Layout3);

        //new EditText
        EditText lastName = new EditText(this);
        lastName.setText(R.string.lname);

        LinearLayout.LayoutParams lastNameLayout =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT);
        lastNameLayout.weight = 1;
        lastName.setInputType(InputType.TYPE_TEXT_VARIATION_PERSON_NAME);
        lastName.setHint(R.string.lname);

        lastName.setLayoutParams(lastNameLayout); // ne pas oublier de mettre à jour les paramètres
        Layout3.addView(lastName);

        //space
        Space secondSpace = new Space(this);

        LinearLayout.LayoutParams secondSpaceLayout =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        0,
                        1
                );
        secondSpace.setLayoutParams(secondSpaceLayout);
        Layout3.addView(secondSpace);

        //new button
        Button validate = new Button(this);
        validate.setText(R.string.validate);
        LinearLayout.LayoutParams validateLayout =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.WRAP_CONTENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT);
        validate.setLayoutParams(validateLayout);
        lMainLayout.addView(validate);

    }
}
