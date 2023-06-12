package com.sesac.reuse.item.model.recycle_guide.category;
import java.util.Arrays;
import java.util.List;

public class RecycleCategory {

    private final static List<String> RECYCLE_CATEGORY_NAMES = Arrays.asList("PAPER", "STEEL", "PLASTIC");
    int id;
    String name;



    /* 사용 안할 구 코드임
    //일급 컬렉션
//
//    final List<RecycleSubCategory> subCategories;
//
//    public RecycleCategory(final List<RecycleSubCategory> subCategories) {
//        this.subCategories = subCategories;
//    }
*/
}
