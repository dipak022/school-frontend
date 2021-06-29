package quran.app.collageapp.ui.home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.smarteist.autoimageslider.DefaultSliderView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderLayout;

import quran.app.collageapp.R;


public class HomeFragment extends Fragment {

    private SliderLayout sliderLayout;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home, container, false);
        sliderLayout = view.findViewById(R.id.slider);
        sliderLayout.setIndicatorAnimation(IndicatorAnimations.FILL);
        sliderLayout.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderLayout.setScrollTimeInSec(1);

        SetSliderViews();

        return view;
    }

    private void SetSliderViews() {

        for (int i=0;i<5;i++){
            DefaultSliderView sliderView =new DefaultSliderView(getContext());
            switch (i){
                case 0:
                    sliderView.setImageUrl("");
                    break;

                case 1:
                    sliderView.setImageUrl("");
                    break;

                case 2:
                    sliderView.setImageUrl("");
                    break;

                case 3:
                    sliderView.setImageUrl("");
                    break;

                case 4:
                    sliderView.setImageUrl("");
                    break;
            }
            sliderView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
            sliderLayout.addSliderView(sliderView);
        }

    }
}