package com.jagungin.daggerdifferences.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jagungin.daggerdifferences.R
import kotlinx.android.synthetic.main.activity_dagger.*
import javax.inject.Inject

class DaggerActivity : AppCompatActivity() {

    //create Injector
    @Inject
    lateinit var darkKnightDagger: DarkKnightDagger
    @Inject
    lateinit var lightKnightDagger: LightKnightDagger

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dagger)

        //get context from these class
        DaggerBattleComponent.create().inject(this)

        click_me.setOnClickListener {
            val text =
                "${lightKnightDagger.setEquip_Dagger()} \ndan\n ${darkKnightDagger.setEquip_Dagger()}"
            report.text = text
        }
    }
}
