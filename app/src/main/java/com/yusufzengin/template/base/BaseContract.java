package com.yusufzengin.template.base;

public interface BaseContract {

    interface View {

        void showLoading();

        void hideLoading();

        void showMessageDialog(String message);

        void showMessageDialog(String title, String message);
    }

    interface Presenter<V> {

        void onAttach(V view);

        void onDetach();
    }
}
