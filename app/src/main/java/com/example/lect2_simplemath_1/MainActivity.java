package com.example.lect2_simplemath_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtOp1;
    private EditText edtOp2;
    private Button btnCalculate;
    private TextView tvAnswer;
    private RadioGroup groupRadio;
    private RadioButton Add;
    private RadioButton Sub;
    private RadioButton Mul;
    private RadioButton Div;
    private RadioButton Mod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      //  tvAnswer = new TextView(null);

       tvAnswer = (TextView) findViewById(R.id.tvAnswer);
       edtOp1 = (EditText) findViewById(R.id.edtOp1);
       edtOp2 = (EditText) findViewById(R.id.edtOp2);
       btnCalculate = (Button) findViewById(R.id.btnCalculate);
       groupRadio = (RadioGroup) findViewById(R.id.groupRadio);
       Add = (RadioButton) findViewById(R.id.Add);
       Sub = (RadioButton) findViewById(R.id.Sub);
       Mul = (RadioButton) findViewById(R.id.Mul);
       Div = (RadioButton) findViewById(R.id.Div);
       Mod = (RadioButton) findViewById(R.id.Mod);

       groupRadio.clearCheck();

       groupRadio.setOnCheckedChangeListener(
               new RadioGroup.OnCheckedChangeListener() {
                   @Override
                   public void onCheckedChanged(RadioGroup group, int checkedId) {
                       RadioButton radioButton = (RadioButton) group.findViewById(checkedId);
                   }
               }
       );

       btnCalculate.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               int selectedId = groupRadio.getCheckedRadioButtonId();
               if (selectedId == -1) {
                   Toast.makeText(MainActivity.this, "Please select operator", Toast.LENGTH_SHORT).show();
               }
               else {
                   RadioButton radioButton = (RadioButton) groupRadio.findViewById(selectedId);

                   if (radioButton == Add) {
                       try {
                           Double.parseDouble(edtOp1.getText().toString());
                       } catch (NullPointerException e) {
                           Toast.makeText(MainActivity.this, "Please enter first number", Toast.LENGTH_SHORT).show();
                       }
                       try {
                           Double.parseDouble(edtOp1.getText().toString());
                       } catch (NumberFormatException e) {
                           Toast.makeText(MainActivity.this, "Please enter float or integer as an input", Toast.LENGTH_SHORT).show();
                       }
                       try {
                           Double.parseDouble(edtOp2.getText().toString());
                       } catch (NullPointerException e) {
                           Toast.makeText(MainActivity.this, "Please enter second number", Toast.LENGTH_SHORT).show();
                       }
                       try {
                           Double.parseDouble(edtOp2.getText().toString());
                       } catch (NumberFormatException e) {
                           Toast.makeText(MainActivity.this, "Please enter float or integer as an input", Toast.LENGTH_SHORT).show();
                       }
                       Double result;
                       result = Double.parseDouble(edtOp1.getText().toString()) + Double.parseDouble(edtOp2.getText().toString());
                       tvAnswer.setText(result.toString());
                   }

                   else if (radioButton == Sub){
                       try {
                           Double.parseDouble(edtOp1.getText().toString());
                       } catch (NullPointerException e) {
                           Toast.makeText(MainActivity.this, "Please enter first number", Toast.LENGTH_SHORT).show();
                       }
                       try {
                           Double.parseDouble(edtOp1.getText().toString());
                       } catch (NumberFormatException e) {
                           Toast.makeText(MainActivity.this, "Please enter float or integer as an input", Toast.LENGTH_SHORT).show();
                       }
                       try {
                           Double.parseDouble(edtOp2.getText().toString());
                       } catch (NullPointerException e) {
                           Toast.makeText(MainActivity.this, "Please enter second number", Toast.LENGTH_SHORT).show();
                       }
                       try {
                           Double.parseDouble(edtOp2.getText().toString());
                       } catch (NumberFormatException e) {
                           Toast.makeText(MainActivity.this, "Please enter float or integer as an input", Toast.LENGTH_SHORT).show();
                       }
                       Double result;
                       result = Double.parseDouble(edtOp1.getText().toString()) - Double.parseDouble(edtOp2.getText().toString());
                       tvAnswer.setText(result.toString());
                   }

                   else if (radioButton == Mul) {
                       try {
                           Double.parseDouble(edtOp1.getText().toString());
                       } catch (NullPointerException e) {
                           Toast.makeText(MainActivity.this, "Please enter first number", Toast.LENGTH_SHORT).show();
                       }
                       try {
                           Double.parseDouble(edtOp1.getText().toString());
                       } catch (NumberFormatException e) {
                           Toast.makeText(MainActivity.this, "Please enter float or integer as an input", Toast.LENGTH_SHORT).show();
                       }
                       try {
                           Double.parseDouble(edtOp2.getText().toString());
                       } catch (NullPointerException e) {
                           Toast.makeText(MainActivity.this, "Please enter second number", Toast.LENGTH_SHORT).show();
                       }
                       try {
                           Double.parseDouble(edtOp2.getText().toString());
                       } catch (NumberFormatException e) {
                           Toast.makeText(MainActivity.this, "Please enter float or integer as an input", Toast.LENGTH_SHORT).show();
                       }
                       Double result;
                       result = Double.parseDouble(edtOp1.getText().toString()) * Double.parseDouble(edtOp2.getText().toString());
                       tvAnswer.setText(result.toString());
                   }

                   else if (radioButton == Div) {
                       try {
                           Double.parseDouble(edtOp1.getText().toString());
                       } catch (NullPointerException e) {
                           Toast.makeText(MainActivity.this, "Please enter first number", Toast.LENGTH_SHORT).show();
                       }
                       try {
                           Double.parseDouble(edtOp1.getText().toString());
                       } catch (NumberFormatException e) {
                           Toast.makeText(MainActivity.this, "Please enter float or integer as an input", Toast.LENGTH_SHORT).show();
                       }
                       try {
                           Double.parseDouble(edtOp2.getText().toString());
                       } catch (NullPointerException e) {
                           Toast.makeText(MainActivity.this, "Please enter second number", Toast.LENGTH_SHORT).show();
                       }
                       try {
                           Double.parseDouble(edtOp2.getText().toString());
                       } catch (NumberFormatException e) {
                           Toast.makeText(MainActivity.this, "Please enter float or integer as an input", Toast.LENGTH_SHORT).show();
                       }
                       if (Double.parseDouble(edtOp2.getText().toString()) == 0.0) {
                           Toast.makeText(MainActivity.this, "Cannot be divided by 0", Toast.LENGTH_SHORT).show();
                       }
                       Double result;
                       result = Double.parseDouble(edtOp1.getText().toString()) / Double.parseDouble(edtOp2.getText().toString());
                       tvAnswer.setText(result.toString());
                   }

                   else if (radioButton == Mod) {
                       try {
                           Double.parseDouble(edtOp1.getText().toString());
                       } catch (NullPointerException e) {
                           Toast.makeText(MainActivity.this, "Please enter first number", Toast.LENGTH_SHORT).show();
                       }
                       try {
                           Double.parseDouble(edtOp1.getText().toString());
                       } catch (NumberFormatException e) {
                           Toast.makeText(MainActivity.this, "Please enter float or integer as an input", Toast.LENGTH_SHORT).show();
                       }
                       try {
                           Double.parseDouble(edtOp2.getText().toString());
                       } catch (NullPointerException e) {
                           Toast.makeText(MainActivity.this, "Please enter second number", Toast.LENGTH_SHORT).show();
                       }
                       try {
                           Double.parseDouble(edtOp2.getText().toString());
                       } catch (NumberFormatException e) {
                           Toast.makeText(MainActivity.this, "Please enter float or integer as an input", Toast.LENGTH_SHORT).show();
                       }
                       if (Double.parseDouble(edtOp2.getText().toString()) == 0.0) {
                           Toast.makeText(MainActivity.this, "Cannot be divided by 0", Toast.LENGTH_SHORT).show();
                       }
                       Double result;
                       result = Double.parseDouble(edtOp1.getText().toString()) % Double.parseDouble(edtOp2.getText().toString());
                       tvAnswer.setText(result.toString());
                   }
               }





           }
       });

//btnCalculate.setOnClickListener(new View.OnClickListener() {
//    @Override
//    public void onClick(View view) {
//        Double result;
//        result = Double.parseDouble(edtOp1.getText().toString()) +
//                 Double.parseDouble(edtOp2.getText().toString());
//        tvAnswer.setText(result.toString());
//    }
//});
//
//btnCalculate.setOnLongClickListener(new View.OnLongClickListener() {
//    @Override
//    public boolean onLongClick(View view) {
//        Double result;
//        result = Double.parseDouble(edtOp1.getText().toString()) -
//                Double.parseDouble(edtOp2.getText().toString());
//        tvAnswer.setText(result.toString());
//
//        return true;
//    }
//});
//
//    }
//
//    public void onClick(View view){
//        Double result;
//        result = Double.parseDouble(edtOp1.getText().toString()) +
//                 Double.parseDouble(edtOp2.getText().toString());
//        tvAnswer.setText(result.toString());
//    }
//
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//
//
    }
}