package com.example.logonrm.actionbar.actionbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return  true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                Toast.makeText(this, (String)"Item 1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item2:
                break;
            case  R.id.item3:
                break;
            case R.id.item4:
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
