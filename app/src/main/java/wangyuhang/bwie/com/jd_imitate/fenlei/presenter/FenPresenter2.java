package wangyuhang.bwie.com.jd_imitate.fenlei.presenter;


import wangyuhang.bwie.com.jd_imitate.fenlei.bean.ErJiLieBiao;
import wangyuhang.bwie.com.jd_imitate.fenlei.model.FenModel2;
import wangyuhang.bwie.com.jd_imitate.fenlei.view.FenView2;

/**
 * Created by lenovo on 2018/3/9.
 */

public class FenPresenter2 {
    FenModel2 fenModel2;
    FenView2 fenView2;

    public FenPresenter2(FenView2 fenView2) {
        this.fenView2 = fenView2;
        fenModel2=new FenModel2();
    }

    public void getFenPresenter(String s){
        fenModel2.getFenLei(s);
        fenModel2.getFenModel(new FenModel2.NewFenModel() {
            @Override
            public void getSuccess(ErJiLieBiao erJiLieBiao) {
                fenView2.OnSuccess(erJiLieBiao);
            }
        });
    }
}
