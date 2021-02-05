package jp.co.casareal.firebasecloudmessagingsample

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.iid.FirebaseInstanceIdReceiver
import com.google.firebase.messaging.FirebaseMessaging


class MainActivity : AppCompatActivity() {

    val TAG = "Cloud Messaging Sample"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        FirebaseMessaging.getInstance().token.addOnCompleteListener {

            Log.d(TAG, "token: ${it.result.toString()}")

        }

        FirebaseMessaging.getInstance().subscribeToTopic("top_news").addOnCompleteListener {
            Log.d(TAG, "topic complete: ${it.isSuccessful}")
        }

    }
}