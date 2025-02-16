package com.imooc.sell.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.imooc.sell.common.VO.Result;
import com.imooc.sell.common.form.ProductCategoryForm;
import com.imooc.sell.entity.OrderMaster;
import com.imooc.sell.entity.ProductCategory;
import com.imooc.sell.service.IProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 类目表 前端控制器
 * </p>
 *
 * @author liuc
 * @since 2019-11-10
 */
@RestController
@RequestMapping("/productCategory")
public class ProductCategoryController implements BaseController<ProductCategory, String> {
    @Autowired
    private IProductCategoryService iProductCategoryService;

    @Override
    public Result list(ProductCategory productCategory, Page page) {
        return null;
    }
    @GetMapping("/list")
    public Result listPage(ProductCategoryForm productCategory, Page page) {

        return iProductCategoryService.listPage(productCategory,page);
    }

    @Override
    public Result insert(ProductCategory productCategory, BindingResult bindingResult) {
        return null;
    }

    @Override
    public Result update(ProductCategory productCategory, BindingResult bindingResult) {
        return null;
    }

    @Override
    public Result delete(String s) {
        return null;
    }
}
