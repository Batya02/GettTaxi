package com.gett.gett

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val back_own_menu: Button = findViewById(R.id.back_own_menu)
        val pluses: TextView = findViewById(R.id.textView3)

        back_own_menu.setOnClickListener{
            startActivity(Intent(this@MainActivity2, MainActivity::class.java))
        }

        pluses.setText(
            "\n1. Моментальные выплаты безнала на банковскую карту/qiwi кошелёк\n\n"+
            "2. Удобное и понятное приложение для водителей\n\n"+
            "3. Дистанционное подключение без приезда в офис\n\n"+
            "4. Быстрое подключение водителя к заказам Gett\n\n"+
            "5. Специальные условия для индивидуальных предпринимателей\n\n"+
            "6. Повышенные цены Gett и большой поток ежедневных заказов\n\n"+
            "7. Круглосуточная тех. поддержка водителей\n\n"+
            "8. Отсутствие рейтинга водителей, заказ отправляется ближайшему авто\n\n"+
            "9. Прозрачность доходов в Gett без скрытых комиссий\n\n"+
            "10. Отсутствие часовых лимитов в работе с таксометром\n\n"+
            "11. Возможность выбора предварительных заказов\n\n"+
            "12. Отсутствие штрафов за отказ от заказа"
        )

    }

}