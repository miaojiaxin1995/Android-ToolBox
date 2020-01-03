package club.hellomiao.toolmiao.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import club.hellomiao.toolmiao.R;
import club.hellomiao.toolmiao.Utils;

/**
 * @author MiaoJiaxin
 */
public class DiceActivity extends AppCompatActivity {

    private ImageView imageViewDice;
    private Button buttonRoll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice);
        uIInit();
    }

    @Override
    protected void onStart() {
        super.onStart();
        buttonRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int diceValue = Utils.generateRandomValue(1,6,1);
                switch (diceValue) {
                    case 1:
                        imageViewDice.setImageResource(R.mipmap.dice_1);
                        break;
                    case 2:
                        imageViewDice.setImageResource(R.mipmap.dice_2);
                        break;
                    case 3:
                        imageViewDice.setImageResource(R.mipmap.dice_3);
                        break;
                    case 4:
                        imageViewDice.setImageResource(R.mipmap.dice_4);
                        break;
                    case 5:
                        imageViewDice.setImageResource(R.mipmap.dice_5);
                        break;
                    case 6:
                        imageViewDice.setImageResource(R.mipmap.dice_6);
                        break;
                        default:
                            break;
                }

            }
        });
    }

    private void uIInit() {
        imageViewDice = findViewById(R.id.imageView_dice);
        buttonRoll = findViewById(R.id.button_roll);
    }


}
