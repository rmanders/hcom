package org.schlocknet.org.schlocknet.hcom.controller;

import org.schlocknet.org.schlocknet.hcom.model.QSOLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/api/qso/log")
public class QSOLogController {

    /**
     * Local Logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(QSOLogController.class);

    @RequestMapping(method= RequestMethod.POST, consumes = "application/json")
    public String saveQsoToLog(
            @RequestParam QSOLog qsoLog,
            HttpServletResponse response
    ) {
        LOG.debug("Got request to log a new QSO");
        return "test";
    }

}
