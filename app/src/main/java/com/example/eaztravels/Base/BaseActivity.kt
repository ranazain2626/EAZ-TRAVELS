package com.example.eaztravels.Base;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.content.ContextCompat
import com.afollestad.materialdialogs.MaterialDialog
import com.afollestad.materialdialogs.customview.customView
import com.afollestad.materialdialogs.customview.getCustomView
import com.example.eaztravels.R
import com.example.eaztravels.Utils.ProgressBarHandler

public open class BaseActivity : AppCompatActivity() {

    private var progressBarHanlder: ProgressBarHandler? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

     fun showProgress() {
        if (progressBarHanlder == null) {
            progressBarHanlder = ProgressBarHandler(this)
        }
        progressBarHanlder!!.show(this)
    }

    fun hideProgress() {
        if (progressBarHanlder != null) {
            progressBarHanlder?.hide()
        }
    }

     fun showMessage(message: String) {
        /* Alerter.create(this)
                 .setTitle("Alert")
                 .setText(message)
                 .setDuration(2000)
                 .show()*/

/*        val customdialog = Dialog(this, android.R.style.Theme_Translucent_NoTitleBar)
        val window = customdialog.getWindow()
        window.setLayout(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT)
        window.setGravity(Gravity.CENTER)*/

        val dialog = MaterialDialog(this)
            .customView(R.layout.dialog_msg, null, true)
        dialog.window!!.setBackgroundDrawable(ContextCompat.getDrawable(this, android.R.color.transparent))
        val view = dialog.getCustomView()

        val edtMsg = view?.findViewById(R.id.txtMedicationName) as AppCompatTextView

        edtMsg.text = message

        val txtUpdate = view?.findViewById(R.id.txtUpdate) as AppCompatTextView

        txtUpdate.setOnClickListener {

            dialog.dismiss()
        }
        if (!dialog.isShowing) {
            dialog.show()
        }
    }
}
