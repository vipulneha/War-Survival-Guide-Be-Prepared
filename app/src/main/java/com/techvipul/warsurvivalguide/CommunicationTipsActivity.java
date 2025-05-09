package com.techvipul.warsurvivalguide;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class CommunicationTipsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_communication_tips);

        Toolbar toolbar = findViewById(R.id.toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            if (getSupportActionBar() != null) {
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            }
        } else {
            throw new IllegalStateException("Toolbar not found in layout");
        }

        RecyclerView recyclerView = findViewById(R.id.recycler_view_tips);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new LessonAdapter(getTips()));
    }

    private String[] getTips() {
        return new String[]{
                getString(R.string.communication_keep_radio_handy),
                getString(R.string.communication_use_morse_code),
                getString(R.string.communication_signal_with_light),
                getString(R.string.communication_establish_meeting_point),
                getString(R.string.communication_backup_phone_list),
                getString(R.string.communication_powerbanks_ready),
                getString(R.string.communication_app_offline_messaging),
                getString(R.string.communication_social_media_update),
                getString(R.string.communication_daily_checkin),
                getString(R.string.communication_silence_devices),
                getString(R.string.communication_code_words),
                getString(R.string.communication_whistle_signals),
                getString(R.string.communication_neighborhood_network),
                getString(R.string.communication_draw_signs),
                getString(R.string.communication_mark_safe_zones),
                getString(R.string.communication_keep_notes),
                getString(R.string.communication_tape_messages),
                getString(R.string.communication_emergency_broadcasts),
                getString(R.string.communication_cb_radio),
                getString(R.string.communication_flash_signals),
                getString(R.string.communication_shout_only_when_safe),
                getString(R.string.communication_text_not_call),
                getString(R.string.communication_mark_trails),
                getString(R.string.communication_prep_messages),
                getString(R.string.communication_group_chat),
                getString(R.string.communication_signal_fire),
                getString(R.string.communication_code_signals),
                getString(R.string.communication_talk_in_whispers),
                getString(R.string.communication_low_light_signals),
                getString(R.string.communication_sound_familiar),
                getString(R.string.communication_waterproof_notes),
                getString(R.string.communication_sticky_notes_in_kit),
                getString(R.string.communication_backup_sim),
                getString(R.string.communication_keep_phone_hidden),
                getString(R.string.communication_trusted_contact),
                getString(R.string.communication_info_board),
                getString(R.string.communication_write_on_skin),
                getString(R.string.communication_timed_alerts),
                getString(R.string.communication_stay_quiet_in_crowd),
                getString(R.string.communication_human_chain),
                getString(R.string.communication_relay_misinformation_warning),
                getString(R.string.communication_create_audio_log),
                getString(R.string.communication_brief_radio_time),
                getString(R.string.communication_hide_antenna),
                getString(R.string.communication_hand_signals),
                getString(R.string.communication_sos_pattern),
                getString(R.string.communication_white_cloth_message),
                getString(R.string.communication_flash_communication_kit),
                getString(R.string.communication_never_use_real_names),


        };
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}