package me.gujun.android.taggroup.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.util.Arrays;

import me.gujun.android.taggroup.TagGroup;


public class MainActivity extends AppCompatActivity {

    private TagGroup mDefaultTagGroup;

    private TagGroup.OnTagClickListener mTagClickListener = new TagGroup.OnTagClickListener() {
        @Override
        public void onTagClick(String tag, boolean isCheck) {
            Toast.makeText(MainActivity.this, tag, Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDefaultTagGroup = (TagGroup) findViewById(R.id.tag_group);
        mDefaultTagGroup.setOnTagClickListener(mTagClickListener);
        mDefaultTagGroup.setCheckTags(Arrays.asList("高血压", "糖尿病", "65岁以上", "孕产妇", "新生儿", "精神病", "健康"),
                Arrays.asList("高血压", "糖尿病", "健康"));
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}