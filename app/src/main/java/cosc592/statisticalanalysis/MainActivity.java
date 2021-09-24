package cosc592.statisticalanalysis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

      private EditText innumber;
      private TextView Vtotal;
      private Button sumB, meanB, medianB, stdvB, maxB, minB;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate( savedInstanceState );
            setContentView( R.layout.activity_main );

            innumber = findViewById(R.id.inNumber);
            meanB = findViewById(R.id.meanBut);
            sumB = findViewById(R.id.sumBut);
            stdvB = findViewById(R.id.stdvBut);
            medianB = findViewById(R.id.medianBut);
            maxB = findViewById(R.id.maxBut);
            minB = findViewById(R.id.minBut);
            Vtotal = findViewById(R.id.outTotal);

            meanB.setOnClickListener(this);
            sumB.setOnClickListener(this);
            stdvB.setOnClickListener(this);
            medianB.setOnClickListener(this);
            maxB.setOnClickListener(this);
            minB.setOnClickListener(this);
            Vtotal.setOnClickListener(this);}
        @Override

        public void onClick(View v) {
           switch (v.getId()) {
            case R.id.maxBut:
            String numberMax = innumber.getText().toString();
            if (numberMax.isEmpty()) {
            Toast.makeText(this, "number is Empty", Toast.LENGTH_SHORT).show();
            } else {

            int Median = Calculator.Max(numberMax);
            Vtotal.setText("Sum is:" + Median + ""); }
               break;

           case R.id.minBut:
           String numberMin = innumber.getText().toString();
           if (numberMin.isEmpty()) {
           Toast.makeText(this, "number is Empty", Toast.LENGTH_SHORT).show();
           } else {

           int Median = Calculator.Min(numberMin);
           Vtotal.setText("Sum is:" + Median + ""); }
            break;

             case R.id.sumBut:
            String numbersum = innumber.getText().toString();
            if (numbersum.isEmpty()) {
            Toast.makeText(this, "number is Empty", Toast.LENGTH_SHORT).show();
            } else {
            int numbersum2 = Calculator.Sum(numbersum);
            Vtotal.setText("Sum is:" + numbersum2 + ""); }
            break;

            case R.id.meanBut:
                String mean = innumber.getText().toString();
                if (mean.isEmpty()) {
                    Toast.makeText(this, "number is Empty", Toast.LENGTH_SHORT).show();
              } else {
               double x = Calculator.Mean(mean);
                Vtotal.setText("Sum is:" + x + ""); }
                break;
                case R.id.medianBut:
                    String numbermedian = innumber.getText().toString();
                    if (numbermedian.isEmpty()) {
                        Toast.makeText(this, "number is Empty", Toast.LENGTH_SHORT).show();
                    } else {
                        double Median = Calculator.Median(numbermedian);
                        Vtotal.setText("Sum is:" + Median + ""); }
                    break;

                    case R.id.stdvBut:
                        String numberStdv = innumber.getText().toString();
                        if (numberStdv.isEmpty()) {
                            Toast.makeText(this, "number is Empty", Toast.LENGTH_SHORT).show();
                        } else {
                            double x = Calculator.Stdv(numberStdv);
                            Vtotal.setText("Sum is:" + x + ""); }
                        break; }

}}