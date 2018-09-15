package chawalit.chonpratatip.androidworkshop02;

import android.content.Intent;
import android.os.Message;
import android.os.Parcel;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.parceler.Parcels;

import butterknife.ButterKnife;
import butterknife.OnClick;
import chawalit.chonpratatip.androidworkshop02.models.User;

public class MainActivity extends AppCompatActivity {

    public static final String MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.button)
    public void sendMessage(){
//        Intent intent = new Intent(this, DestinationActivity);
        Intent intent = new Intent();
        intent.setClass(this, DestinationActivity.class);
//        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//        intent.putExtra(MESSAGE,"Hello");

        User user = new User();
        user.setFirstName("John");

        Bundle bundle = new Bundle();
        bundle.putParcelable("user", Parcels.wrap(user));
        intent.putExtra(MESSAGE, bundle);
        startActivity(intent);
        finish();
    }

}
