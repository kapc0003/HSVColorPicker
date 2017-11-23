package ca.edumedia.kapc0003.hsvcolorpicker;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/**
 * Purpose/Description
 *
 * About Dialog, provides information about the app (displays the authors details).
 *
 * @author Alison Kapcala (kapc0003@algonquinlive.com)
 */

public class AboutDialogFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setTitle(R.string.action_about)
                .setMessage(getString(R.string.author))
                .setCancelable(false)
                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

        return builder.create();
    }
}