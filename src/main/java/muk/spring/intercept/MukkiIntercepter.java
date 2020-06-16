package muk.spring.intercept;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MukkiIntercepter implements HandlerInterceptor {

	
	 public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
	        long startTime = System.currentTimeMillis();
	        request.setAttribute("startTime", startTime);
	        return true;
	    }

	    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
	        long endTime = System.currentTimeMillis();
	        long startTime = (Long) request.getAttribute("startTime");
	        System.out.println("Processing this request " + request.getRequestURI() + " took " + (endTime - startTime)+" milli seconds..");
	    }
}
