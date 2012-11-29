package pl.polidea.effectview;

import pl.polidea.opengleffects.R;
import android.app.Activity;
import android.graphics.BitmapFactory;
import android.os.Bundle;

public class OpenGLEffectActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_gleffect);
        final EffectView ev = (EffectView) findViewById(R.id.effectView1);
        ev.setEffect(new Effect(this, null, "radialBlur.glsl"));
        ev.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.polidea));
        ev.setRenderMode(EffectView.RENDERMODE_CONTINUOUSLY);
        ev.invalidate();
    }

}
