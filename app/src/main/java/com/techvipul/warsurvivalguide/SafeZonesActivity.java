package com.techvipul.warsurvivalguide;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class SafeZonesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_safe_zones);

        Toolbar toolbar = findViewById(R.id.toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            if (getSupportActionBar() != null) {
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            }
        } else {
            throw new IllegalStateException("Toolbar not found in layout");
        }

        RecyclerView recyclerView = findViewById(R.id.recycler_view_plans);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new LessonAdapter(getPlans()));
    }

    private String[] getPlans() {
        return new String[] {
                getString(R.string.escape_plan_create_exit_plan),
                getString(R.string.escape_plan_keep_route_map),
                getString(R.string.escape_plan_predefine_meeting_point),
                getString(R.string.escape_plan_drill_routes),
                getString(R.string.escape_plan_backup_route),
                getString(R.string.escape_plan_hidden_pathways),
                getString(R.string.escape_plan_time_escape),
                getString(R.string.escape_plan_travel_light),
                getString(R.string.escape_plan_memorize_landmarks),
                getString(R.string.escape_plan_list_safehouses),
                getString(R.string.escape_plan_disguise_appearance),
                getString(R.string.escape_plan_keep_keys_ready),
                getString(R.string.escape_plan_wear_comfy_clothes),
                getString(R.string.escape_plan_map_checkpoints),
                getString(R.string.escape_plan_charge_devices),
                getString(R.string.escape_plan_observe_patrols),
                getString(R.string.escape_plan_list_contacts),
                getString(R.string.escape_plan_understand_area),
                getString(R.string.escape_plan_carry_cash),
                getString(R.string.escape_plan_silent_exit),
                getString(R.string.escape_plan_night_vision),
                getString(R.string.escape_plan_stay_in_group),
                getString(R.string.escape_plan_conceal_movement),
                getString(R.string.escape_plan_signal_safety),
                getString(R.string.escape_plan_bypass_barricades),
                getString(R.string.escape_plan_check_weather),
                getString(R.string.escape_plan_track_supplies),
                getString(R.string.escape_plan_watch_airspace),
                getString(R.string.escape_plan_use_camouflage),
                getString(R.string.escape_plan_move_in_shifts),
                getString(R.string.escape_plan_bring_ids),
                getString(R.string.escape_plan_mark_trails),
                getString(R.string.escape_plan_scout_ahead),
                getString(R.string.escape_plan_watch_animals),
                getString(R.string.escape_plan_hide_movement),
                getString(R.string.escape_plan_keep_radio),
                getString(R.string.escape_plan_avoid_crowds),
                getString(R.string.escape_plan_fake_identity),
                getString(R.string.escape_plan_leave_no_trace),
                getString(R.string.escape_plan_silent_footwear),
                getString(R.string.escape_plan_waterways_escape),
                getString(R.string.escape_plan_follow_nature),
                getString(R.string.escape_plan_plan_short_rest),
                getString(R.string.escape_plan_list_border_crossings),
                getString(R.string.escape_plan_fake_paths),
                getString(R.string.escape_plan_practice_scenario),
                getString(R.string.escape_plan_hide_essentials),
                getString(R.string.escape_plan_encrypt_messages),
                getString(R.string.escape_plan_rejoin_after_split),
                getString(R.string.escape_plan_use_local_tips),

        };
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}