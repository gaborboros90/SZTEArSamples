package bogradt.sztear.apps.CylinderTarget;

import static android.opengl.GLES20.*;


public class CylinderTargetRenderer implements android.opengl.GLSurfaceView.Renderer {
    private android.content.Context context;

    public CylinderTargetRenderer(android.content.Context context) {
        this.context = context;
    }

    @Override
    public void onSurfaceCreated(javax.microedition.khronos.opengles.GL10 gl, javax.microedition.khronos.egl.EGLConfig config) {
        glClearColor(1.0f ,0.0f ,1.0f , 0.0f);
    }

    @Override
    public void onSurfaceChanged(javax.microedition.khronos.opengles.GL10 gl, int width, int height) {
        glViewport(0, 0, width, height);
    }

    @Override
    public void onDrawFrame(javax.microedition.khronos.opengles.GL10 gl) {
        glClear(GL_COLOR_BUFFER_BIT);
    }
}
