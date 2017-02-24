package aventics.pneuapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserSelectActivity extends AppCompatActivity {
    Button btnCompetitor = (Button)findViewById(R.id.btnCompetitor);
    Button btnGuest = (Button)findViewById(R.id.btnGuest);
    Button btnVisitor = (Button)findViewById(R.id.btnVisitor);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_select);

        btnCompetitor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnGuest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnVisitor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
