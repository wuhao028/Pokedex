package com.wuhao028.pokedex.ui

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutCompat
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.wuhao028.pokedex.R
import com.wuhao028.pokedex.adapter.ToolsAdapter
import kotlinx.android.synthetic.main.fragment_tool.*

/**
 *Created by WuHao028 on 12/11/18
 */

class ToolFragment : Fragment() {

    private var mTitle: String? = null
    val tools: ArrayList<String> = ArrayList()

    companion object {
        fun getInstance(title: String): ToolFragment {
            val fragment = ToolFragment()
            val bundle = Bundle()
            fragment.arguments = bundle
            fragment.mTitle = title
            return fragment
        }
    }

    fun initData(){
        tools.add("Calculator")
        tools.add("Calculator1")
        tools.add("Calculator2")
        tools.add("Calculator3")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_tool, null)
    }


    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initData()
        poke_tool_recyclerview.layoutManager = LinearLayoutManager(this.context)
        poke_tool_recyclerview.adapter = ToolsAdapter(tools,this.context)
        poke_tool_recyclerview.addItemDecoration(DividerItemDecoration(this.context,DividerItemDecoration.VERTICAL))
    }
}