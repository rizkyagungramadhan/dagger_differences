package com.jagungin.daggerdifferences.dagger.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jagungin.daggerdifferences.R
import com.jagungin.daggerdifferences.dagger.DaggerBattleComponent
import com.jagungin.daggerdifferences.dagger.DarkKnightDagger
import com.jagungin.daggerdifferences.dagger.LightKnightDagger
import kotlinx.android.synthetic.main.activity_dagger.*
import javax.inject.Inject

class DaggeQualifierrActivity : AppCompatActivity() {

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

        click_dagger_scope.setOnClickListener {
            startActivity(Intent(this, DaggerScopeActivity::class.java))
        }
    }
}
