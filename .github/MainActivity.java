package sg.edu.np.mad.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onStart(){
        super.onStart();

        // Setting User Objects
        User user = new User();
        user.userFollowed = false;

        // Follow Button Control (Toggling)
        Button buttonFollow = findViewById(R.id.button);
        buttonFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (user.userFollowed = false) {
                    buttonFollow.setText("UNFOLLOW"); // Set text to unfollow only when variable is false
                    user.userFollowed = true; // Changing the bool accordingly
                } else {
                    buttonFollow.setText("FOLLOW");
                    user.userFollowed = false;
                }
            }
        });
    }
}