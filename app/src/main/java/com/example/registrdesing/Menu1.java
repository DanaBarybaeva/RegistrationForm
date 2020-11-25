package com.example.registrdesing;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class Menu1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.main_delete:
                Toast.makeText(this, "item 1 selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.main_refresh:
                Toast.makeText(this, "item 2 selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.main_settings:
                Toast.makeText(this, "item 3 selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.delete_all:
                Toast.makeText(this, "sub item 4 selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.delete_non_selected:
                Toast.makeText(this, "sub item 5 selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.delete_selected:
                Toast.makeText(this, "sub item 6 selected", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }


}