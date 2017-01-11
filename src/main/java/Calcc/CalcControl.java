package Calcc;

/**
 * Created by Zeit on 10.01.2017.
 */

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CalcControl {

    @RequestMapping("plus")
    public ModelAndView getDetails(
            @RequestParam(value = "A") int param1,
            @RequestParam(value = "B") int param2) {
        Integer result = param1 + param2;

        return new ModelAndView("index", "result", result.toString());
    }

    @RequestMapping("minus")
    public ModelAndView subtract(
            @RequestParam(value = "A") int param1,
            @RequestParam(value = "B") int param2) {
        Integer result = param1 - param2;
        return new ModelAndView("index", "result", result.toString());
    }

    @RequestMapping("multiply")
    public ModelAndView multiply(
            @RequestParam(value = "A") int param1,
            @RequestParam(value = "B") int param2) {
        Integer result = param1 * param2;
        return new ModelAndView("index", "result", result.toString());
    }

    @RequestMapping("divide")
    public ModelAndView divide(
            @RequestParam(value = "A") int param1,
            @RequestParam(value = "B") int param2) {
        Integer result = param1 / param2;
        return new ModelAndView("index", "result", result.toString());
    }

}