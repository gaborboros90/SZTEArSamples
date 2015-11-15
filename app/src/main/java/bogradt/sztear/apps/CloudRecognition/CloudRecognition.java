package bogradt.sztear.apps.CloudRecognition;

public class CloudRecognition extends android.app.Activity{
    private android.opengl.GLSurfaceView glSurfaceView;
    private boolean rendererSet = false;

    @Override
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        glSurfaceView = new android.opengl.GLSurfaceView(this);

        if(isOpenGLEs2Supported()) {
            glSurfaceView.setEGLContextClientVersion(2);

            glSurfaceView.setRenderer(new CloudRecognitionRenderer(this));
            rendererSet = true;
        }
        else {
            android.widget.Toast.makeText(this, "This device does not support OpenGL ES 2.0.",
                    android.widget.Toast.LENGTH_LONG).show();
            return;
        }

        setContentView(glSurfaceView);
    }

    @Override
    protected void onPause() {
        super.onPause();

        if(rendererSet)
            glSurfaceView.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();

        if(rendererSet)
            glSurfaceView.onResume();
    }

    private boolean isOpenGLEs2Supported() {
        final android.app.ActivityManager activityManager =
                (android.app.ActivityManager) getSystemService(android.content.Context.ACTIVITY_SERVICE);

        final android.content.pm.ConfigurationInfo configurationInfo =
                activityManager.getDeviceConfigurationInfo();

        final boolean supportsEs2 =
                configurationInfo.reqGlEsVersion >= 0x20000
                        || (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1
                        && (android.os.Build.FINGERPRINT.startsWith("generic")
                        || android.os.Build.FINGERPRINT.startsWith("unknown")
                        || android.os.Build.MODEL.contains("google_sdk")
                        || android.os.Build.MODEL.contains("Emulator")
                        || android.os.Build.MODEL.contains("Android SDK built for x86")));

        return supportsEs2;
    }
}
