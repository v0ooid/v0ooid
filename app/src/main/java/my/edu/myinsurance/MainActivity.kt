package my.edu.myinsurance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import my.edu.myinsurance.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonCalculate.setOnClickListener{
            val age = binding.spinnerAge.selectedItemPosition
            val gender = binding.radioGroupGender.checkedRadioButtonId
            val smoker = binding.checkBoxSmoker.isChecked
            var premium = 0
            if (age == 0){
                premium += 60
            }else if (age == 1){
                premium += 70
            }else if (age == 2){
                premium += 90
            }else if (age == 3){
                premium += 120
            }else if (age == 4){
                premium += 150
            }else{
                premium += 150
            }

            if (gender == binding.radioButtonMale.id){
                if (age == 1){
                    premium += 50
                }else if (age == 2){
                    premium += 100
                }else if (age == 3){
                    premium += 200
                }else if (age == 4){
                    premium += 200
                }else{
                    premium += 200
                }
            }
            if (smoker){
                if (age == 1){
                    premium += 100
                }else if (age == 2){
                    premium += 150
                }else if (age == 3){
                    premium += 200
                }else if (age == 4){
                    premium += 250
                }else{
                    premium += 300
                }
            }
            //Display output
            binding.textViewPremium.text = String.format("RM %d", premium)
        }

        binding.buttonReset.setOnClickListener{

        }
    }
}