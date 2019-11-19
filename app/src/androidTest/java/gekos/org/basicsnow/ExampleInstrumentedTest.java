package gekos.org.basicsnow;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.closeSoftKeyboard;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Rule
    public ActivityTestRule<LoginActivity> loginActivityActivityTestRule =
            new ActivityTestRule<>(LoginActivity.class);

    @Rule
    public ActivityTestRule<AddBookActivity> addBookActivityActivityTestRule=
            new ActivityTestRule<>(AddBookActivity.class);

    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();
        assertEquals("gekos.org.basicsnow", appContext.getPackageName());
    }

    @Test
    public void checkTransitionsToActivity1(){
        //type some text and press a button
        onView(withId(R.id.tx_bookAuthor)).perform(typeText("My Book"));
        onView(withId(R.id.tx_bookGenre)).perform(typeText("Biographies"));
        closeSoftKeyboard();
        //press button
        onView(withId(R.id.btn_addBook)).perform(click());
        //check that view is now 'add_book'
        onView(withId(R.id.btn_login)).check(matches(isDisplayed()));
    }
}
