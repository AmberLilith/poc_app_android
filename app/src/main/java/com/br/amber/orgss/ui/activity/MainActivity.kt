package com.br.amber.orgss.ui.activity

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.br.amber.orgss.R
import com.br.amber.orgss.model.Produto
import com.br.amber.orgss.ui.reclyclerview.adapter.ListarProdutosAdapter
import java.math.BigDecimal

class MainActivity: Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListarProdutosAdapter(this, listOf(
            Produto("Manga", "Manga coquinha", BigDecimal("5.99")),
            Produto("Pitanga", "Pitanga selvagem", BigDecimal("10.00")),
            Produto("Pera", "Pera portuguesa", BigDecimal("9.99"))
        ))

    }
}