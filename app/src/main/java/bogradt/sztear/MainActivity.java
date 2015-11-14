package bogradt.sztear;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import bogradt.sztear.dialogs.DialogInfoActivity;
import bogradt.sztear.model.ActivityList;
import bogradt.sztear.model.ActivityPropertyAdatpter;
import bogradt.sztear.model.ActivityPropertyBean;


public class MainActivity extends ActionBarActivity {
    private ActivityPropertyAdatpter activityPropertyAdatpter;
    private ListView listView;
    private ActivityList activityList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activityList = new ActivityList();
        activityPropertyAdatpter = new ActivityPropertyAdatpter(getApplicationContext(), activityList.getActivityPropertyBeanList());
        listView = (ListView) findViewById(R.id.activity_list);
        listView.setAdapter(activityPropertyAdatpter);
        listView.setSelector(R.drawable.item_press_selector);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ActivityPropertyBean apb = (ActivityPropertyBean) parent.getItemAtPosition(position);

                Intent preliminaryActivity = new Intent(getApplicationContext(),PreliminaryInformationsActivity.class);
                preliminaryActivity.putExtra("bean", apb);

                Bundle animationBundle = ActivityOptions.makeCustomAnimation(getApplicationContext(),R.anim.slide_in,R.anim.slide_out).toBundle();
                startActivity(preliminaryActivity, animationBundle);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        if(id == R.id.action_info) {
            Intent infoDialog = new Intent(getApplicationContext(), DialogInfoActivity.class);
            startActivity(infoDialog);
        }

        return super.onOptionsItemSelected(item);
    }
}
