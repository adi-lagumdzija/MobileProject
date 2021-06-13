package com.example.mobileprojectpetshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PickAnimal extends AppCompatActivity {



    private Button dog;
    private Button cat;
    private Button bunny;
    private Button snake;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_animal);
        dog = findViewById(R.id.catbutton);
        cat = findViewById(R.id.catbutton);
        bunny = findViewById(R.id.bunnybutton);
        snake = findViewById(R.id.snakebutton);
    }
    public void openDogActivity(View view) {
        Intent intent = new Intent(this, DogActivity.class);
        startActivity(intent);
    }
    public void openCatActivity(View view) {
        Intent intent = new Intent(this, CatActivity.class);
        startActivity(intent);
    }
    public void openBunnyActivity(View view) {
        Intent intent = new Intent(this, BunnyActivity.class);
        startActivity(intent);
    }
    public void openSnakeActivity(View view) {
        Intent intent = new Intent(this, SnakeActivity.class);
        startActivity(intent);
    }
}