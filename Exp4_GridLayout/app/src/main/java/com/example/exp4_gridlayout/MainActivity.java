package com.example.exp4_gridlayout;
import android.os.Bundle;
import android.widget.GridView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView coursesGV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coursesGV = findViewById(R.id.idGVcourses);
        ArrayList<GoogleApps> googleAppsArrayList = new ArrayList<GoogleApps>();

        googleAppsArrayList.add(new GoogleApps("Google", R.drawable.ab));
        googleAppsArrayList.add(new GoogleApps("Drive", R.drawable.gd));
        googleAppsArrayList.add(new GoogleApps("Map", R.drawable.gm));
        googleAppsArrayList.add(new GoogleApps("Meet", R.drawable.gmeet));
        googleAppsArrayList.add(new GoogleApps("Photos", R.drawable.gp));
        googleAppsArrayList.add(new GoogleApps("YouTube", R.drawable.yt));

        CourseGVAdapter adapter = new CourseGVAdapter(this, googleAppsArrayList);
        coursesGV.setAdapter(adapter);
    }
}
