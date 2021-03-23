package blooddonation.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import blooddonation.com.databinding.ActivitySignUpPage8Binding;

public class SignUpPage8 extends AppCompatActivity {

    ActivitySignUpPage8Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySignUpPage8Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.singnUp8NextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentmain=new Intent(SignUpPage8.this,MainActivity.class);
                startActivity(intentmain);
            }
        });
    }
}