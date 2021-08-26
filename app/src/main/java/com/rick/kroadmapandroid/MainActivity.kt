package com.rick.kroadmapandroid

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity(), MyRecyclerViewAdapter.ItemClickListener {

    private var adapter: MyRecyclerViewAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // data to populate the RecyclerView with
        val data = arrayOf(
            "001", "002", "START", "004", "005",
            "006", "007", " | ", "009", "010",
            "011", "012", " | ", "014", "Kotlin",
            "016", "017", "Programming Language", " < ", "020",
            "021", "022", " | ", "024", "Java",
            "026", "027", " | ", "029", "030",
            "Debugger", "032", " | ", "034", "035",
            "CPU Profiler", " ≡ ", "Android Studio", " - ", "File Formats",
            "Android SDK", "042", " | ", "044", "045",
            "046", "047", " | ", "049", "050",
            "051", "052", " | ", "054", "Data Backup",
            "056", "057", "App Manifest", " ≡ ", "Permissions",
            "061", "062", " | ", "064", "APP Components",
            "066", "067", " | ", "069", "060",
            "071", "072", " | ", "074", "BroadCast Receiver",
            "Activity", " - ", "APP Components", " ≡ ", "Service",
            "081", "082", " | ", "084", "Intent",
            "", "087", " | ", "089", "090",
            "091", "092", " | ", "094", "095",
            "Resources", " > ", "User Interface", " < ", "UI Components",
            "Fragments", "102", " | ", "104", "UI Layouts",
            "106", "107", " | ", "109", "110",
            "111", "112", " | ", "114", "115",
            "116", "117", "More User Interface", "119", "120",
            "121", "122", "123", "124", "125",
            "126", "127", "128", "129", "130",
            "131", "132", "133", "134", "135",
            "136", "137", "138", "139", "140",
            "141", "142", "143", "144", "145",
            "146", "147", "148", "149", "150",
            "151", "152", "153", "154", "155",
            "156", "157", "158", "159", "160",
            "161", "162", "163", "164", "165",
            "166", "167", "168", "169", "160",
            "171", "172", "173", "174", "175",
            "176", "177", "178", "179", "180",
            "181", "182", "183", "184", "185",
            "186", "187", "188", "189", "190",
            "191", "192", "193", "194", "195",
            "196", "197", "198", "199", "200"
        )

        // set up the RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.rvNumbers)
        val numberOfColumns = 5
        recyclerView.layoutManager = GridLayoutManager(this, numberOfColumns)
        adapter = MyRecyclerViewAdapter(data, this)
        adapter?.setClickListener(this)
        recyclerView.adapter = adapter
    }

    override fun onItemClick(view: View?, position: Int) {

        Log.i("TAG",
            "You clicked number " + adapter?.getItem(position)
                .toString() + ", which is at cell position " + position
        )

    }
}