package com.example.affirmations

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

@RunWith(AndroidJUnit4::class)
class AffirmationsListTests {
   @get:Rule
   val activity = ActivityScenarioRule(MainActivity::class.java)

   @Test
   fun scroll_to_item() {
   onView(withId(R.id.recycler_view)).perform(
      RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(9)
      )
      onView(withText(R.string.affirmation10)).check(matches(isDisplayed()))
   }
}
// file located at app -> build.gradle
/*
    dependencies {
        ...
        androidTestImplementation
        'androidx.test.espresso:espresso-contrib:3.4.0'
        testImplementation 'org.mockito:mockito-core:3.12.4'
    }
 */