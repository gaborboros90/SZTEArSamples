package bogradt.sztear.model;

import java.io.Serializable;

public class ActivityPropertyBean implements Serializable {
    private final String shortDescription;
    private final String detailedDescription;
    private final ActivityNames activityNames;
    private final int smallThumbnail;
    private final int previewImage;
    private final String activityTitle;
    private final String[] markerImageAddress;

    public ActivityPropertyBean(String shortDescription, String detailedDescription, ActivityNames activityNames, int smallThumbnail, int previewImage, String activityTitle, String[] markerImageAddress) {
        this.shortDescription = shortDescription;
        this.detailedDescription = detailedDescription;
        this.activityNames = activityNames;
        this.smallThumbnail = smallThumbnail;
        this.previewImage = previewImage;
        this.activityTitle = activityTitle;
        this.markerImageAddress = markerImageAddress;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public ActivityNames getActivityNames() {
        return activityNames;
    }

    public String getDetailedDescription() {
        return detailedDescription;
    }

    public int getPreviewImage() {
        return previewImage;
    }

    public int getSmallThumbnail() {
        return smallThumbnail;
    }

    public String getActivityTitle() {
        return activityTitle;
    }

    public String[] getMarkerImageAddress() {
        return markerImageAddress;
    }

    @Override
    public String toString() {
        return "ActivityPropertyBean{" +
                "shortDescription=" + shortDescription +
                ", detailedDescription=" + detailedDescription +
                ", activityName=" + activityNames +
                ", smallThumbnail=" + smallThumbnail +
                ", previewImage=" + previewImage +
                ", activityTitle=" + activityTitle +
                '}';
    }
}
