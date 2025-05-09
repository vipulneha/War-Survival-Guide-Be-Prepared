package com.techvipul.warsurvivalguide;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class FoodAndWaterActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_and_water);

        Toolbar toolbar = findViewById(R.id.toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            if (getSupportActionBar() != null) {
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            }
        } else {
            throw new IllegalStateException("Toolbar not found in layout");
        }

        RecyclerView recyclerView = findViewById(R.id.recycler_view_food_water);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new LessonAdapter(getFoodWaterTips()));
    }

    private String[] getFoodWaterTips() {
        return new String[] {
                getString(R.string.food_water_store_nonperishable),
                getString(R.string.food_water_rationing),
                getString(R.string.food_water_water_storage),
                getString(R.string.food_water_purify_boiling),
                getString(R.string.food_water_use_purification_tabs),
                getString(R.string.food_water_rain_collection),
                getString(R.string.food_water_use_filters),
                getString(R.string.food_water_stale_bread_tip),
                getString(R.string.food_water_solar_still),
                getString(R.string.food_water_safe_sources),
                getString(R.string.food_water_label_supplies),
                getString(R.string.food_water_dont_share_utensils),
                getString(R.string.food_water_hide_food),
                getString(R.string.food_water_barter_items),
                getString(R.string.food_water_energy_dense),
                getString(R.string.food_water_no_raw_meat),
                getString(R.string.food_water_preserve_meat),
                getString(R.string.food_water_forage_safe_plants),
                getString(R.string.food_water_root_storage),
                getString(R.string.food_water_dont_overeat),
                getString(R.string.food_water_cook_indoors_safely),
                getString(R.string.food_water_sterilize_utensils),
                getString(R.string.food_water_pack_easy_meals),
                getString(R.string.food_water_avoid_greedy_storage),
                getString(R.string.food_water_check_expiry),
                getString(R.string.food_water_fasting_tip),
                getString(R.string.food_water_rehydrate_food),
                getString(R.string.food_water_keep_it_dry),
                getString(R.string.food_water_cook_with_lid),
                getString(R.string.food_water_dont_waste_crusts),
                getString(R.string.food_water_wash_produce),
                getString(R.string.food_water_trash_management),
                getString(R.string.food_water_spice_storage),
                getString(R.string.food_water_eat_by_priority),
                getString(R.string.food_water_boil_twice),
                getString(R.string.food_water_fermented_foods),
                getString(R.string.food_water_dont_drink_ocean),
                getString(R.string.food_water_bury_food),
                getString(R.string.food_water_cook_bulk),
                getString(R.string.food_water_watch_animals),
                getString(R.string.food_water_eat_slowly),
                getString(R.string.food_water_keep_snacks_ready),
                getString(R.string.food_water_minimize_spills),
                getString(R.string.food_water_survival_tea),
                getString(R.string.food_water_wrap_water_bottles),
                getString(R.string.food_water_use_small_containers),
                getString(R.string.food_water_roast_grains),
                getString(R.string.food_water_protect_stash),
                getString(R.string.food_water_dry_fruits),

        };
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}