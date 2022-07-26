package kr.hs.emirims2117.mirim_project_0726_01;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    EditText editAngle;
    ImageView imgV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editAngle=findViewById(R.id.edit_angle);
        imgV = findViewById(R.id.img);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);
        switch(item.getItemId()){
            case R.id.item_rotate:
                imgV.setRotation(Float.parseFloat(editAngle.getText().toString()));
                return true;

            case R.id.item1:
                imgV.setImageResource(R.drawable.dog);
                item.setChecked(true);
                return true;
            case R.id.item2:
                imgV.setImageResource(R.drawable.gksskqhd);
                item.setChecked(true);
                return true;
            case R.id.item3:
                imgV.setImageResource(R.drawable.ehfgkfmqkd);
                item.setChecked(true);
                return true;

        }
        return false;
    }
}
