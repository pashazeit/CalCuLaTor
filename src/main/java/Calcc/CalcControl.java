package Calcc;

/**
 * Created by Zeit on 10.01.2017.
 */

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CalcControl {

    protected static final String A = "A";
    protected static final String B = "B";


    @RequestMapping("plus")
    public ModelAndView addd(HttpServletRequest request,
                             HttpServletResponse response) throws Exception {
        Integer numberA = Integer.parseInt(request.getParameter(A));
        Integer numberB = Integer.parseInt(request.getParameter(B));
        Integer result = numberA + numberB;
        return new ModelAndView("index", "result", result.toString());
    }


    @RequestMapping("minus")
    public ModelAndView subtract(HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        Integer numberA = Integer.parseInt(request.getParameter(A));
        Integer numberB = Integer.parseInt(request.getParameter(B));
        Integer result = numberA - numberB;
        return new ModelAndView("index", "result", result.toString());
    }

    @RequestMapping("multiply")
    public ModelAndView multiply(HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        Integer numberA = Integer.parseInt(request.getParameter(A));
        Integer numberB = Integer.parseInt(request.getParameter(B));
        Integer result = numberA * numberB;
        return new ModelAndView("index", "result", result.toString());
    }

    @RequestMapping("divide")
    public ModelAndView divide(HttpServletRequest request,
                               HttpServletResponse response) throws Exception {
        Integer numberA = Integer.parseInt(request.getParameter(A));
        Integer numberB = Integer.parseInt(request.getParameter(B));
        Integer result = numberA / numberB;
        return new ModelAndView("index", "result", result.toString());
    }

}