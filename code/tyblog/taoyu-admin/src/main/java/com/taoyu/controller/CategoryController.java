package com.taoyu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.alibaba.excel.EasyExcel;
import com.alibaba.fastjson.JSON;
import com.taoyu.domain.ResponseResult;
import com.taoyu.domain.entity.Category;
import com.taoyu.domain.enums.AppHttpCodeEnum;
import com.taoyu.domain.vo.CategoryVo;
import com.taoyu.domain.vo.ExcelCategoryVo;
import com.taoyu.domain.vo.PageVo;
import com.taoyu.service.CategoryService;
import com.taoyu.utils.BeanCopyUtils;
import com.taoyu.utils.WebUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;


@RestController
@RequestMapping("/content/category")
public class CategoryController {
    
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/listAllCategory")
    public ResponseResult listAllCategory(){
        List<CategoryVo> list = categoryService.listAllCategory();
        return ResponseResult.okResult(list);
    }

    @GetMapping("/list")
    public ResponseResult list(Category category, Integer pageNum, Integer pageSize) {
        PageVo pageVo = categoryService.selectCategoryPage(category,pageNum,pageSize);
        return ResponseResult.okResult(pageVo);
    }

    @PutMapping
    public ResponseResult edit(@RequestBody Category category){
        categoryService.updateById(category);
        return ResponseResult.okResult();
    }

    @DeleteMapping(value = "/{id}")
    public ResponseResult remove(@PathVariable(value = "id")Long id){
        categoryService.removeById(id);
        return ResponseResult.okResult();
    }

    @GetMapping(value = "/{id}")
    public ResponseResult getInfo(@PathVariable(value = "id")Long id){
        Category category = categoryService.getById(id);
        return ResponseResult.okResult(category);
    }

    @PostMapping
    public ResponseResult add(@RequestBody Category category){
        categoryService.save(category);
        return ResponseResult.okResult();
    }

    @GetMapping("/export")
    @PreAuthorize("@ps.hasPermission('content:category:export')")
    public void export(HttpServletResponse response){
        try {
            //??????????????????????????????
            WebUtils.setDownLoadHeader("??????.xlsx",response);
            //???????????????????????????
            List<Category> categoryVos = categoryService.list();

            List<ExcelCategoryVo> excelCategoryVos = BeanCopyUtils.copyBeanList(categoryVos, ExcelCategoryVo.class);
            //??????????????????Excel???
            EasyExcel.write(response.getOutputStream(), ExcelCategoryVo.class).autoCloseStream(Boolean.FALSE).sheet("????????????")
                    .doWrite(excelCategoryVos);

        } catch (Exception e) {
            //??????????????????????????????json
            ResponseResult result = ResponseResult.errorResult(AppHttpCodeEnum.SYSTEM_ERROR);
            WebUtils.renderString(response, JSON.toJSONString(result));
        }
    }    
}
