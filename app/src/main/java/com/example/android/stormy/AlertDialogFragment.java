package com.example.android.stormy;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

/**
 * Created by ABhimsaria on 5/5/2016.
 */
public class AlertDialogFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context context = getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Oops Sorry!")
                .setMessage("There was an error please try again.")
                .setPositiveButton("OK",null);
        AlertDialog dialog = builder.create();
        return dialog;
    }
}
