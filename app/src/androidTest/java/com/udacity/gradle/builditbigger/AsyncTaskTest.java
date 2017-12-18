package com.udacity.gradle.builditbigger;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by moatz on 17/12/17.
 */
@RunWith(AndroidJUnit4.class)
public class AsyncTaskTest {

    @Test
    public void testAsyncTaskLibrary(){
        EndpointsAsyncTask e = new EndpointsAsyncTask(InstrumentationRegistry.getTargetContext());
        e.execute();
        try {
            assertNotNull(e.get());
            assertNotEquals("", e.get());
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }
}