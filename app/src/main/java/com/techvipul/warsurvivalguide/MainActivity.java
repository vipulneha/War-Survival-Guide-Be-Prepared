package com.techvipul.warsurvivalguide;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
        } else {
            throw new IllegalStateException("Toolbar not found in layout");
        }

        RecyclerView recyclerView = findViewById(R.id.recycler_view_categories);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setAdapter(new CategoryAdapter(getCategories()));

        FloatingActionButton fab = findViewById(R.id.fab_quick_tips);
        fab.setOnClickListener(v -> {
            Intent intent = new Intent(this, SurvivalLessonsActivity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        });
    }

    private List<Category> getCategories() {
        List<Category> categories = new ArrayList<>();
        categories.add(new Category("Shelter", R.drawable.ic_shelter, SurvivalLessonsActivity.class));
        categories.add(new Category("Food & Water", R.drawable.ic_food_water, FoodAndWaterActivity.class));
        categories.add(new Category("Communication", R.drawable.ic_communication, CommunicationTipsActivity.class));
        categories.add(new Category("First Aid", R.drawable.ic_first_aid, EmergencyKitActivity.class));
        categories.add(new Category("Escape Plans", R.drawable.ic_escape, SafeZonesActivity.class));
        return categories;
    }
}