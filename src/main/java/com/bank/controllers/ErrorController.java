package com.bank.controllers;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * Application exceptions catcher
 */
@Slf4j
@ControllerAdvice
public class ErrorController {

    /**
     * @param ex is exception which was thrown
     * @return error page
     */
    @ExceptionHandler(Exception.class)
    public ModelAndView error(Exception ex) {
        log.debug("error has occurred: " + ex);
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("error", ex.getMessage());
        return modelAndView;
    }
}
