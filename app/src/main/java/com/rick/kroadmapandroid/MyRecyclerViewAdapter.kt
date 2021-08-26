package com.rick.kroadmapandroid

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.Paint
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rick.kroadmapandroid.Items.Android_SDK
import com.rick.kroadmapandroid.Items.File_Formats

class MyRecyclerViewAdapter(data: Array<String>, val context: Context) :
    RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder>() {

    private val mData: Array<String> = data
    private var mClickListener: ItemClickListener? = null

    // inflates the cell layout from xml when needed
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item, parent, false)
        return ViewHolder(view)
    }

    // binds the data to the TextView in each cell
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.myTextView.text = mData[position]
        holder.myTextView.gravity = Gravity.CENTER

        when (position) {
            2 -> {
                holder.myTextView.setBackgroundColor(Color.YELLOW)
                holder.myTextView.setTextColor(Color.BLACK)
                holder.myTextView.setPaintFlags(holder.myTextView.getPaintFlags() or Paint.UNDERLINE_TEXT_FLAG)
            }
            7 -> {
                holder.myTextView.setTextColor(Color.BLACK)
            }
            12 -> {
                holder.myTextView.setTextColor(Color.BLACK)
            }
            14 -> {
                holder.myTextView.setBackgroundColor(Color.YELLOW)
                holder.myTextView.setTextColor(Color.BLACK)
                holder.myTextView.setPaintFlags(holder.myTextView.getPaintFlags() or Paint.UNDERLINE_TEXT_FLAG)
            }
            17 -> {
                holder.myTextView.setBackgroundColor(Color.YELLOW)
                holder.myTextView.setTextColor(Color.BLACK)
                holder.myTextView.setPaintFlags(holder.myTextView.getPaintFlags() or Paint.UNDERLINE_TEXT_FLAG)
            }
            18 -> {
                holder.myTextView.setTextColor(Color.BLACK)
            }
            22 -> {
                holder.myTextView.setTextColor(Color.BLACK)
            }
            24 -> {
                holder.myTextView.setBackgroundColor(Color.YELLOW)
                holder.myTextView.setTextColor(Color.BLACK)
                holder.myTextView.setPaintFlags(holder.myTextView.getPaintFlags() or Paint.UNDERLINE_TEXT_FLAG)
            }
            27 -> {
                holder.myTextView.setTextColor(Color.BLACK)
            }
            30 -> {
                holder.myTextView.setBackgroundColor(Color.YELLOW)
                holder.myTextView.setTextColor(Color.BLACK)
                holder.myTextView.setPaintFlags(holder.myTextView.getPaintFlags() or Paint.UNDERLINE_TEXT_FLAG)
            }
            32 -> {
                holder.myTextView.setTextColor(Color.BLACK)
            }
            37 -> {
                holder.myTextView.setBackgroundColor(Color.YELLOW)
                holder.myTextView.setTextColor(Color.BLACK)
                holder.myTextView.setPaintFlags(holder.myTextView.getPaintFlags() or Paint.UNDERLINE_TEXT_FLAG)
            }
            35 -> {
                holder.myTextView.setBackgroundColor(Color.YELLOW)
                holder.myTextView.setTextColor(Color.BLACK)
                holder.myTextView.setPaintFlags(holder.myTextView.getPaintFlags() or Paint.UNDERLINE_TEXT_FLAG)
            }
            36 -> {
                holder.myTextView.setTextColor(Color.BLACK)
            }
            38 -> {
                holder.myTextView.setTextColor(Color.BLACK)
            }
            39 -> {
                holder.myTextView.setBackgroundColor(Color.YELLOW)
                holder.myTextView.setTextColor(Color.BLACK)
                holder.myTextView.setTextColor(Color.MAGENTA)
                holder.myTextView.setPaintFlags(holder.myTextView.getPaintFlags() or Paint.UNDERLINE_TEXT_FLAG)
            }
            40 -> {
                holder.myTextView.setBackgroundColor(Color.YELLOW)
                holder.myTextView.setTextColor(Color.BLACK)
                holder.myTextView.setTextColor(Color.MAGENTA)
                holder.myTextView.setPaintFlags(holder.myTextView.getPaintFlags() or Paint.UNDERLINE_TEXT_FLAG)
            }
            42 -> {
                holder.myTextView.setTextColor(Color.BLACK)
            }
            47 -> {
                holder.myTextView.setTextColor(Color.BLACK)
            }
            52 -> {
                holder.myTextView.setTextColor(Color.BLACK)
            }
            54 -> {
                holder.myTextView.setBackgroundColor(Color.YELLOW)
                holder.myTextView.setTextColor(Color.BLACK)
                holder.myTextView.setPaintFlags(holder.myTextView.getPaintFlags() or Paint.UNDERLINE_TEXT_FLAG)
            }
            57 -> {
                holder.myTextView.setBackgroundColor(Color.YELLOW)
                holder.myTextView.setTextColor(Color.BLACK)
                holder.myTextView.setPaintFlags(holder.myTextView.getPaintFlags() or Paint.UNDERLINE_TEXT_FLAG)
            }
            58 -> {
                holder.myTextView.setTextColor(Color.BLACK)
            }
            59 -> {
                holder.myTextView.setBackgroundColor(Color.YELLOW)
                holder.myTextView.setTextColor(Color.BLACK)
                holder.myTextView.setPaintFlags(holder.myTextView.getPaintFlags() or Paint.UNDERLINE_TEXT_FLAG)
            }
            62 -> {
                holder.myTextView.setTextColor(Color.BLACK)
            }
            64 -> {
                holder.myTextView.setBackgroundColor(Color.YELLOW)
                holder.myTextView.setTextColor(Color.BLACK)
                holder.myTextView.setPaintFlags(holder.myTextView.getPaintFlags() or Paint.UNDERLINE_TEXT_FLAG)
            }
            67 -> {
                holder.myTextView.setTextColor(Color.BLACK)
            }
            72 -> {
                holder.myTextView.setTextColor(Color.BLACK)
            }
            74 -> {
                holder.myTextView.setBackgroundColor(Color.YELLOW)
                holder.myTextView.setTextColor(Color.BLACK)
                holder.myTextView.setPaintFlags(holder.myTextView.getPaintFlags() or Paint.UNDERLINE_TEXT_FLAG)
            }
            75 -> {
                holder.myTextView.setBackgroundColor(Color.YELLOW)
                holder.myTextView.setTextColor(Color.BLACK)
                holder.myTextView.setPaintFlags(holder.myTextView.getPaintFlags() or Paint.UNDERLINE_TEXT_FLAG)
            }
            76 -> {
                holder.myTextView.setBackgroundColor(Color.WHITE)
                holder.myTextView.setTextColor(Color.BLACK)
                holder.myTextView.setPaintFlags(holder.myTextView.getPaintFlags() or Paint.UNDERLINE_TEXT_FLAG)
            }
            77 -> {
                holder.myTextView.setBackgroundColor(Color.YELLOW)
                holder.myTextView.setTextColor(Color.BLACK)
                holder.myTextView.setPaintFlags(holder.myTextView.getPaintFlags() or Paint.UNDERLINE_TEXT_FLAG)
            }
            78 -> {
                holder.myTextView.setTextColor(Color.BLACK)
            }
            79 -> {
                holder.myTextView.setBackgroundColor(Color.YELLOW)
                holder.myTextView.setTextColor(Color.BLACK)
                holder.myTextView.setPaintFlags(holder.myTextView.getPaintFlags() or Paint.UNDERLINE_TEXT_FLAG)
            }
            82 -> {
                holder.myTextView.setBackgroundColor(Color.WHITE)
                holder.myTextView.setTextColor(Color.BLACK)
            }
            84 -> {
                holder.myTextView.setBackgroundColor(Color.YELLOW)
                holder.myTextView.setTextColor(Color.BLACK)
                holder.myTextView.setPaintFlags(holder.myTextView.getPaintFlags() or Paint.UNDERLINE_TEXT_FLAG)
            }
            87 -> {
                holder.myTextView.setTextColor(Color.BLACK)
            }
            92 -> {
                holder.myTextView.setTextColor(Color.BLACK)
            }
            95 -> {
                holder.myTextView.setBackgroundColor(Color.YELLOW)
                holder.myTextView.setTextColor(Color.BLACK)
                holder.myTextView.setPaintFlags(holder.myTextView.getPaintFlags() or Paint.UNDERLINE_TEXT_FLAG)
            }
            96 -> {
                holder.myTextView.setTextColor(Color.BLACK)
            }
            97 -> {
                holder.myTextView.setBackgroundColor(Color.YELLOW)
                holder.myTextView.setTextColor(Color.BLACK)
                holder.myTextView.setPaintFlags(holder.myTextView.getPaintFlags() or Paint.UNDERLINE_TEXT_FLAG)
            }
            98 -> {
                holder.myTextView.setTextColor(Color.BLACK)
            }
            99 -> {
                holder.myTextView.setBackgroundColor(Color.YELLOW)
                holder.myTextView.setTextColor(Color.BLACK)
                holder.myTextView.setPaintFlags(holder.myTextView.getPaintFlags() or Paint.UNDERLINE_TEXT_FLAG)
            }
            100 -> {
                holder.myTextView.setBackgroundColor(Color.YELLOW)
                holder.myTextView.setTextColor(Color.BLACK)
                holder.myTextView.setPaintFlags(holder.myTextView.getPaintFlags() or Paint.UNDERLINE_TEXT_FLAG)
            }
            102 -> {
                holder.myTextView.setTextColor(Color.BLACK)
            }
            104 -> {
                holder.myTextView.setBackgroundColor(Color.YELLOW)
                holder.myTextView.setTextColor(Color.BLACK)
                holder.myTextView.setPaintFlags(holder.myTextView.getPaintFlags() or Paint.UNDERLINE_TEXT_FLAG)
            }
            107 -> {
                holder.myTextView.setTextColor(Color.BLACK)
            }
            112 -> {
                holder.myTextView.setTextColor(Color.BLACK)
            }
            117 -> {
                holder.myTextView.setBackgroundColor(Color.YELLOW)
                holder.myTextView.setTextColor(Color.BLACK)
                holder.myTextView.setPaintFlags(holder.myTextView.getPaintFlags() or Paint.UNDERLINE_TEXT_FLAG)
            }
            else -> {
                holder.myTextView.setBackgroundColor(Color.WHITE)
                holder.myTextView.setTextColor(Color.WHITE)
            }
        }
    }

    // total number of cells
    override fun getItemCount(): Int {
        return mData.size
    }

    // stores and recycles views as they are scrolled off screen
    inner class ViewHolder internal constructor(itemView: View) : RecyclerView.ViewHolder(itemView),
        View.OnClickListener {

        var myTextView: TextView

        override fun onClick(view: View?) {
            var intent: Intent

           if (adapterPosition === 40) {
                intent = Intent(context, Android_SDK::class.java)
                 context.startActivity(intent)
           }else if(adapterPosition == 39){
                intent = Intent(context, File_Formats::class.java)
                context.startActivity(intent)
           } else if (mClickListener != null) mClickListener!!.onItemClick(view, adapterPosition)

        }

        init {
            myTextView = itemView.findViewById(R.id.info_text)
            itemView.setOnClickListener(this)
        }
    }

    // convenience method for getting data at click position
    fun getItem(id: Int): String {
        return mData[id]
    }

    // allows clicks events to be caught
    fun setClickListener(itemClickListener: MainActivity) {
        mClickListener = itemClickListener
    }

    // parent activity will implement this method to respond to click events
    interface ItemClickListener {
        fun onItemClick(view: View?, position: Int)
    }

}