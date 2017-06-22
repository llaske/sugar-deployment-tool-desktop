package com.sugarizer.inject

import com.sugarizer.domain.model.DeviceModel
import com.sugarizer.domain.shared.JADB
import com.sugarizer.main.Main
import com.sugarizer.presentation.view.appmanager.AppManagerView
import com.sugarizer.presentation.view.device.DevicesView
import com.sugarizer.presentation.view.loadinstruction.LoadInstructionPresenter
import com.sugarizer.presentation.view.loadinstruction.LoadInstructionView
import view.main.MainView

@javax.inject.Singleton
@dagger.Component(modules = arrayOf(AppModule::class))
interface AppComponent {
    fun inject(main: Main)

    fun inject(devicesView: DevicesView)

    fun inject(mainView: MainView)

    fun inject(jadb: JADB)

    fun inject(deviceModel: DeviceModel)

    fun inject(appManagerView: AppManagerView)

    fun inject(loadInstructionPresenter: LoadInstructionPresenter)

    companion object {
        fun init(application: javafx.application.Application) : AppComponent {
            return DaggerAppComponent.builder()
                    .appModule(AppModule())
                    .build()
        }
    }
}