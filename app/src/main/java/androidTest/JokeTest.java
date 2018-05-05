package androidTest;

import android.test.AndroidTestCase;
import android.util.Log;

import com.udacity.gradle.builditbigger.EndPointAsyncTask;

public class JokeTest extends AndroidTestCase {
    private static final String LOG_TAG = "StringTest";

    public void test() {
        Log.v("NoStringTest", "Running AsyncStringTest test");
        String result = null;
        EndPointAsyncTask endpointsAsyncTask = new EndPointAsyncTask(getContext());
        endpointsAsyncTask.execute();
        try {
            result = endpointsAsyncTask.get();
            Log.d(LOG_TAG, "The string received is not empty " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(result);
    }
}
