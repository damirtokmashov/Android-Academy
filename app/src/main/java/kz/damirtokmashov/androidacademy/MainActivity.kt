package kz.damirtokmashov.androidacademy

import android.os.Bundle
import android.provider.ContactsContract.Intents.Insert.DATA
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment : MoviesListFragment = MoviesListFragment.newInstance()

        // check is important to prevent activity from attaching the fragment if already its attached
        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragment_container, fragment, "fragment_name")
                .commit()
        }
    }
}