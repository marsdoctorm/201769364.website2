package com.comp208.controller;
import com.comp208.entity.UserInformation;
import com.comp208.response.BaseResponse;
import com.comp208.implementation.UserInformationService;
import com.comp208.tool.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Random;


@Controller
public class veritycodeController {

    @Resource
    private UserInformationService userInformationService;
    private static final Logger log = LoggerFactory.getLogger(veritycodeController.class);

    //send the Email to the phone
    @RequestMapping(value = "sendCode.do", method = {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    public BaseResponse sendEmail(HttpServletRequest req, HttpServletResponse res,
                                  @RequestParam String phone, @RequestParam String action,
                                  @RequestParam String token) {
        res.setContentType("text/html;charset=UTF-8");
        //token，防止重复提交
        String sendCodeToken = (String) req.getSession().getAttribute("token");
        if (StringUtils.getInstance().isNullOrEmpty(sendCodeToken) || !sendCodeToken.equals(token)) {
            return BaseResponse.fail();
        }
        //如果是忘记密码提交的发送短信
        if ("forget".equals(action)) {
            if (!isUserPhoneExists(phone)) {
                //fail
                return BaseResponse.fail();
            }
        } else if ("register".equals(action)) {
            //fail
            if (isUserPhoneExists(phone)) {
                return BaseResponse.fail();
            }
        }
        //get the random num to phone which should check the phone to judge the phone is belong user
        getRandomForCodePhone(req);
        String ra = (String) req.getSession().getAttribute("codePhone");
        String text1 = "Your verify code is: ";
        String text2 = ", please protect your verification code to prevent leakage。";
        String text = text1 + ra + text2;

        req.getSession().setAttribute("phone", phone);

        return BaseResponse.success("success", text);
    }

    // get the random phone`s code
    private void getRandomForCodePhone(HttpServletRequest req) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            sb.append(random.nextInt(10));
        }
        log.info("verification code={}", sb);
        System.out.println(sb.toString());
        req.getSession().setAttribute("codePhone", sb.toString());
    }

//    //检验验证码
//    private boolean checkPhoto(String photo, HttpServletRequest request) {
//        photo = photo.toLowerCase();
//        String true_photo = (String) request.getSession().getAttribute("rand");
//        return true_photo.equals(photo);
//    }

    //To determine whether the user's mobile phone number exists
    private boolean isUserPhoneExists(String phone) {
        try {
            int id = userInformationService.selectIdByPhone(phone);
            if (id == 0) {
                return false; // 没有找到匹配的用户记录，返回 false
            }
            UserInformation userInformation = userInformationService.selectByPrimaryKey(id);

            // 检查返回的用户信息是否为空
            if (userInformation == null || StringUtils.getInstance().isNullOrEmpty(userInformation.getPhone())) {
                return false; // 用户信息为空或用户手机号为空，返回 false
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false; // 出现异常，返回 false
        }
        return true;
    }

}