package com.nelson.school.manage.ui.controller;

import com.nelson.school.manage.infra.exception.ParamValidationException;
import com.nelson.school.manage.infra.exception.ServiceException;
import com.nelson.school.manage.share.common.ModelAndView;
import com.nelson.school.manage.ui.bean.result.StudentDetailResultBean;
import com.nelson.school.manage.application.query.service.StudentQueryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author nelson
 * @Desc student controller
 * @date 2021/3/28 2:46 下午
 */
@Controller
@Slf4j
public class StudentController {

    @Autowired
    private StudentQueryService studentManager;

    @RequestMapping("/data/student/{id}/detail")
    @ResponseBody
    public ModelAndView<StudentDetailResultBean> getStudentDetail(@PathVariable("id") long id) {
        try {
            return ModelAndView.success(studentManager.getStudentDetail(id));
        } catch (ParamValidationException pe) {
            log.error("参数错误", pe);
            return ModelAndView.failed("参数错误");
        } catch (ServiceException se) {
            log.error("服务内部错误", se);
            return ModelAndView.failed("服务内部错误");
        }
        catch (Exception e) {
            log.error(e.getMessage(), e);
            return ModelAndView.failed(e.getMessage());
        }
    }
}
