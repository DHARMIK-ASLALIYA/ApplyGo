/**
 * ====================================================================
 * Project: ApplyFlow Config Server
 * Description: This file defines a custom annotation, @EnableDotenv, which imports
 *              the DotenvConfiguration. This configuration initializes the
 *              SetEnvironmentVariables bean to load environment variables from a
 *              .env file during application startup.
 * ====================================================================
 */

package com.applygo.applyflow.services

import com.applygo.applyflow.logic.SetEnvironmentVariables
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@Import(DotenvConfiguration::class)
annotation class EnableDotenv

@Configuration
class DotenvConfiguration {

    @Bean
    fun setEnvVariables(): SetEnvironmentVariables {
        return SetEnvironmentVariables().apply { setENV() }
    }

}
