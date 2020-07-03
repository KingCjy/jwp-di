package core.mvc.tobe.support;

import core.annotation.Component;
import core.mvc.tobe.MethodParameter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class HttpResponseArgumentResolver implements ArgumentResolver {

    @Override
    public boolean supports(MethodParameter methodParameter) {
        return methodParameter.getType() == HttpServletResponse.class;
    }

    @Override
    public Object resolveArgument(MethodParameter methodParameter, HttpServletRequest request, HttpServletResponse response) {
        return response;
    }
}
