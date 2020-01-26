package id.ac.poliban.mi.yusfan.listtari;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

        private List<Dance> dance = new ArrayList<>();
        private ListView lvDance;
        private BaseAdapter adapter;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            lvDance = findViewById(R.id.listview);

            dance.addAll(DanceData.getAllDance());

            adapter = new DanceAdapter(dance);

            lvDance.setAdapter(adapter);

            lvDance.setOnItemClickListener((parent, view, position, id) -> {
                new AlertDialog.Builder(this)
                        .setTitle("Tari yang anda pilih")
                        .setMessage(dance.get(position).toString())
                        .setPositiveButton("OK", null).show();
            });
        }
    }

