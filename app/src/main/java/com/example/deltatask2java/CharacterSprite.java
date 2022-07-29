package com.example.deltatask2java;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.DisplayMetrics;

public class CharacterSprite {

    private Bitmap image;
    public int x,y;
    public int yVelocity = 6;
    public int xVelocity = 5;

    public CharacterSprite(Bitmap bmp){
        image = bmp;
        x = 200;
        y = 420;
    }

    public void draw(Canvas canvas){
        canvas.drawBitmap(image, x, y, null);
    }

    public void update(){
        y += yVelocity;
    }
}
