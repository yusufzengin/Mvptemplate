package com.yusufzengin.template.base;

public class BasePresenter<V> implements BaseContract.Presenter<V> {

    private V view;

    @Override
    public void onAttach(V view) {
        this.view = view;
    }

    @Override
    public void onDetach() {
        view = null;
    }

    protected V view() {
        return view;
    }
}
