package com.kiran.testingkotlinapp

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@LargeTest
@RunWith(JUnit4::class)
class InstrumentedTesting {
    @get:Rule
    val testRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun checkArithmetic() {
        onView(withId(R.id.etFirst))
            .perform(typeText("1"))
        onView(withId(R.id.etSecond))
            .perform(typeText("2"))

        onView(withId(R.id.btnCalculate))
            .perform(click())

        onView(withId(R.id.tvResult))
            .check(matches(withText("4")))
    }
}

