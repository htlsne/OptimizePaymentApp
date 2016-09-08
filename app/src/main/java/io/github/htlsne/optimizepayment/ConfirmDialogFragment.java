package io.github.htlsne.optimizepayment;


import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class ConfirmDialogFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        // Get the layout inflater
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View layout = inflater.inflate(R.layout.fragment_confirm_dialog, null);
        TextView textViewPayment = (TextView) layout.findViewById(R.id.textView_dialog_payment);
        TextView textViewChange = (TextView) layout.findViewById(R.id.textView_dialog_change);
        int payment = getArguments().getInt("payment");
        int change = getArguments().getInt("change");
        textViewPayment.setText(Integer.toString(payment));
        textViewChange.setText(Integer.toString(change));

        builder.setView(layout)
                .setPositiveButton("支払う", null)
                .setNegativeButton("キャンセル", null);

        // 表示
        return builder.create();
    }

}