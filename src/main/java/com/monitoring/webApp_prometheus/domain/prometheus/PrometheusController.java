package com.monitoring.webApp_prometheus.domain.prometheus;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrometheusController {

    @GetMapping("/end1")
    public String end1() {
        return "end1";
    }

    @GetMapping("/end2")
    public String end2() {
        return "end2";
    }

}
