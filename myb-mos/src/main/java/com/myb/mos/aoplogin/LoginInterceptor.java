package com.myb.mos.aoplogin;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.myb.entity.pojo.mos.Employee;
import com.myb.entity.pojo.mos.User;
import com.myb.mos.VO.RoleVO;
  
  
/** 
 * 
 * 2014-8-1 
 */  
public class LoginInterceptor extends HandlerInterceptorAdapter{  
    private final Logger log = LoggerFactory.getLogger(LoginInterceptor.class);  
    public static final String LAST_PAGE = "com.alibaba.lastPage";  
    /* 
     * 利用正则映射到需要拦截的路径     
      
    private String mappingURL; 
     
    public void setMappingURL(String mappingURL) {     
               this.mappingURL = mappingURL;     
    }    
  */  
    /**  
     * 在业务处理器处理请求之前被调用  
     * 如果返回false  
     *     从当前的拦截器往回执行所有拦截器的afterCompletion(),再退出拦截器链 
     * 如果返回true  
     *    执行下一个拦截器,直到所有的拦截器都执行完毕  
     *    再执行被拦截的Controller  
     *    然后进入拦截器链,  
     *    从最后一个拦截器往回执行所有的postHandle()  
     *    接着再从最后一个拦截器往回执行所有的afterCompletion()  
     */    
    @Override    
    public boolean preHandle(HttpServletRequest request,    
            HttpServletResponse response, Object handler) throws Exception { 
    	List<RoleVO> roleVOs = (List<RoleVO>)request.getSession().getAttribute("roleVOs");
    	if (roleVOs != null) {
    		//直营和渠道
    		if (request.getQueryString() != null && request.getQueryString().contains("isqudao")) {
    			roleVOs.get(0).setQudaoCount(-1);
    		}
    		if (request.getQueryString() != null && request.getQueryString().contains("zy")) {
    			roleVOs.get(0).setZhiyingCount(-1);
    		}
    		//账号异常处理
    		if (request.getQueryString() != null && request.getQueryString().contains("modify")) {
    			roleVOs.get(0).setExceptionModify(-1);
    		}
    		if (request.getQueryString() != null && request.getQueryString().contains("delay")) {
    			roleVOs.get(0).setExceptionDelay(-1);
    		}
    	}
    	String requestUri = request.getRequestURI();
    	Employee employee =  (Employee)request.getSession().getAttribute("loginUser");   
        if(employee == null){  
        	if (requestUri.contains("free")||requestUri.contains("registerFree")||requestUri.contains("bmap") ) {
        		
        		return false;
        	} else {
        		
        		log.info("Interceptor：跳转到login页面！"); 
        		response.sendRedirect("/myb-mos");
        		return false;
        	}
        }else{
        	return true;     
        }  
    }    
    
    /** 
     * 在业务处理器处理请求执行完成后,生成视图之前执行的动作    
     * 可在modelAndView中加入数据，比如当前时间 
     */  
    @Override    
    public void postHandle(HttpServletRequest request,    
            HttpServletResponse response, Object handler,    
            ModelAndView modelAndView) throws Exception {     
        if(modelAndView != null){  //加入当前时间    
            modelAndView.addObject("var", "测试postHandle");    
        }    
    }    
    
    /**  
     * 在DispatcherServlet完全处理完请求后被调用,可用于清理资源等   
     *   
     * 当有拦截器抛出异常时,会从当前拦截器往回执行所有的拦截器的afterCompletion()  
     */    
    @Override    
    public void afterCompletion(HttpServletRequest request,    
            HttpServletResponse response, Object handler, Exception ex)    
            throws Exception {    
    }    
  
}    