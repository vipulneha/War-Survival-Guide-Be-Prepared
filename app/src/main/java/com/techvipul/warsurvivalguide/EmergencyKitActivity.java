package com.techvipul.warsurvivalguide;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class EmergencyKitActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_kit);

        Toolbar toolbar = findViewById(R.id.toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            if (getSupportActionBar() != null) {
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            }
        } else {
            throw new IllegalStateException("Toolbar not found in layout");
        }

        RecyclerView recyclerView = findViewById(R.id.recycler_view_kit);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new KitItemAdapter(getKitItems()));
    }

    private KitItem[] getKitItems() {
        return new KitItem[] {
                new KitItem("Flashlight", "Reliable light source for dark environments.", R.drawable.ic_flashlight),
                new KitItem("Radio", "Battery-powered for news and alerts.", R.drawable.ic_radio),
                new KitItem("Medicine", "Prescriptions and basic pain relief.", R.drawable.ic_medicine),
                new KitItem("Documents", "ID, passport, and critical papers.", R.drawable.ic_documents)
        };
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}