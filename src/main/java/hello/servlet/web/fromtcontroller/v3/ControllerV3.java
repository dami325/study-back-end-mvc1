package hello.servlet.web.fromtcontroller.v3;

import hello.servlet.web.fromtcontroller.ModelView;

import java.util.Map;

public interface ControllerV3 {

    ModelView process(Map<String,String> paramMap);
}
