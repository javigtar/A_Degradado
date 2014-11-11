package dam.org.drawable;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Main extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new ejemploView(this));

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public class ejemploView extends View{

        private Drawable miImagen;

        public ejemploView(Context context){
            super(context);
            setBackgroundResource(R.drawable.degradado);
            Resources res = context.getResources();
            miImagen = res.getDrawable(R.drawable.mi_imagen);
        }

        @Override
        protected void onDraw(Canvas canvas){

            miImagen.setBounds((canvas.getWidth()/2)-160,100,400,400);
            miImagen.draw(canvas);
        }
    }
}
