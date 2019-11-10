package javierorti.ioc.eac_p1_eac3_orti_javier_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SegonActivity extends AppCompatActivity {
    Button d;
    TextView f;
    TextView h;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segon);

        Bundle re=getIntent().getExtras();
        String fr=re.getString("valor");
        String fr2=re.getString("valorPais");
        f=(TextView)findViewById(R.id.info2);
        h=(TextView)findViewById(R.id.pais);
        f.setText(fr);
        h.setText(fr2);

            }

    public void anterior(View view){
        Intent an=new Intent(this,MainActivity.class);
        startActivity(an);

    }
}
