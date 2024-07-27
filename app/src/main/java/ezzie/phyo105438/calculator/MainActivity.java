package ezzie.phyo105438.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import ezzie.phyo105438.calculator.databinding.ActivityBlueBinding;
import ezzie.phyo105438.calculator.databinding.ActivityRedBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityRedBinding redBinding;
    private ActivityBlueBinding blueBinding;

    List<String> operator = new ArrayList<>();
    List<Integer> intNum= new ArrayList<>();
    List<Double> douNum = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        blueBinding = ActivityBlueBinding.inflate(getLayoutInflater());
        redBinding = ActivityRedBinding.inflate(getLayoutInflater());
        setContentView(blueBinding.getRoot());

    }

    //On Number Clicked Btn
    public void onNumberClicked(View view){
        Button numberBtn = (Button) view;
        String text = numberBtn.getText().toString();
        String input = blueBinding.etCalculate.getText().toString();
        if(input.equals("0") | input.equals("00")){
            blueBinding.etCalculate.setText(text);
        }
        else{
            blueBinding.etCalculate.append(text);
        }
    }

    public void onOperatorClicked(View view){
        Button operatorBtn = (Button) view;
        String operator = operatorBtn.getText().toString();
    }
}