package javierorti.ioc.eac_p1_eac3_orti_javier_2;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SimpleFragment extends Fragment {


    TextView textView;
    TextView textView2;
    ImageView imagenSelec;
    public SimpleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment.
        final View rootView = inflater.inflate(R.layout.fragment_simple, container, false);
        final RadioGroup radioGroup = rootView.findViewById(R.id.radio_group);
        radioGroup.setOnCheckedChangeListener(new
                                                  RadioGroup.OnCheckedChangeListener() {
                                                      @Override
                                                      public void onCheckedChanged(RadioGroup group, int checkedId) {

                                                          View radioButton = radioGroup.findViewById(checkedId);
                                                          int index = radioGroup.indexOfChild(radioButton);

                                                          textView=(TextView)getActivity().findViewById(R.id.sele);
                                                          imagenSelec=(ImageView)getActivity().findViewById(R.id.imageView);

                                                          switch (index) {
                                                              case 0:// caso imagen A
                                                                  textView.setText(R.string.elegidaA);
                                                                  imagenSelec.setImageResource(R.drawable.japon);
                                                                  break;
                                                              case 1: // Caso imagen B
                                                                  textView.setText(R.string.elegidaB);
                                                                  imagenSelec.setImageResource(R.drawable.indonesia);
                                                                  break;
                                                              case 2: // No elegir una imagen
                                                                  textView.setText(R.string.elegidaC);
                                                                  imagenSelec.setImageResource(R.drawable.jamaicanamebg);
                                                                  break;
                                                              case 3: // No elegir una imagen
                                                                  textView.setText(R.string.elegidaD);
                                                                  imagenSelec.setImageResource(R.drawable.canada);
                                                                  break;
                                                              default: // No se ha seleccionado nada
                                                                  textView.setText("Seleccione alguna opción");
                                                                  break;
                                                          }
                                                      }
                                                  });

// Return the View for the fragment's UI.
        return rootView;
    }
    }


