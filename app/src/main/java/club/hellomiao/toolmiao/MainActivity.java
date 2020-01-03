package club.hellomiao.toolmiao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import club.hellomiao.toolmiao.dice.DiceActivity;

/**
 * @author MiaoJiaxin
 */
public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    private ListView mListView;
    private String[] functionName = new String[] {"关于我","掷骰子","生成随机数"};
    /***
     * 0:关于我
     * 1:掷骰子
     * 2:生成随机数
     */
    private Context thisContext = MainActivity.this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uIInit();
    }

    @Override
    protected void onStart() {
        super.onStart();
        mListView.setOnItemClickListener(this);
    }

    private void uIInit() {
        mListView = findViewById(R.id.mainListView);

        //初始化ListView
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,functionName);
        mListView.setAdapter(arrayAdapter);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        switch (position) {
            case 0 :
                //关于我
                Intent intentAboutMe = new Intent(thisContext, AboutMeActivity.class);
                thisContext.startActivity(intentAboutMe);
                break;
            case 1:
                //掷骰子
                Intent intentDice = new Intent(thisContext, DiceActivity.class);
                thisContext.startActivity(intentDice);
                break;
            case 2:
                //生成随机数
                Toast.makeText(this,"该功能待开发..."+position,Toast.LENGTH_SHORT).show();

             default:
                 break;
        }

    }
}
