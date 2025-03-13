package com.applygo.applyflow.helpers

import com.applygo.applyflow.objects.Helper
import com.applygo.applyflow.objects.RequestInterception
import feign.RequestInterceptor
import org.springframework.context.annotation.Bean
import org.springframework.http.HttpHeaders
import org.springframework.web.context.request.RequestContextHolder
import org.springframework.web.context.request.ServletRequestAttributes

@Helper
@RequestInterception
class FeignClientHelper {

    @Bean
    fun authorizationTokenPropagator() = RequestInterceptor { template ->
        val request = (RequestContextHolder.getRequestAttributes() as? ServletRequestAttributes)?.request
        request?.getHeader(HttpHeaders.AUTHORIZATION)?.let { template.header(HttpHeaders.AUTHORIZATION, it) }
    }

}
