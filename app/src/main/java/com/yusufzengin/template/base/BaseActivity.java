package com.yusufzengin.template.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;

import com.yusufzengin.template.R;

import butterknife.ButterKnife;
import dagger.android.support.DaggerAppCompatActivity;

public abstract class BaseActivity extends DaggerAppCompatActivity implements BaseContract.View {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showMessageDialog(String message) {
        new AlertDialog.Builder(this)
                .setTitle(null)
                .setMessage(message)
                .setPositiveButton(getString(R.string.all_okay), (dialog, which) -> {})
                .setCancelable(true)
                .show();
    }

    @Override
    public void showMessageDialog(String title, String message) {
        new AlertDialog.Builder(this)
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton(getString(R.string.all_okay), (dialog, which) -> {})
                .setCancelable(true)
                .show();
    }

    /**
     * @return the id of the layout file for the child class
     */
    protected abstract int getLayout();
}
