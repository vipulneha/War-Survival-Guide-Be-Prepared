package com.techvipul.warsurvivalguide;

import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class SurvivalLessonsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survival_lessons);

        Toolbar toolbar = findViewById(R.id.toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            if (getSupportActionBar() != null) {
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            }
        } else {
            throw new IllegalStateException("Toolbar not found in layout");
        }

        RecyclerView recyclerView = findViewById(R.id.recycler_view_lessons);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LessonAdapter adapter = new LessonAdapter(getLessons());
        recyclerView.setAdapter(adapter);
    }

    private void showLessonDialog(String lesson) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.AlertDialogTheme);
        builder.setMessage(lesson)
                .setPositiveButton("OK", (dialog, which) -> dialog.dismiss())
                .setCancelable(true);
        AlertDialog dialog = builder.create();
        dialog.show();

        // Customize dialog button text color
        dialog.getButton(AlertDialog.BUTTON_POSITIVE).setTextColor(getResources().getColor(R.color.yellow_accent));
    }

    private String[] getLessons() {
        return new String[] {
                getString(R.string.lesson_bombing_safety),
                getString(R.string.lesson_improvised_shelter),
                getString(R.string.lesson_water_purification),
                getString(R.string.lesson_food_rationing),
                getString(R.string.lesson_noise_control),
                getString(R.string.lesson_blackout_rules),
                getString(R.string.lesson_first_aid_basics),
                getString(R.string.lesson_escape_plan),
                getString(R.string.lesson_emergency_contacts),
                getString(R.string.lesson_hidden_storage),
                getString(R.string.lesson_signal_mirror),
                getString(R.string.lesson_dust_mask),
                getString(R.string.lesson_radio_updates),
                getString(R.string.lesson_mobile_battery),
                getString(R.string.lesson_silent_communication),
                getString(R.string.lesson_stay_low),
                getString(R.string.lesson_medicines_priority),
                getString(R.string.lesson_keep_warm),
                getString(R.string.lesson_safe_meeting_point),
                getString(R.string.lesson_fake_identity),
                getString(R.string.lesson_map_printout),
                getString(R.string.lesson_travel_at_night),
                getString(R.string.lesson_silent_mode),
                getString(R.string.lesson_flashlight_cover),
                getString(R.string.lesson_dog_barking_sign),
                getString(R.string.lesson_disguise_tips),
                getString(R.string.lesson_sleep_schedule),
                getString(R.string.lesson_protect_documents),
                getString(R.string.lesson_signal_smoke),
                getString(R.string.lesson_dry_foods),
                getString(R.string.lesson_local_language),
                getString(R.string.lesson_cover_tattoos),
                getString(R.string.lesson_no_fire_inside),
                getString(R.string.lesson_find_high_ground),
                getString(R.string.lesson_scout_area),
                getString(R.string.lesson_keep_quiet_zone),
                getString(R.string.lesson_secure_doors),
                getString(R.string.lesson_fake_presence),
                getString(R.string.lesson_group_strategy),
                getString(R.string.lesson_reflective_items),
                getString(R.string.lesson_loose_clothing),
                getString(R.string.lesson_learn_first_aid),
                getString(R.string.lesson_mark_safe_zones),
                getString(R.string.lesson_fake_pathways),
                getString(R.string.lesson_emergency_signals),
                getString(R.string.lesson_scout_night),
                getString(R.string.lesson_walk_single_file),
                getString(R.string.lesson_sharp_objects),
                getString(R.string.lesson_reuse_water),
                getString(R.string.lesson_hide_tracks),
                getString(R.string.lesson_avoid_looting),
                getString(R.string.lesson_shoes_first),
                getString(R.string.lesson_stay_calm),
                getString(R.string.lesson_scout_food_sources),
                getString(R.string.lesson_wet_cloth_mask),
                getString(R.string.lesson_bring_photos),
                getString(R.string.lesson_know_signals),
                getString(R.string.lesson_write_messages),
                getString(R.string.lesson_backup_location),
                getString(R.string.lesson_boil_everything),
                getString(R.string.lesson_avoid_conflict),
                getString(R.string.lesson_guard_food),
                getString(R.string.lesson_undercover_items),
                getString(R.string.lesson_alert_codes),
                getString(R.string.lesson_cold_protection),
                getString(R.string.lesson_hide_in_plain_sight),
                getString(R.string.lesson_route_memory),
                getString(R.string.lesson_avoid_groups),
                getString(R.string.lesson_watch_weather),
                getString(R.string.lesson_under_table),
                getString(R.string.lesson_defensive_posture),
                getString(R.string.lesson_make_sling),
                getString(R.string.lesson_store_energy),
                getString(R.string.lesson_save_battery),
                getString(R.string.lesson_solar_charger),
                getString(R.string.lesson_hide_cash),
                getString(R.string.lesson_secret_signals),
                getString(R.string.lesson_headlamp_red),
                getString(R.string.lesson_cover_bleeding),
                getString(R.string.lesson_local_plants),
                getString(R.string.lesson_salt_storage),
                getString(R.string.lesson_fake_id),
                getString(R.string.lesson_mark_exits),
                getString(R.string.lesson_treat_burns),
                getString(R.string.lesson_create_camo),
                getString(R.string.lesson_avoid_conflict_zones),
        };
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}