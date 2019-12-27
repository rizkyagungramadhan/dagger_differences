package com.jagungin.daggerdifferences.dagger.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jagungin.daggerdifferences.R
import com.jagungin.daggerdifferences.dagger.scope.ArmyComponent
import com.jagungin.daggerdifferences.dagger.scope.DaggerArmyComponent
import com.jagungin.daggerdifferences.dagger.scope.House
import kotlinx.android.synthetic.main.activity_dagger_scope.*

class DaggerScopeActivity : AppCompatActivity() {

    private lateinit var armyComponent: ArmyComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dagger_scope)

        armyComponent = DaggerArmyComponent.create()

        click_me_scope.setOnClickListener {
            val house = House()
            armyComponent.inject(house)
            val reportBattle = "DarkKnight army has ${house.uniqueArmy.amountSoldiers} soldiers\n and" +
                    "\nLightKnight army has ${house.normalArmy.amountSoldiers} soldiers"

            report_scope.text = reportBattle
        }
    }
}
