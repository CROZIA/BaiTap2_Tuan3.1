package com.example.student.baitap2_tuan31contextmenu;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button btnShowContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShowContext = (Button)findViewById(R.id.button_Show);
        registerForContextMenu(btnShowContext);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View view, ContextMenu.ContextMenuInfo menuInfo) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.my_menu,menu);

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.item_Red:
                btnShowContext.setTextColor(getResources().getColor(R.color.clrred));
                break;
            case R.id.item_Green:
                btnShowContext.setTextColor(getResources().getColor(R.color.clrgreen));
                break;
            case R.id.item_Blue:
                btnShowContext.setTextColor(getResources().getColor(R.color.clrblue));
                break;
                default:
                    btnShowContext.setTextColor(getResources().getColor(R.color.clrred));
                    break;
        }
        return true;
    }
}
