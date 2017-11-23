//package cn.test.controller;
//
//import org.springframework.web.servlet.HandlerExceptionResolver;
//import org.springframework.web.servlet.ModelAndView;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.util.HashMap;
//import java.util.Map;
//
//public class CustomException implements HandlerExceptionResolver{
//    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object o, Exception e) {
//        Map<String,Object> map = new HashMap<String, Object>();
//        map.put("success",false);
//        if (e instanceof BusinessException){
//            map.put("errorMsg",e.getMessage());
//        }else {
//            map.put("errorMsg","系统异常");
//        }
//        e.printStackTrace();
//        return new ModelAndView("error",map);
//    }
//}
