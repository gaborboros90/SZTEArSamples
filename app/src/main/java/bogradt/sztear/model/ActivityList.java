package bogradt.sztear.model;

import java.util.ArrayList;

import bogradt.sztear.R;

public class ActivityList {
    private ArrayList<ActivityPropertyBean> activityPropertyBeanList = new ArrayList<ActivityPropertyBean>();

    public ActivityList() {

        activityPropertyBeanList.add(new ActivityPropertyBean("Short description","A little bit longer description", ActivityName.ImageTargets,
                R.drawable.button,R.drawable.preview,"Sample Image target","Stones and chips"));
        activityPropertyBeanList.add(new ActivityPropertyBean("Short description","A little bit longer description", ActivityName.CloudRecognition,
                R.drawable.button,R.drawable.preview,"Using clouds","Stones and chips"));
        activityPropertyBeanList.add(new ActivityPropertyBean("Short description","A little bit longer description", ActivityName.CylinderTarget,
                R.drawable.button,R.drawable.preview,"Cylinder targets","Stones and chips"));
        activityPropertyBeanList.add(new ActivityPropertyBean("Short description","A little bit longer description", ActivityName.FrameMarkers,
                R.drawable.button,R.drawable.preview,"Frame markers","Stones and chips"));
        activityPropertyBeanList.add(new ActivityPropertyBean("Short description","A little bit longer description", ActivityName.TextRecognition,
                R.drawable.button,R.drawable.preview,"Text recognition with Vuforia","Stones and chips"));
        activityPropertyBeanList.add(new ActivityPropertyBean("Short description","A little bit longer description", ActivityName.UserDefinedTarget,
                R.drawable.button,R.drawable.preview,"User defined targets","Stones and chips"));
        activityPropertyBeanList.add(new ActivityPropertyBean("Short description","A little bit longer description", ActivityName.VirtualButtons,
                R.drawable.button,R.drawable.preview,"Virtual buttons","Stones and chips"));
        activityPropertyBeanList.add(new ActivityPropertyBean("Short description","A little bit longer description", ActivityName.ExtendedTracking,
                R.drawable.button,R.drawable.preview,"Extended tracking sample","Stones and chips"));
    }

    public ArrayList<ActivityPropertyBean> getActivityPropertyBeanList() {
        return activityPropertyBeanList;
    }
}
