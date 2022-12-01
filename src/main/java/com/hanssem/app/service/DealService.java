package com.hanssem.app.service;

import com.hanssem.app.dao.DealDao;
import com.hanssem.app.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DealService {

    @Autowired
    DealDao dealDao;

    // 특정 상품의 정보 불러오기
    public ProductDto getInfo(Integer product_number) {
        return dealDao.select(product_number);
    }
    // 특정 상품의 이미지와 색상 불러오기
    public List<ImageColorDto> showImgColor(Integer product_number) {
        return dealDao.selectImgColor(product_number);
    }
    public List<SizeCodeDto> show3(Integer product_number) {
        return dealDao.selectSize(product_number);
    }
    public List<ProductSizeColorDto> getColor(Map map){
        return dealDao.selectSizeColor(map);
    }
}
