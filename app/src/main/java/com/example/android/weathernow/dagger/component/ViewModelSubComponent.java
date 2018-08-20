package com.example.android.weathernow.dagger.component;

import com.example.android.weathernow.dagger.WeatherViewModelFactory;
import com.example.android.weathernow.view.search.SharedSearchDetailViewModel;

import dagger.Subcomponent;

/**
 * A sub component to create ViewModels. It is called by the
 * {@link WeatherViewModelFactory}. Using this component allows
 * ViewModels to define {@link javax.inject.Inject} constructors.
 */
@Subcomponent
public interface ViewModelSubComponent {
    @Subcomponent.Builder
    interface Builder {
        ViewModelSubComponent build();
    }

    SharedSearchDetailViewModel searchLocationViewModel();
}
