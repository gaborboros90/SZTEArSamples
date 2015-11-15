package bogradt.sztear;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import bogradt.sztear.model.ActivityPropertyBean;


public class PreliminaryInformationsActivity extends ActionBarActivity {
    private TextView title;
    private TextView detailedDescription;
    private TextView markerAddress;
    private ImageView previewImage;
    private Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preliminary_informations);
        Intent i = getIntent();
        ActivityPropertyBean properties = (ActivityPropertyBean) i.getSerializableExtra("propertyBean");
        this.setDataToUIElements(properties);
        this.launchApp(properties);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_info) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void setDataToUIElements(ActivityPropertyBean properties) {
        this.title = (TextView) findViewById(R.id.activity_title);
        this.title.setText(properties.getActivityTitle());
        this.detailedDescription = (TextView) findViewById(R.id.long_description);
        this.detailedDescription.setText(properties.getDetailedDescription());
        this.markerAddress = (TextView) findViewById(R.id.target_images);
        this.markerAddress.setText(properties.getMarkerImageAddress());
        this.previewImage = (ImageView) findViewById(R.id.previewImage);
        this.previewImage.setImageResource(properties.getPreviewImage());
    }

    private void launchApp(final ActivityPropertyBean properties) {
        this.startButton = (Button) findViewById(R.id.start_button);
        this.startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchArAppIntent = new Intent();

                switch (properties.getActivityName()) {
                    case ImageTargets:
                        launchArAppIntent.setClass(getApplicationContext(), bogradt.sztear.apps.ImageTargets.ImageTargets.class);
                        break;
                    case CloudRecognition:
                        launchArAppIntent.setClass(getApplicationContext(), bogradt.sztear.apps.CloudRecognition.CloudRecognition.class);
                        break;
                    case CylinderTarget:
                        launchArAppIntent.setClass(getApplicationContext(), bogradt.sztear.apps.CylinderTarget.CylinderTarget.class);
                        break;
                    case FrameMarkers:
                        launchArAppIntent.setClass(getApplicationContext(), bogradt.sztear.apps.FrameMarkers.FrameMarkers.class);
                        break;
                    case TextRecognition:
                        launchArAppIntent.setClass(getApplicationContext(), bogradt.sztear.apps.TextRecognition.TextRecognition.class);
                        break;
                    case UserDefinedTarget:
                        launchArAppIntent.setClass(getApplicationContext(), bogradt.sztear.apps.UserDefinedTarget.UserDefinedTarget.class);
                        break;
                    case VirtualButtons:
                        launchArAppIntent.setClass(getApplicationContext(), bogradt.sztear.apps.VirtualButtons.VirtualButtons.class);
                        break;
                    case ExtendedTracking:
                        launchArAppIntent.setClass(getApplicationContext(), bogradt.sztear.apps.ExtendedTracking.ExtendedTracking.class);
                        break;
                }

                startActivity(launchArAppIntent);
            }
        });
    }
}
