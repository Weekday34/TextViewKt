package com.example.textviewkt

import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_list.*
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager


class ListActivity : Activity() {

    val contactsList : List<Contacts> = listOf(
        Contacts("john","010-0000-11111"),
        Contacts("mir","010-1111-2222"),
        Contacts("delp", "010-3333-4444"),
        Contacts("jacob", "010-3333-5555"),
        Contacts("sheu", "010-3333-6666"),
        Contacts("ma", "010-3333-7777"),
        Contacts("ham", "010-3333-8889")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        //구분선을 넣어보자
        val dividerItemDecoration =
                DividerItemDecoration(mRecyclerView.context, LinearLayoutManager(this).orientation)
        mRecyclerView.addItemDecoration(dividerItemDecoration)
        //간격을 조절해보자
        mRecyclerView.addItemDecoration(RecyclerViewDecoration(20))


        val adapter = ContactsListAdapter(contactsList)
        mRecyclerView.adapter = adapter

   }
}








