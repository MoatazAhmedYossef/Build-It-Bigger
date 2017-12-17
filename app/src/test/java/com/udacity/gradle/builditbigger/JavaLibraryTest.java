package com.udacity.gradle.builditbigger;

import com.udacity.jokes.JokeFactory;

import org.junit.Test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by moatz on 17/12/17.
 */
public class JavaLibraryTest {
    @Test
    public void testJavaLibrary(){
        assertNotNull(new JokeFactory().getJoke());
        assertNotEquals("", new JokeFactory().getJoke());
    }
}