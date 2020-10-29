import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ToastMessaage {

    public static void s(Context c, String message){
        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();
    }

    public static void goToNextActivity(Context context, final Class<? extends Activity> targetActivity){
        Intent in = new Intent(context, targetActivity);
        context.startActivity(in);
    }
}
