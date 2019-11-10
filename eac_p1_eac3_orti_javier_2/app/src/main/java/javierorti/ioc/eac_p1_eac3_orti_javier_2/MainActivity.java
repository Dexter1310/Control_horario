package javierorti.ioc.eac_p1_eac3_orti_javier_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button d;
    TextView h;
    String f;
    String p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        d=(Button)findViewById(R.id.button);
//        f=(TextView)findViewById(R.id.inform);
        h=(TextView)findViewById(R.id.sele);



    }

    public void segundo(View view ){

        if (h.getText().toString().contains("Indonesia"))
        {
            f="Indonesia, un país del Sudeste Asiático compuesto de miles de islas volcánicas, es hogar de cientos de grupos étnicos que hablan varios idiomas distintos.";
            p="Indonesia";
        }else if(h.getText().toString().contains("Canada")){
            f="Canadá es el país norteamericano que se extiende desde los Estados Unidos en el sur hasta el círculo polar ártico en el norte.";
            p="Canada";
        }else if(h.getText().toString().contains("Jamaica")){
            f="Jamaica, un país insular caribeño, tiene una frondosa topografía de montañas, bosques pluviales y playas con arrecifes.";
            p="Jamaica";
        }else if(h.getText().toString().contains("Japón")){
            f="Japón es una nación insular del océano Pacífico con densas ciudades, palacios imperiales, parques nacionales montañosos y miles de santuarios y templos.";
            p="Japón";
        }else{
            f="No hay país seleccionado";
            p="sin pais";
        }
        Intent seg=new Intent(this,SegonActivity.class);
        seg.putExtra("valor",f);
        seg.putExtra("valorPais",p);
                   startActivity(seg);
    }

}
