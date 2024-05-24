package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;

import com.example.calculatorapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @SuppressLint({"UseSwitchCompatOrMaterialCode", "NonConstantResourceId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.example.calculatorapp.databinding.ActivityMainBinding
                binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.btn1.setOnClickListener(view1 -> {
            int checkedButtonIndex = binding.radioGroup.getCheckedRadioButtonId();
            int checkedButtonIndex2 = binding.radioGroup2.getCheckedRadioButtonId();

            double result = 0.0;
            binding.resultText.setText("Result");
            if (binding.inputText.getText().length() != 0) {
                double inputValue = Double.parseDouble(binding.inputText.getText().toString());

                switch(checkedButtonIndex) {
                    case R.id.bitRadioButton:
                        switch (checkedButtonIndex2) {
                            case R.id.bitRadioButton2:
                                result += inputValue;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.KbitRadioButton2:
                                result = inputValue / 1024;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.MbitRadioButton2:
                                result = inputValue / 1048576;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.GbitRadioButton2:
                                result = inputValue / 1073741824;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.ByteRadioButton2:
                                result = inputValue / 8;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.KBRadioButton2:
                                result = inputValue / 8192;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.MBRadioButton2:
                                result = inputValue / 8388608;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.GBRadioButton2:
                                result = inputValue / 8589934592L;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.TBRadioButton2:
                                result = inputValue / 8796093022208L;
                                binding.resultText2.setText("" + result);
                                break;
                        }
                        break;
                    case R.id.KbitRadioButton:
                        switch (checkedButtonIndex2) {
                            case R.id.bitRadioButton2:
                                result = inputValue * 1024;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.KbitRadioButton2:
                                result += inputValue;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.MbitRadioButton2:
                                result = inputValue / 1024;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.GbitRadioButton2:
                                result = inputValue / 1048576;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.ByteRadioButton2:
                                result = inputValue * 128;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.KBRadioButton2:
                                result = inputValue * 0.125;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.MBRadioButton2:
                                result = inputValue / 8192;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.GBRadioButton2:
                                result = inputValue / 8388608;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.TBRadioButton2:
                                result = inputValue / 8589934592L;
                                binding.resultText2.setText("" + result);
                                break;
                        }
                        break;
                    case R.id.MbitRadioButton:
                        switch (checkedButtonIndex2) {
                            case R.id.bitRadioButton2:
                                result = inputValue * 1048576;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.KbitRadioButton2:
                                result = inputValue * 1024;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.MbitRadioButton2:
                                result += inputValue;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.GbitRadioButton2:
                                result = inputValue / 1024;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.ByteRadioButton2:
                                result = inputValue * 131072;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.KBRadioButton2:
                                result = inputValue * 128;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.MBRadioButton2:
                                result = inputValue * 0.125;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.GBRadioButton2:
                                result = inputValue / 8192;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.TBRadioButton2:
                                result = inputValue / 8388608;
                                binding.resultText2.setText("" + result);
                                break;
                        }
                        break;
                    case R.id.GbitRadioButton:
                        switch (checkedButtonIndex2) {
                            case R.id.bitRadioButton2:
                                result = inputValue * 1073741824;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.KbitRadioButton2:
                                result = inputValue * 1048576;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.MbitRadioButton2:
                                result = inputValue * 1024;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.GbitRadioButton2:
                                result += inputValue;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.ByteRadioButton2:
                                result = inputValue * 134217728;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.KBRadioButton2:
                                result = inputValue * 131072;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.MBRadioButton2:
                                result = inputValue * 128;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.GBRadioButton2:
                                result = inputValue * 0.125;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.TBRadioButton2:
                                result = inputValue / 8192;
                                binding.resultText2.setText("" + result);
                                break;
                        }
                        break;
                    case R.id.ByteRadioButton:
                        switch (checkedButtonIndex2) {
                            case R.id.bitRadioButton2:
                                result = inputValue * 8;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.KbitRadioButton2:
                                result = inputValue / 128;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.MbitRadioButton2:
                                result = inputValue / 131072;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.GbitRadioButton2:
                                result = inputValue / 134217728;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.ByteRadioButton2:
                                result += inputValue;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.KBRadioButton2:
                                result = inputValue / 1024;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.MBRadioButton2:
                                result = inputValue / 1048576;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.GBRadioButton2:
                                result = inputValue / 1073741824;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.TBRadioButton2:
                                result = inputValue / 1099511627776L;
                                binding.resultText2.setText("" + result);
                                break;
                        }
                        break;
                    case R.id.KBRadioButton:
                        switch (checkedButtonIndex2) {
                            case R.id.bitRadioButton2:
                                result = inputValue * 8192;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.KbitRadioButton2:
                                result = inputValue * 8;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.MbitRadioButton2:
                                result = inputValue / 128;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.GbitRadioButton2:
                                result = inputValue / 131072;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.ByteRadioButton2:
                                result = inputValue * 1024;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.KBRadioButton2:
                                result += inputValue;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.MBRadioButton2:
                                result = inputValue / 1024;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.GBRadioButton2:
                                result = inputValue / 1048576;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.TBRadioButton2:
                                result = inputValue / 1073741824;
                                binding.resultText2.setText("" + result);
                                break;
                        }
                        break;
                    case R.id.MBRadioButton:
                        switch (checkedButtonIndex2) {
                            case R.id.bitRadioButton2:
                                result = inputValue * 8388608;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.KbitRadioButton2:
                                result = inputValue * 8192;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.MbitRadioButton2:
                                result = inputValue * 8;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.GbitRadioButton2:
                                result = inputValue / 128;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.ByteRadioButton2:
                                result = inputValue * 1048576;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.KBRadioButton2:
                                result = inputValue * 1024;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.MBRadioButton2:
                                result += inputValue;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.GBRadioButton2:
                                result = inputValue / 1024;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.TBRadioButton2:
                                result = inputValue / 1048576;
                                binding.resultText2.setText("" + result);
                                break;
                        }
                        break;
                    case R.id.GBRadioButton:
                        switch (checkedButtonIndex2) {
                            case R.id.bitRadioButton2:
                                result = inputValue * 8589934592L;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.KbitRadioButton2:
                                result = inputValue * 8388608;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.MbitRadioButton2:
                                result = inputValue * 8192;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.GbitRadioButton2:
                                result = inputValue * 8;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.ByteRadioButton2:
                                result = inputValue * 1073741824;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.KBRadioButton2:
                                result = inputValue * 1048576;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.MBRadioButton2:
                                result = inputValue * 1024;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.GBRadioButton2:
                                result += inputValue;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.TBRadioButton2:
                                result = inputValue / 1024;
                                binding.resultText2.setText("" + result);
                                break;
                        }
                        break;
                    case R.id.TBRadioButton:
                        switch (checkedButtonIndex2) {
                            case R.id.bitRadioButton2:
                                result = inputValue * 8796093022208L;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.KbitRadioButton2:
                                result = inputValue * 8589934592L;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.MbitRadioButton2:
                                result = inputValue * 8388608;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.GbitRadioButton2:
                                result = inputValue * 8192;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.ByteRadioButton2:
                                result = inputValue * 1099511627776L;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.KBRadioButton2:
                                result = inputValue * 1073741824;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.MBRadioButton2:
                                result = inputValue * 1048576;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.GBRadioButton2:
                                result = inputValue * 1024;
                                binding.resultText2.setText("" + result);
                                break;
                            case R.id.TBRadioButton2:
                                result += inputValue;
                                binding.resultText2.setText("" + result);
                                break;
                        }
                        break;
                    default:
                        binding.resultText2.setText("Error!");
                        break;
                }
            } else {
                binding.resultText.setText("Enter");
                binding.resultText2.setText("Value!");
            }
        });

        binding.aboutApp.setOnClickListener(view1 -> {
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        });

        binding.switch1.setOnCheckedChangeListener((compoundButton, isChecked) -> {
            if(isChecked) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
            }
        });


        binding.boldCheckBox.setOnCheckedChangeListener((compoundButton, isChecked) -> {
            if (isChecked) {
                if (binding.italicCheckBox.isChecked()) {
                    binding.resultText2.setTypeface(null, Typeface.BOLD_ITALIC);
                } else {
                    binding.resultText2.setTypeface(null, Typeface.BOLD);
                }

            } else {
                if (binding.italicCheckBox.isChecked()) {
                    binding.resultText2.setTypeface(null, Typeface.ITALIC);
                } else {
                    binding.resultText2.setTypeface(null, Typeface.NORMAL);
                }
            }
        });
        binding.italicCheckBox.setOnCheckedChangeListener((compoundButton, isChecked) -> {
            if (isChecked) {
                if (binding.boldCheckBox.isChecked()) {
                    binding.resultText2.setTypeface(null, Typeface.BOLD_ITALIC);
                } else {
                    binding.resultText2.setTypeface(null, Typeface.ITALIC);
                }
            } else {
                if (binding.boldCheckBox.isChecked()) {
                    binding.resultText2.setTypeface(null, Typeface.BOLD);
                } else {
                    binding.resultText2.setTypeface(null, Typeface.NORMAL);
                }
            }
        });
    }
}