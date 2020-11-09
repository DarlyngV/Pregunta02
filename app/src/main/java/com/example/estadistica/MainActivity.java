package com.example.estadistica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new EjemploView(this));
    }

    public class EjemploView extends View {
        public EjemploView (Context context) {
            super(context);
        }
        @Override
        protected void onDraw(Canvas canvas) {
            Paint pincel = new Paint();
            Paint pincelTexto = new Paint();
            Paint pincelPlano = new Paint();
            Paint pincelTexto2 = new Paint();
            pincelPlano.setColor(Color.BLACK);
            pincelTexto.setColor(Color.BLACK);
            pincelTexto2.setColor(Color.BLACK);
            pincel.setColor(Color.GREEN);
            pincel.setStrokeWidth(8);
            pincel.setStyle(Paint.Style.STROKE);
            //canvas.line(150, 150, 100, pincel);
            int[] horas= {5,2,3,0,3,2,4};

            canvas.drawLine(10,convert(horas[0]),100, convert(horas[1]),pincel);/* 5 horas*/
            canvas.drawText(Integer.toString(horas[0]),10,convert(horas[0]),pincelTexto);
            canvas.drawLine(100,convert(horas[1]),150, convert(horas[2]),pincel);
            canvas.drawText(Integer.toString((horas[1])),100, convert(horas[1]),pincelTexto);
            canvas.drawLine(150,convert(horas[2]),250, convert(horas[3]),pincel);
            canvas.drawText(Integer.toString((horas[2])),150, convert(horas[2]),pincelTexto);
            canvas.drawLine(250,convert(horas[3]),350, convert(horas[4]),pincel);
            canvas.drawText(Integer.toString((horas[3])),250, convert(horas[3]),pincelTexto);
            canvas.drawLine(350,convert(horas[4]),450, convert(horas[5]),pincel);
            canvas.drawText(Integer.toString((horas[4])),350, convert(horas[4]),pincelTexto);
            canvas.drawLine(450,convert(horas[5]),550, convert(horas[6]),pincel);
            canvas.drawText(Integer.toString((horas[5])),450, convert(horas[5]),pincelTexto);
            canvas.drawText(Integer.toString((horas[6])),550, convert(horas[6]),pincelTexto);

            canvas.drawLine(10,150,600, 150,pincelPlano);
            canvas.drawLine(10,200,600, 200,pincelPlano);
            canvas.drawLine(10,250,600, 250,pincelPlano);
            canvas.drawLine(10,300,600, 300,pincelPlano);
            canvas.drawLine(10,350,600, 350,pincelPlano);
            canvas.drawLine(10,400,600, 400,pincelPlano);
            canvas.drawText("Dia 1",10,410,pincelTexto);
            canvas.drawText("Dia 2",100,410,pincelTexto);
            canvas.drawText("Dia 3",150,410,pincelTexto);
            canvas.drawText("Dia 4",250,410,pincelTexto);
            canvas.drawText("Dia 5",350,410,pincelTexto);
            canvas.drawText("Dia 6",450,410,pincelTexto);
            canvas.drawText("Dia 7  ",550,410,pincelTexto);



            /*Path  trazo = new Path();
            trazo.moveTo(10, 10);
            //trazo.cubicTo(60,70, 150,90, 200,110);
            trazo.lineTo(10,300);
            canvas.drawColor(Color.WHITE);

            Paint pincel3 = new Paint();
            pincel.setColor(Color.BLUE);
            pincel.setStrokeWidth(8);
            pincel.setStyle(Paint.Style.STROKE);

            canvas.drawPath(trazo, pincel);
            pincel.setStrokeWidth(1);
            pincel.setStyle(Paint.Style.FILL);
            pincel.setTextSize(20);
            pincel.setTypeface(Typeface.SANS_SERIF);
           canvas.drawTextOnPath("Kilometros", trazo, 10, 40, pincel3);*/
        }
        public int  convert(int horas){
            return (400-horas*50);
        }
    }
}