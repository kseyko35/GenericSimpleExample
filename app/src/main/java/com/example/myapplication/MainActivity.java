package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Document<String> name=new Document<>();
        name.addDocument("seyfi");

        Document<Integer> tcNumber=new Document<>();
        tcNumber.addDocument(1123332);

        ArrayList<String> nameList=name.getDocument();
        ArrayList<Integer> tcNumberList=tcNumber.getDocument();

        for (int i=0;i<nameList.size();i++){
            Toast.makeText(this,nameList.get(i) + " -> " + tcNumberList.get(i),Toast.LENGTH_SHORT).show();
        }



    }
    public class Document<T>{
        private ArrayList<T> document=new ArrayList<>();


        public void addDocument(T eleman){
            this.document.add(eleman);
        }
        public ArrayList<T>  getDocument(){
            return this.document;
        }
    }


}


