package com.jagungin.daggerdifferences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jagungin.daggerdifferences.with_di.DarkKnightDI
import com.jagungin.daggerdifferences.with_di.LightKnightDI
import com.jagungin.daggerdifferences.with_di.SenjataDI
import com.jagungin.daggerdifferences.without.DarkKnight
import com.jagungin.daggerdifferences.without.LightKnight
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var checked: Boolean = false
    private lateinit var reportBattle: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Create Instance/Object from DARK and LIGHT Knight
        //Without Dependency Injection
        val lightKnight = LightKnight()
        val darkKnight = DarkKnight()

        switch_di.setOnCheckedChangeListener { _, isChecked ->
            checked = isChecked
        }

        //with Dependency Injection
        val senjatDi = SenjataDI()
        val lightKnightDI = LightKnightDI(senjatDi)
        val darkKnightDI = DarkKnightDI(senjatDi)


        click_me.setOnClickListener {
            reportBattle = if (checked) {
                "${lightKnightDI.setEquip_DI()} \ndan\n ${darkKnightDI.setEquip_DI()}"
            } else {
                "${lightKnight.setEquip()} \ndan\n ${darkKnight.setEquip()}"
                //manual dependency was fine if used from a bit of class,
                //but if there are MANY CLASS. there must be hardcoded dependency
                //because if SenjataClass have changes, other class depend on it must be changed too
            }
            report.text = reportBattle
        }
    }
}
