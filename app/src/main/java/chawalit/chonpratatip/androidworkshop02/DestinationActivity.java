package chawalit.chonpratatip.androidworkshop02;

import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.parceler.Parcels;

import butterknife.BindView;
import butterknife.ButterKnife;
import chawalit.chonpratatip.androidworkshop02.models.User;

public class DestinationActivity extends AppCompatActivity {

    @BindView(R.id.tvMessage) TextView tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destination);

        ButterKnife.bind(this);

//        String message = getIntent().getStringExtra(MainActivity.MESSAGE);
//        tvMessage.setText(message);

        Bundle bundle = getIntent().getBundleExtra(MainActivity.MESSAGE);
        User user = Parcels.unwrap(bundle.getParcelable("user"));
        tvMessage.setText(user.getFirstName());

    }

    @Override
    protected void onResume() {
        super.onResume();
    }


    @Override
    protected void onPause() {
        super.onPause();
    }


}
