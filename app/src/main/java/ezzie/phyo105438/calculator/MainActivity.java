package ezzie.phyo105438.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import ezzie.phyo105438.calculator.databinding.ActivityBlueBinding;
import ezzie.phyo105438.calculator.databinding.ActivityRedBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityRedBinding redBinding;
    private ActivityBlueBinding blueBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        blueBinding = ActivityBlueBinding.inflate(getLayoutInflater());
        redBinding = ActivityRedBinding.inflate(getLayoutInflater());
        setContentView(blueBinding.getRoot());

    }

    //On Number Clicked Btn
    public void OnNumberClicked(View view){
        Button btn = (Button) view;
        String text = btn.getText().toString();
        blueBinding.etCalculate.setText(text);
    }
}